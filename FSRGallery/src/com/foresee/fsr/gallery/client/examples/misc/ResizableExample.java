/*
 * Ext GWT - Ext for GWT
 * Copyright(c) 2007-2009, Ext JS, LLC.
 * licensing@extjs.com
 * 
 * http://extjs.com/license
 */
package com.foresee.fsr.gallery.client.examples.misc;

import com.extjs.gxt.ui.client.fx.Draggable;
import com.extjs.gxt.ui.client.fx.Resizable;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.layout.FlowLayout;
import com.foresee.fsr.gallery.resources.client.Resources;
import com.foresee.fsr.gallery.resources.client.TestData;
import com.google.gwt.user.client.Element;

public class ResizableExample extends LayoutContainer {

  @Override
  protected void onRender(Element parent, int pos) {
    super.onRender(parent, pos);

    ContentPanel cp = new ContentPanel();
    cp.setHeading("8-Way Resizing");
    cp.setIcon(Resources.ICONS.text());
    cp.setBodyStyleName("pad-text");
    cp.addText(TestData.DUMMY_TEXT_SHORT);

    cp.setSize(200, 125);
    cp.setPosition(10, 10);

    Draggable d = new Draggable(cp);
    if (getParent() instanceof Component) {
      d.setContainer((Component) getParent());
    }
    new Resizable(cp);

    setLayout(new FlowLayout());
    add(cp);
  }

}
