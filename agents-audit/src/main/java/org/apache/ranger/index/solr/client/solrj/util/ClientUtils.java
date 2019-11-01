package org.apache.ranger.index.solr.client.solrj.util;

public class ClientUtils {

    public static String escapeQueryChars(String toLowerCase) {
        return org.apache.solr.client.solrj.util.ClientUtils.escapeQueryChars(toLowerCase);
    }
}
