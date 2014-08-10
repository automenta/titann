package com.syncleus.graphactor;

import com.thinkaurelius.titan.core.TitanGraph;
import com.tinkerpop.blueprints.Vertex;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TitanGodsTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TitanGodsTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(TitanGodsTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        TitanGraph godGraph = TitanGods.create("./target/TitanTest");
        Iterable<Vertex> skyVertices = godGraph.getVertices("name", "sky");
        assertTrue("skyVertices were not found", skyVertices.iterator().hasNext());
    }
}
