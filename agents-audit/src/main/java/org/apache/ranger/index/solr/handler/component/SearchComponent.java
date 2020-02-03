package org.apache.ranger.index.solr.handler.component;

import org.apache.ranger.index.solr.common.util.NamedList;
import org.apache.ranger.index.solr.security.AuthorizationContext;
import org.apache.ranger.index.solr.security.AuthorizationResponse;

import java.io.IOException;
import java.util.Map;

public abstract class SearchComponent {
    public abstract void init(NamedList<?> args);

    /*
     * (non-Javadoc)
     *
     * @see org.apache.ranger.index.solr.security.SolrAuthorizationPlugin#init(java.util.Map)
     */
    public abstract void init(Map<String, Object> initInfo);

    /*
     * (non-Javadoc)
     *
     * @see java.io.Closeable#close()
     */
    public abstract void close() throws IOException;

    /*
     * (non-Javadoc)
     *
     * @see
     * org.apache.ranger.index.solr.security.SolrAuthorizationPlugin#authorize(org.apache
     * .solr.security.SolrRequestContext)
     */
    public abstract AuthorizationResponse authorize(AuthorizationContext context);

    public abstract void prepare(ResponseBuilder rb) throws IOException;

    public abstract void process(ResponseBuilder rb) throws IOException;

    public abstract String getDescription();
}
