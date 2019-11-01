package org.apache.ranger.index.solr.common;

public class SolrInputDocument {
    public final org.apache.solr.common.SolrInputDocument inner;

    public SolrInputDocument(org.apache.solr.common.SolrInputDocument inner) {
        this.inner = inner;
    }

    public SolrInputDocument() {
        this(new org.apache.solr.common.SolrInputDocument());
    }

    public void addField(String access, Object accessType) {
        inner.addField(access, accessType);
    }

    public void setField(String event_count, Object eventCount) {
        inner.setField(event_count, eventCount);
    }

    public SolrInputField getField(String id) {
        return new SolrInputField(inner.getField(id));
    }
}
