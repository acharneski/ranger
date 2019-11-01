package org.apache.ranger.index.solr.request;

public class LocalSolrQueryRequest extends SolrQueryRequest {
    public LocalSolrQueryRequest() {
        super(new org.apache.solr.request.SolrQueryRequest());
    }
}
