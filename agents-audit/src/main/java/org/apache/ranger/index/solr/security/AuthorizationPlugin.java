package org.apache.ranger.index.solr.security;

import java.io.IOException;
import java.util.Map;

public interface AuthorizationPlugin {
    void init(Map<String, Object> initInfo);

    void close() throws IOException;

    AuthorizationResponse authorize(AuthorizationContext context);
}
