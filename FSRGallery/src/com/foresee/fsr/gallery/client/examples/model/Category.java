/*
 * Ext GWT - Ext for GWT
 * Copyright(c) 2007-2009, Ext JS, LLC.
 * licensing@extjs.com
 * 
 * http://extjs.com/license
 */
package com.foresee.fsr.gallery.client.examples.model;

import com.extjs.gxt.ui.client.Style.HideMode;
import com.extjs.gxt.ui.client.data.BaseTreeModel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;

public class Category extends BaseTreeModel {

  protected Category() {
  }

  public Category(String name) {
    set("name", name);
  }

  public String getName() {
    return (String) get("name");
  }

  public String toString() {
    return getName();
  }

  public void add(String title, LayoutContainer page, String image) {
    add(new Entry(title, page, image));
  }

  public void add(String title, LayoutContainer page, String image, boolean fill) {
    add(new Entry(title, page, image, fill));
  }

  public void add(String title, LayoutContainer page, String image, boolean fill, boolean closable,
      HideMode hideMode) {
    add(new Entry(title, page, image, fill, closable, hideMode));
  }
}
