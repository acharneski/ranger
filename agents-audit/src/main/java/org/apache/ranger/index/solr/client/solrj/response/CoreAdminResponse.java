package org.apache.ranger.index.solr.client.solrj.response;


import org.apache.ranger.index.solr.common.util.NamedList;

public class CoreAdminResponse {
    private final org.apache.solr.client.solrj.response.CoreAdminResponse inner;

    public CoreAdminResponse(org.apache.solr.client.solrj.response.CoreAdminResponse process) {
        this.inner = process;
    }

    public NamedList<org.apache.solr.common.util.NamedList<Object>> getCoreStatus() {
        return new NamedList<>(inner.getCoreStatus());
    }
}
