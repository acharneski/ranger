package org.apache.ranger.index.solr.client.solrj.impl;

public class HttpClientUtil {
    public static void setHttpClientBuilder(SolrHttpClientBuilder kb) {
        org.apache.solr.client.solrj.impl.HttpClientUtil.setHttpClientBuilder(kb.inner);
    }
}
