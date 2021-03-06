/*******************************************************************************
 * Copyright (c) 2013 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.security.tests;

import junit.textui.TestRunner;

import org.eclipse.scada.configuration.security.JavaScript;
import org.eclipse.scada.configuration.security.SecurityFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Java Script</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaScriptTest extends ScriptTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( JavaScriptTest.class );
    }

    /**
     * Constructs a new Java Script test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JavaScriptTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Java Script test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected JavaScript getFixture ()
    {
        return (JavaScript)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp () throws Exception
    {
        setFixture ( SecurityFactory.eINSTANCE.createJavaScript () );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown () throws Exception
    {
        setFixture ( null );
    }

} //JavaScriptTest
