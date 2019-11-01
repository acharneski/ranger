package org.apache.ranger.index.solr.common.params;

public class ModifiableSolrParams {
    public final org.apache.solr.common.params.ModifiableSolrParams inner;

    public ModifiableSolrParams(SolrParams params) {
        inner = new org.apache.solr.common.params.ModifiableSolrParams(params.inner);
    }

    public void add(String fq, String filterQuery) {
        inner.add(fq, filterQuery);
    }
}
