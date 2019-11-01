package org.apache.ranger.index.solr.client.solrj.response;

import org.apache.ranger.index.solr.client.solrj.SolrResponse;

public class CollectionAdminResponse extends SolrResponse {
    public final org.apache.solr.client.solrj.response.CollectionAdminResponse inner;

    public CollectionAdminResponse(org.apache.solr.client.solrj.response.CollectionAdminResponse process) {
        this.inner = process;
    }

    public int getStatus() {
        return inner.getStatus();
    }
}
