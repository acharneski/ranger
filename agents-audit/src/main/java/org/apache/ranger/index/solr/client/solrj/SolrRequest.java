package org.apache.ranger.index.solr.client.solrj;

public class SolrRequest {
    public enum METHOD {
        POST(org.apache.solr.client.solrj.SolrRequest.METHOD.POST);

        public final org.apache.solr.client.solrj.SolrRequest.METHOD inner;

        METHOD(org.apache.solr.client.solrj.SolrRequest.METHOD post) {
            inner = post;
        }
    }
}
