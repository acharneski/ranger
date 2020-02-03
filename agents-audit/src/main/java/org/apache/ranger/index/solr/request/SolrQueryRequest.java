package org.apache.ranger.index.solr.request;

import org.apache.ranger.index.solr.core.SolrCore;

import java.util.Map;

public class SolrQueryRequest {
    public final org.apache.solr.request.SolrQueryRequest inner;

    public SolrQueryRequest(org.apache.solr.request.SolrQueryRequest inner) {
        this.inner = inner;
    }

    public SolrCore getCore() {
        return new SolrCore(inner.getCore());
    }

    public Map<Object, Object> getContext() {
        return inner.getContext();
    }
}
