package org.apache.ranger.index.solr.client.solrj.response;

public class UpdateResponse {
    private final org.apache.solr.client.solrj.response.UpdateResponse inner;

    public UpdateResponse(org.apache.solr.client.solrj.response.UpdateResponse updateResponse) {
        this.inner = updateResponse;
    }

    public int getStatus() {
        return inner.getStatus();
    }
}
