/*
 * Copyright (C) 2007 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.umltool.xmiconverters.poseidon5.failuretests;

import com.topcoder.uml.model.core.ModelElement;
import com.topcoder.umltool.xmiconverters.poseidon5.activity.impl.AbstractZUMLActivityEdge;

/**
 * <p>
 * Mock implementation of <code>AbstractZUMLActivityEdge</code> class. It provides an empty implementation of
 * convertToTCUML(). It's just used for testing <code>AbstractZUMLActivityEdge</code> class.
 * </p>
 * 
 * @author iRabbit
 * @version 1.0
 */
public class MockZUMLActivityEdge extends AbstractZUMLActivityEdge {

    /**
     * <p>
     * An empty implementation.
     * </p>
     * 
     * @return this class is mock implementation and always return null
     */
    public ModelElement convertToTCUML() {
        return null;
    }
}
