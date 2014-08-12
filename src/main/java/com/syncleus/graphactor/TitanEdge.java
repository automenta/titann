/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.syncleus.graphactor;

import com.syncleus.dann.graph.DirectedEdge;
import com.syncleus.dann.graph.xml.EdgeXml;
import com.syncleus.dann.xml.Namer;
import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.util.wrappers.wrapped.WrappedEdge;
import java.util.List;

/**
 * Wraps a Titan/Blueprints Edge as a dANN DirectedEdge, with parameterized type
 * @author me
 */
public class TitanEdge<V extends Vertex> extends WrappedEdge implements DirectedEdge<V> {

    public TitanEdge(Edge e) {
        super(e);
        
    }

    @Override
    public String toString() {
        return "edge(" + ' ' + getSourceNode() + " -> " + this.getBaseElement() + " -> " + getDestinationNode() + ')';
    }

    @Override
    public V getSourceNode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public V getDestinationNode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DirectedEdge<V> disconnect(V node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DirectedEdge<V> disconnect(List<V> node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DirectedEdge<V> clone() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public V getLeftNode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public V getRightNode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public EndState getLeftEndState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public EndState getRightEndState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isIntroverted() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isExtroverted() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isDirected() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isHalfEdge() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isLooseEdge() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isOrdinaryEdge() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isLoop() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<V> getNodes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<V> getTraversableNodes(V node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isTraversable(V node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public EdgeXml toXml() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public EdgeXml toXml(Namer<Object> namer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void toXml(EdgeXml jaxbObject, Namer<Object> namer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isContextEnabled() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    

    
}
