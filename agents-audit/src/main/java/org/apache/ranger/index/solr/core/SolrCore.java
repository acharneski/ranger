package org.apache.ranger.index.solr.core;

public class SolrCore {
    public final org.apache.solr.core.SolrCore inner;

    public SolrCore(org.apache.solr.core.SolrCore inner) {
        this.inner = inner;
    }

    public SolrConfig getSolrConfig() {
        return new SolrConfig(inner.getSolrConfig());
    }
}
