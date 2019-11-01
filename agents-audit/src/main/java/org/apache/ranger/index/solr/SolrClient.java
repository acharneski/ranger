package org.apache.ranger.index.solr;

import org.apache.ranger.index.solr.client.solrj.response.UpdateResponse;
import org.apache.ranger.index.solr.common.SolrInputDocument;
import org.apache.solr.client.solrj.SolrServerException;

import java.io.IOException;
import java.util.Collection;
import java.util.stream.Collectors;

public class SolrClient {
    public final org.apache.solr.client.solrj.SolrClient inner;

    public SolrClient(org.apache.solr.client.solrj.SolrClient inner) {
        this.inner = inner;
    }

    public UpdateResponse add(Collection<SolrInputDocument> docs) throws IOException, SolrServerException {
        return new UpdateResponse(inner.add(docs.stream().map(x->x.inner).collect(Collectors.toList())));
    }

}
