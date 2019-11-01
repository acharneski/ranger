package org.apache.ranger.index.solr.client.solrj.impl;

import org.apache.ranger.index.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.ClusterStateProvider;
import org.apache.solr.client.solrj.impl.LBHttpSolrClient;
import org.apache.ranger.index.solr.common.cloud.ZkStateReader;

import java.util.List;
import java.util.Optional;

public class CloudSolrClient extends SolrClient {

    public final org.apache.solr.client.solrj.impl.CloudSolrClient inner;

    public CloudSolrClient(org.apache.solr.client.solrj.impl.CloudSolrClient inner) {
        super(inner);
        this.inner = inner;
    }

    public void setDefaultCollection(String collectionName) {
        inner.setDefaultCollection(collectionName);
    }

    public LBHttpSolrClient getLbClient() {
        return inner.getLbClient();
    }

    public ZkStateReader getZkStateReader() {
        return new ZkStateReader(inner.getZkStateReader());
    }

    public ClusterStateProvider getClusterStateProvider() {
        return this.inner.getClusterStateProvider();
    }

    public static class Builder {
        public final org.apache.solr.client.solrj.impl.CloudSolrClient.Builder inner;

        public Builder(List<String> zkhosts, Optional<String> empty) {
            inner = new org.apache.solr.client.solrj.impl.CloudSolrClient.Builder(zkhosts, empty);
        }

        public CloudSolrClient build() {
            return new CloudSolrClient(inner.build());
        }
    }

    public void connect() {
        inner.connect();
    }
}
