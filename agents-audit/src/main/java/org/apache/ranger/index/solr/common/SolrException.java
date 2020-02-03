package org.apache.ranger.index.solr.common;

public class SolrException extends RuntimeException {
    public final org.apache.solr.common.SolrException inner;

    public SolrException(ErrorCode unauthorized, String s) {
        inner = new org.apache.solr.common.SolrException(unauthorized.inner, s);
    }

    public enum ErrorCode {
        UNAUTHORIZED(org.apache.solr.common.SolrException.ErrorCode.UNAUTHORIZED);
        public final org.apache.solr.common.SolrException.ErrorCode inner;

        ErrorCode(org.apache.solr.common.SolrException.ErrorCode unauthorized) {
            inner = unauthorized;
        }
    }
}
