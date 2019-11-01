package org.apache.ranger.index.solr.common;

public class SolrInputField {
    private final org.apache.solr.common.SolrInputField inner;

    public SolrInputField(org.apache.solr.common.SolrInputField field) {
        this.inner = field;
    }
}
