package org.apache.ranger.index.solr.handler.component;

import org.apache.ranger.index.solr.common.params.ModifiableSolrParams;
import org.apache.ranger.index.solr.common.params.SolrParams;
import org.apache.ranger.index.solr.request.SolrQueryRequest;

public class ResponseBuilder {
    public final org.apache.solr.handler.component.ResponseBuilder inner;

    public SolrQueryRequest req;

    public ResponseBuilder(org.apache.solr.handler.component.ResponseBuilder inner) {
        this.inner = inner;
        this.req = new SolrQueryRequest(inner.req);
    }

    public SolrParams req_getParams() {
        return new SolrParams(req.inner.getParams());
    }

    public void req_setParams(ModifiableSolrParams newParams) {
        req.inner.setParams(newParams.inner);
    }
}
