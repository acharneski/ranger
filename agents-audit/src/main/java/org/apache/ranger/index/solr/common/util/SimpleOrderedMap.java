package org.apache.ranger.index.solr.common.util;

public class SimpleOrderedMap<T> extends NamedList<T> {

    public SimpleOrderedMap(org.apache.solr.common.util.SimpleOrderedMap<T> inner) {
        super(inner);
    }

    public T get(String name) {
        return inner.get(name);
    }
}
