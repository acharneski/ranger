package org.apache.ranger.index.solr.common.cloud;

public class ZkStateReader {
    public final org.apache.solr.common.cloud.ZkStateReader inner;

    public ZkStateReader(org.apache.solr.common.cloud.ZkStateReader zkStateReader) {
        this.inner = zkStateReader;
    }

    public org.apache.ranger.index.solr.common.cloud.SolrZkClient getZkClient() {
        return new SolrZkClient(inner.getZkClient());
    }
}
