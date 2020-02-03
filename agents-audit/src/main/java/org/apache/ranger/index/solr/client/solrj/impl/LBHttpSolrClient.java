package org.apache.ranger.index.solr.client.solrj.impl;

import org.apache.ranger.index.solr.SolrClient;

import java.net.MalformedURLException;

public class LBHttpSolrClient extends SolrClient {
    private final org.apache.solr.client.solrj.impl.LBHttpSolrClient inner;

    public LBHttpSolrClient(org.apache.solr.client.solrj.impl.LBHttpSolrClient inner) {
        super(new org.apache.solr.client.solrj.SolrClient());
        this.inner = inner;
    }

    public void addSolrServer(String s) throws MalformedURLException {
        inner.addSolrServer(s);
    }

    public static class Builder {
        public final org.apache.solr.client.solrj.impl.LBHttpSolrClient.Builder inner = new org.apache.solr.client.solrj.impl.LBHttpSolrClient.Builder();
        public void withBaseSolrUrl(String s) {
            inner.withBaseSolrUrl(s);
        }

        public void withConnectionTimeout(int i) {
            inner.withConnectionTimeout(i);
        }

        public LBHttpSolrClient build() {
            return new LBHttpSolrClient(inner.build());
        }
    }
}
