package org.apache.ranger.index.solr.common.cloud;

public class SolrZkClient extends org.apache.solr.common.cloud.SolrZkClient {
    private final org.apache.solr.common.cloud.SolrZkClient inner;

    public SolrZkClient(org.apache.solr.common.cloud.SolrZkClient zkClient) {
        this.inner = zkClient;
    }
}
