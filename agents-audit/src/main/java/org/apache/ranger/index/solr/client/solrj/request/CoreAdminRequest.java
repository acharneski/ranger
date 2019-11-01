package org.apache.ranger.index.solr.client.solrj.request;

import org.apache.ranger.index.solr.client.solrj.SolrClient;
import org.apache.ranger.index.solr.client.solrj.response.CoreAdminResponse;
import org.apache.ranger.index.solr.common.params.CoreAdminParams;
import org.apache.solr.client.solrj.SolrServerException;

import java.io.IOException;

public class CoreAdminRequest {
    public final org.apache.solr.client.solrj.request.CoreAdminRequest inner;

    public CoreAdminRequest(org.apache.solr.client.solrj.request.CoreAdminRequest inner) {
        this.inner = inner;
    }

    public CoreAdminRequest() {
        this(new org.apache.solr.client.solrj.request.CoreAdminRequest());
    }

    public void setAction(CoreAdminParams.CoreAdminAction status) {
        inner.setAction(status.inner);
    }

    public void setBasicAuthCredentials(String username, String decPassword) {
        inner.setBasicAuthCredentials(username, decPassword);
    }

    public CoreAdminResponse process(SolrClient solrClient) throws IOException, SolrServerException {
        return new CoreAdminResponse(inner.process(solrClient.inner));
    }
}
