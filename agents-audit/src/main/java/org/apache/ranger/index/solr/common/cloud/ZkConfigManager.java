package org.apache.ranger.index.solr.common.cloud;

import java.io.IOException;

public class ZkConfigManager {
    public final org.apache.ranger.index.solr.common.cloud.ZkConfigManager inner;

    public ZkConfigManager(SolrZkClient zkClient) {
        this.inner = new org.apache.ranger.index.solr.common.cloud.ZkConfigManager(zkClient);
    }

    public boolean configExists(String solr_config_name) throws IOException {
        return inner.configExists(solr_config_name);
    }
}
