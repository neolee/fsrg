/*
 * Ext GWT - Ext for GWT
 * Copyright(c) 2007-2009, Ext JS, LLC.
 * licensing@extjs.com
 * 
 * http://extjs.com/license
 */
package com.foresee.fsr.gallery.client;

import java.util.List;

import com.extjs.gxt.ui.client.data.RemoteSortTreeLoadConfig;
import com.foresee.fsr.gallery.client.examples.model.FileModel;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Async <code>FileService<code> interface.
 */
public interface FileServiceAsync {

  public void getFolderChildren(FileModel model, AsyncCallback<List<FileModel>> children);
  
  public void getFolderChildren(RemoteSortTreeLoadConfig loadConfig, AsyncCallback<List<FileModel>> children);

}
