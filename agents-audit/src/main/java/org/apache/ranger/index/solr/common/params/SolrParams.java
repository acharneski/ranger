package org.apache.ranger.index.solr.common.params;

public class SolrParams {
    public final org.apache.solr.common.params.SolrParams inner;

    public SolrParams(org.apache.solr.common.params.SolrParams toSolrParams) {
        this.inner = toSolrParams;
    }

    public String get(String authFieldProp, String defaultAuthField) {
        return inner.get(authFieldProp, defaultAuthField);
    }

    public boolean getBool(String enabledProp, boolean b) {
        return inner.getBool(enabledProp, b);
    }

    public String toQueryString() {
        return inner.toQueryString();
    }
}
