/**
 * <copyright>
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: XSDParticleContentImpl.java,v 1.4 2005/11/08 14:05:35 emerks Exp $
 */
package org.eclipse.xsd.impl;


import org.w3c.dom.Node;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.XSDParticleContent;
import org.eclipse.xsd.util.XSDConstants;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Particle Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class XSDParticleContentImpl 
  extends XSDConcreteComponentImpl 
  implements XSDParticleContent
{
  public static XSDParticleContent createParticleContent(Node node)
  {
    switch (XSDConstants.nodeType(node))
    {
      case XSDConstants.ALL_ELEMENT:
      case XSDConstants.CHOICE_ELEMENT:
      case XSDConstants.SEQUENCE_ELEMENT:
      {
        return XSDModelGroupImpl.createModelGroup(node);
      }
      case XSDConstants.ELEMENT_ELEMENT:
      {
        return XSDElementDeclarationImpl.createElementDeclaration(node);
      }
      case XSDConstants.GROUP_ELEMENT:
      {
        return XSDModelGroupDefinitionImpl.createModelGroupDefinition(node);
      }
      case XSDConstants.ANY_ELEMENT:
      {
        return XSDWildcardImpl.createWildcard(node);
      }
    }

    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XSDParticleContentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass()
  {
    return XSDPackage.eINSTANCE.getXSDParticleContent();
  }

}
