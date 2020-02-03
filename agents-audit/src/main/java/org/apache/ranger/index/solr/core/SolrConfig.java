package org.apache.ranger.index.solr.core;

public class SolrConfig {
    public final org.apache.solr.core.SolrConfig inner;

    public SolrConfig(org.apache.solr.core.SolrConfig inner) {
        this.inner = inner;
    }

    public boolean getBool(String s, boolean b) {
        return inner.getBool(s,b);
    }
}
