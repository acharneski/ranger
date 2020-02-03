package org.apache.ranger.index.solr.common;

public class SolrDocument {
    private final org.apache.solr.common.SolrDocument inner;

    public SolrDocument(org.apache.solr.common.SolrDocument document) {
        this.inner = document;
    }

    public Object getFieldValue(String id) {
        return inner.getFieldValue(id);
    }
}
