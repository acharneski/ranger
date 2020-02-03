package org.apache.ranger.index.solr.client.solrj.impl;

public class Krb5HttpClientBuilder {
    public final org.apache.solr.client.solrj.impl.Krb5HttpClientBuilder inner = new org.apache.solr.client.solrj.impl.Krb5HttpClientBuilder();
    public SolrHttpClientBuilder getBuilder() {
        return new SolrHttpClientBuilder(inner.getBuilder());
    }
}
