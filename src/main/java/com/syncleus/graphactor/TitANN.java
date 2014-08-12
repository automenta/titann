/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.syncleus.graphactor;

import com.syncleus.dann.graph.DirectedGraph;
import com.syncleus.dann.graph.Graph;
import com.syncleus.dann.graph.xml.GraphXml;
import com.syncleus.dann.xml.Namer;
import com.thinkaurelius.titan.core.TitanGraph;
import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Vertex;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Titan -> dANN Graph Adapter
 * 
 * @see https://github.com/thinkaurelius/titan/blob/master/titan-core/src/main/java/com/thinkaurelius/titan/core/TitanGraph.java
 * @see http://www.tinkerpop.com/docs/javadocs/blueprints/2.0.0/com/tinkerpop/blueprints/Graph.html
 * @see http://www.tinkerpop.com/docs/javadocs/blueprints/2.0.0/com/tinkerpop/blueprints/Element.html
 * @see http://www.tinkerpop.com/docs/javadocs/blueprints/2.0.0/com/tinkerpop/blueprints/Edge.html
 * @see http://www.tinkerpop.com/docs/javadocs/blueprints/2.0.0/com/tinkerpop/blueprints/Vertex.html
 * @see http://www.tinkerpop.com/docs/javadocs/blueprints/2.0.0/com/tinkerpop/blueprints/KeyIndexableGraph.html
 * 
 * @see https://github.com/thinkaurelius/titan/blob/master/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/database/StandardTitanGraph.java
 * 
 * TitanElement provides more Titan-specific Vertex/Edge metadata, but starting with Element for simplicity
 * 
 * 
 * 
 */
public class TitANN<V extends Vertex, E extends TitanEdge<V>> implements DirectedGraph<V,E> {
    
    public final TitanGraph titan;
    public Set<V> vertexCache = new HashSet();
    public Set<TitanEdge> edgeCache = new HashSet();
    
    public static <T> Set<T> toSet(Iterable<T> collection, Set<T> target) {        
        Set<T> set = new HashSet();
        return addToSet(collection, set);
    }
    
    public static <T> Set<T> addToSet(Iterable<T> collection, Set<T> target) {                
        for (T item: collection)
            target.add(item);
        return target;
    }
    
    private V adaptVertex(Vertex v) {
        return (V)v;
    }
    private TitanEdge adaptEdge(Edge e) {
        return new TitanEdge(e);
    }
    
    
    public synchronized void update() {
        vertexCache.clear();
        edgeCache.clear();
        
        for (Vertex v : titan.getVertices())
            vertexCache.add(adaptVertex(v));
        for (Edge e : titan.getEdges())
            edgeCache.add(adaptEdge(e));
        
    }

    public TitANN(TitanGraph titan) {
        this.titan = titan;
        update();
    }
   
    

    @Override
    public Set<V> getNodes() {
        return Collections.unmodifiableSet(vertexCache);
    }

    @Override
    public Set<E> getInEdges(V node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<E> getEdges() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<V> getAdjacentNodes(V node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<E> getAdjacentEdges(V node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<V> getTraversableNodes(V node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<E> getTraversableEdges(V node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Graph<V, E> cloneAdd(E newEdge) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Graph<V, E> cloneAdd(V newNode) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Graph<V, E> cloneAdd(Set<V> newNodes, Set<E> newEdges) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Graph<V, E> cloneRemove(E edgeToRemove) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Graph<V, E> cloneRemove(V nodeToRemove) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Graph<V, E> cloneRemove(Set<V> deleteNodes, Set<E> deleteEdges) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Graph<V, E> clone() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public GraphXml toXml() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public GraphXml toXml(Namer<Object> namer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void toXml(GraphXml jaxbObject, Namer<Object> namer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isContextEnabled() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

    
}
