package org.apache.ranger.index.solr.client.solrj;

public class SolrQuery {
    public final org.apache.solr.client.solrj.SolrQuery inner;

    public SolrQuery(org.apache.solr.client.solrj.SolrQuery inner) {
        this.inner = inner;
    }

    public SolrQuery() {
        this(new org.apache.solr.client.solrj.SolrQuery());
    }

    public void setQuery(String s) {
        inner.setQuery(s);
    }

    public void addFilterQuery(String fq) {
        inner.addFilterQuery(fq);
    }

    public void setStart(int startIndex) {
        inner.setStart(startIndex);
    }

    public void setRows(int maxRows) {
        inner.setRows(maxRows);
    }

    public void addSort(String querySortBy, ORDER order) {
        inner.addSort(querySortBy, order.inner);
    }

    public void setRequestHandler(String queryStr) {
        inner.setRequestHandler(queryStr);
    }

    public enum  ORDER {
        asc(org.apache.solr.client.solrj.SolrQuery.ORDER.asc),
        desc(org.apache.solr.client.solrj.SolrQuery.ORDER.desc);

        public final org.apache.solr.client.solrj.SolrQuery.ORDER inner;

        ORDER(org.apache.solr.client.solrj.SolrQuery.ORDER inner) {
            this.inner = inner;
        }
    }
}
