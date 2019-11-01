package org.apache.ranger.index.solr.client.solrj;

import org.apache.ranger.index.solr.common.util.NamedList;
import org.apache.solr.client.solrj.response.CollectionAdminResponse;

public class SolrResponse {
    private final org.apache.solr.client.solrj.SolrResponse inner;

    public SolrResponse(org.apache.solr.client.solrj.SolrResponse process) {
        this.inner = process;
    }

    public NamedList<Object> getResponse() {
        return new NamedList<>(inner.getResponse());
    }
}
