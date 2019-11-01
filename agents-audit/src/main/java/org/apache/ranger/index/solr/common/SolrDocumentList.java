package org.apache.ranger.index.solr.common;

public class SolrDocumentList {
    private final org.apache.solr.common.SolrDocumentList inner;

    public SolrDocumentList(org.apache.solr.common.SolrDocumentList documents) {
        this.inner = documents;
    }

    public int size() {
        return inner.size();
    }

    public SolrDocument get(int i) {
        return new SolrDocument(inner.get(i));
    }

    public long getNumFound() {
        return inner.getNumFound();
    }

    public long getStart() {
        return inner.getStart();
    }
}
