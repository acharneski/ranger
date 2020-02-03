package org.apache.ranger.index.solr.security;

public class AuthorizationResponse {
    public final org.apache.solr.security.AuthorizationResponse inner;

    public AuthorizationResponse(int i) {
        inner = new org.apache.solr.security.AuthorizationResponse(i);
    }

    public String getMessage() {
        return inner.getMessage();
    }
}
