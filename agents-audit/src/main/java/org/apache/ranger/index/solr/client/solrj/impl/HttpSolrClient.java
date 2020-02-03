package org.apache.ranger.index.solr.client.solrj.impl;

import org.apache.ranger.index.solr.client.solrj.SolrClient;

public class HttpSolrClient extends SolrClient {
    public final org.apache.solr.client.solrj.impl.HttpSolrClient inner;

    public HttpSolrClient(org.apache.solr.client.solrj.impl.HttpSolrClient inner) {
        super(new org.apache.solr.client.solrj.SolrClient());
        this.inner = inner;
    }

    public void setRequestWriter(BinaryRequestWriter binaryRequestWriter) {
        inner.setRequestWriter(binaryRequestWriter.inner);
    }

    public static class Builder {
        public final org.apache.solr.client.solrj.impl.HttpSolrClient.Builder inner = new org.apache.solr.client.solrj.impl.HttpSolrClient.Builder();

        public void withBaseSolrUrl(String solrURL) {
            inner.withBaseSolrUrl(solrURL);
        }

        public void allowCompression(boolean b) {
            inner.allowCompression(b);
        }

        public void withConnectionTimeout(int i) {
            inner.withConnectionTimeout(i);
        }

        public HttpSolrClient build() {
            return new HttpSolrClient(inner.build());
        }
    }
}
