package org.apache.ranger.index.solr.client.solrj;

public class SolrServerException extends Exception {
    public final org.apache.solr.client.solrj.SolrServerException inner;

    public SolrServerException(org.apache.solr.client.solrj.SolrServerException inner) {
        this.inner = inner;
    }
}
