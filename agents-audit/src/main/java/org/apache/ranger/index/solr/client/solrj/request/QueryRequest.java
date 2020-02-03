package org.apache.ranger.index.solr.client.solrj.request;

import org.apache.ranger.index.solr.client.solrj.SolrClient;
import org.apache.ranger.index.solr.client.solrj.SolrQuery;
import org.apache.ranger.index.solr.client.solrj.SolrRequest.METHOD;
import org.apache.ranger.index.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.SolrServerException;

import java.io.IOException;

public class QueryRequest {
    public final org.apache.solr.client.solrj.request.QueryRequest inner;

    public QueryRequest(SolrQuery solrQuery, METHOD post) {
        inner = new org.apache.solr.client.solrj.request.QueryRequest(solrQuery.inner, post.inner);
    }

    public QueryRequest(SolrQuery query) {
        inner = new org.apache.solr.client.solrj.request.QueryRequest(query.inner);
    }

    public void setBasicAuthCredentials(String username, String password) {
        inner.setBasicAuthCredentials(username, password);
    }

    public QueryResponse process(SolrClient solrClient) throws IOException, SolrServerException {
        return new QueryResponse(inner.process(solrClient.inner));
    }
}
