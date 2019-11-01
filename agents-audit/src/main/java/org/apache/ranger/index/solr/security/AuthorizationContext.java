package org.apache.ranger.index.solr.security;

import org.apache.ranger.index.solr.common.params.ModifiableSolrParams;
import org.apache.ranger.index.solr.common.params.SolrParams;

import java.security.Principal;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

public class AuthorizationContext {
    public final org.apache.solr.security.AuthorizationContext inner;

    public AuthorizationContext(org.apache.solr.security.AuthorizationContext inner) {
        this.inner = inner;
    }

    public RequestType getRequestType() {
        return RequestType.valueOf(inner.getRequestType().name());
    }

    public Principal getUserPrincipal() {
        return inner.getUserPrincipal();
    }

    public String getRemoteAddr() {
        return inner.getRemoteAddr();
    }

    public String getResource() {
        return inner.getResource();
    }

    public String getHttpHeader(String proxyIPHeader) {
        return inner.getHttpHeader(proxyIPHeader);
    }

    public List<CollectionRequest> getCollectionRequests() {
        return inner.getCollectionRequests().stream().map(x->new CollectionRequest(x)).collect(Collectors.toList());
    }

    public Enumeration<String> getHeaderNames() {
        return inner.getHeaderNames();
    }

    public SolrParams getParams() {
        return new SolrParams(inner.getParams());
    }

    public class CollectionRequest {
        public final org.apache.solr.security.AuthorizationContext.CollectionRequest inner;
        public Object collectionName;

        public CollectionRequest(org.apache.solr.security.AuthorizationContext.CollectionRequest inner) {
            this.inner = inner;
        }
    }

    public enum  RequestType {
        READ(org.apache.solr.security.AuthorizationContext.RequestType.READ),
        WRITE(org.apache.solr.security.AuthorizationContext.RequestType.WRITE),
        UNKNOWN(org.apache.solr.security.AuthorizationContext.RequestType.UNKNOWN),
        ADMIN(org.apache.solr.security.AuthorizationContext.RequestType.ADMIN);

        public final org.apache.solr.security.AuthorizationContext.RequestType inner;

        RequestType(org.apache.solr.security.AuthorizationContext.RequestType read) {
            inner = read;
        }
    }
}
