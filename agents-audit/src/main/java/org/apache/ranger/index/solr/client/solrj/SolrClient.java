package org.apache.ranger.index.solr.client.solrj;

import org.apache.ranger.index.solr.client.solrj.response.UpdateResponse;
import org.apache.ranger.index.solr.common.SolrInputDocument;
import org.apache.solr.client.solrj.SolrServerException;

import java.io.IOException;
import java.util.Collection;
import java.util.stream.Collectors;

public class SolrClient extends org.apache.ranger.index.solr.SolrClient {
    public final org.apache.solr.client.solrj.SolrClient inner;

    public SolrClient(org.apache.solr.client.solrj.SolrClient inner) {
        super(inner);
        this.inner = inner;
    }

    public UpdateResponse add(Collection<SolrInputDocument> docs) throws IOException, SolrServerException {
        return new UpdateResponse(inner.add(docs.stream().map(x->x.inner).collect(Collectors.toList())));
    }

    public void close() throws IOException {
        inner.close();
    }

    public UpdateResponse add(SolrInputDocument document) throws IOException, SolrServerException {
        return new UpdateResponse(inner.add(document.inner));
    }
}
