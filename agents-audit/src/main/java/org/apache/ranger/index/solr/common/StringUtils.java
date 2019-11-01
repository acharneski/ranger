package org.apache.ranger.index.solr.common;

public class StringUtils {

    public static boolean isEmpty(String zoneName) {
        return org.apache.solr.common.StringUtils.isEmpty(zoneName);
    }
}
