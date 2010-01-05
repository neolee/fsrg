/*
 * Ext GWT - Ext for GWT
 * Copyright(c) 2007-2009, Ext JS, LLC.
 * licensing@extjs.com
 * 
 * http://extjs.com/license
 */
package com.foresee.fsr.gallery.explorer.client;

import com.foresee.fsr.gallery.client.ExamplesModel;
import com.foresee.fsr.gallery.client.examples.model.Entry;
import com.foresee.fsr.gallery.explorer.client.pages.OverviewPage;

public class ExplorerModel extends ExamplesModel {

  public ExplorerModel() {
    set("overview", new Entry("Overview All", new OverviewPage(), null, true, false));
    
    
  }

}
