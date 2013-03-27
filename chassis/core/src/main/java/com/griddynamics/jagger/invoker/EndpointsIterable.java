package com.griddynamics.jagger.invoker;

import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: amikryukov
 * Date: 3/27/13
 */
public class EndpointsIterable implements Iterable {

    private List endpoints;

    public void setEndpoints(List endpoints) {
        this.endpoints = endpoints;
    }

    @Override
    public Iterator iterator() {
        return endpoints.iterator();
    }
}
