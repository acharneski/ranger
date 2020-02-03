package org.apache.ranger.index.solr.common.util;

import org.apache.ranger.index.solr.common.params.SolrParams;

public class NamedList<O> {
    public final org.apache.solr.common.util.NamedList<O> inner;

    public NamedList(org.apache.solr.common.util.NamedList<O> response) {
        this.inner = response;
    }

    public SolrParams toSolrParams() {
        return new SolrParams(inner.toSolrParams());
    }

    public O get(String name) {
        return inner.get(name);
    }

    public int size() {
        return inner.size();
    }

    public String getName(int i) {
        return inner.getName(i);
    }
}
