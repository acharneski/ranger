package org.apache.ranger.index.solr.common.params;

public class CoreAdminParams {
    public enum CoreAdminAction {
        STATUS(org.apache.solr.common.params.CoreAdminParams.CoreAdminAction.STATUS);

        public final org.apache.solr.common.params.CoreAdminParams.CoreAdminAction inner;

        CoreAdminAction(org.apache.solr.common.params.CoreAdminParams.CoreAdminAction inner) {
            this.inner = inner;
        }
    }
}
