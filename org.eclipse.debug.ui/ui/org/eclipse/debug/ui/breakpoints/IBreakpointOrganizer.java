/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.debug.ui.breakpoints;

import org.eclipse.debug.ui.IBreakpointOrganizerDelegate;
import org.eclipse.jface.resource.ImageDescriptor;

/**
 * A breakpoint organizer is represents a breakpoint organizer delegate in 
 * the breakpoint view.  
 * <p>
 * This interface is not intended to be implemented. Clients contributing a breakpoint
 * organizer are intended to implement <code>IBreakpointOrganizerDelegate</code>.
 * </p>
 * @noimplement This interface is not intended to be implemented by clients.
 * @since 3.6 (internal interface since 3.1)
 */
public interface IBreakpointOrganizer extends IBreakpointOrganizerDelegate {
    
    /**
     * Returns a label for this breakpoint organizer.
     * 
     * @return a label for this breakpoint organizer
     */
    public String getLabel();
    
    /**
     * Returns an image descriptor for this breakpoint organizer or <code>null</code>.
     * 
     * @return an image descriptor for this breakpoint organizer or <code>null</code>
     */
    public ImageDescriptor getImageDescriptor();
    
    /**
     * Returns a unique identifier for this breakpoint organizer.
     * 
     * @return a unique identifier for this breakpoint organizer
     */
    public String getIdentifier();
    
    /**
     * Returns the label for breakpoints that do not fall into a category
     * for this organizer.
     * 
     * @return label for breakpoints that do not fall into a category
     * for this organizer
     */
    public String getOthersLabel();

}
