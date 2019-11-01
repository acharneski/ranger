package org.apache.ranger.index.solr.client.solrj.response;

import org.apache.ranger.index.solr.common.SolrDocumentList;
import org.apache.ranger.index.solr.common.util.NamedList;

public class QueryResponse {
    private final org.apache.solr.client.solrj.response.QueryResponse inner;

    public QueryResponse(org.apache.solr.client.solrj.response.QueryResponse response) {
        this.inner = response;
    }

    public int getStatus() {
        return inner.getStatus();
    }

    public SolrDocumentList getResults() {
        return new SolrDocumentList(inner.getResults());
    }

    public NamedList<Object> getResponse() {
        return new NamedList<>(inner.getResponse());
    }
}
