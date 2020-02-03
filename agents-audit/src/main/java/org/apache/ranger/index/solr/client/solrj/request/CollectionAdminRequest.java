package org.apache.ranger.index.solr.client.solrj.request;

import org.apache.ranger.index.solr.SolrClient;
import org.apache.ranger.index.solr.client.solrj.SolrResponse;
import org.apache.ranger.index.solr.client.solrj.SolrServerException;
import org.apache.ranger.index.solr.client.solrj.response.CollectionAdminResponse;

import java.io.IOException;

public class CollectionAdminRequest<T extends CollectionAdminResponse> {
    public final org.apache.solr.client.solrj.request.CollectionAdminRequest<org.apache.solr.client.solrj.response.CollectionAdminResponse> inner;

    public CollectionAdminRequest(org.apache.solr.client.solrj.request.CollectionAdminRequest<org.apache.solr.client.solrj.response.CollectionAdminResponse> inner) {
        this.inner = inner;
    }

    public static Create createCollection(String solr_collection_name, String solr_config_name, int no_of_shards, int no_of_replicas) {
        return new Create(org.apache.solr.client.solrj.request.CollectionAdminRequest.createCollection(solr_collection_name, solr_config_name, no_of_shards, no_of_replicas));
    }

    public void setBasicAuthCredentials(String username, String decPassword) {
        inner.setBasicAuthCredentials(username, decPassword);
    }

    public SolrResponse process(SolrClient solrClient) throws IOException, SolrServerException {
        try {
            return new SolrResponse(inner.process(solrClient.inner));
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
            throw new SolrServerException(e);
        }
    }

    public static class Create {
        private final org.apache.solr.client.solrj.request.CollectionAdminRequest.Create inner;

        public Create(org.apache.solr.client.solrj.request.CollectionAdminRequest.Create collection) {
            this.inner = collection;
        }

        public void setMaxShardsPerNode(int max_node_per_shards) {
            inner.setMaxShardsPerNode(max_node_per_shards);
        }

        public CollectionAdminResponse process(SolrClient solrClient) throws IOException, SolrServerException {
            try {
                return new CollectionAdminResponse(inner.process(solrClient.inner));
            } catch (org.apache.solr.client.solrj.SolrServerException e) {
                throw new SolrServerException(e);
            }
        }
    }

    public static class List<T extends CollectionAdminResponse> extends CollectionAdminRequest<T> {
        public List() {
            super(new org.apache.solr.client.solrj.request.CollectionAdminRequest.List());
        }

        public CollectionAdminResponse process(SolrClient solrClient) throws SolrServerException, IOException {
            try {
                return new CollectionAdminResponse(inner.process(solrClient.inner));
            } catch (org.apache.solr.client.solrj.SolrServerException e) {
                throw new SolrServerException(e);
            } catch (IOException e) {
                throw e;
            }
        }
    }
}
