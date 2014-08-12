/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.syncleus.graphactor;

import com.thinkaurelius.titan.core.TitanGraph;

/**
 *
 */
public class TitANNTest {

    public static void main(String[] args) {
        TitanGraph g = ExampleGraph.create("./target/TitanTest");
        
        TitANN t = new TitANN(g);
        System.out.println("TitanGraph class: " + g.getClass());
        System.out.println(t.getNodes());
        System.out.println(t.getEdges());
    }
}
