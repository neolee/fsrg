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
import com.google.gwt.user.client.rpc.RemoteService;

/**
 * Example <code>RemoteService</code>.
 */
public interface FileService extends RemoteService {

  /**
   * Returns the children of the given parent.
   * 
   * @param folder the parent folder
   * @return the children
   */
  public List<FileModel> getFolderChildren(FileModel folder);

  /**
   * Returns the children of the given parent.
   * 
   * @param loadConfig the load config
   * @return the children
   */
  public List<FileModel> getFolderChildren(RemoteSortTreeLoadConfig loadConfig);

}
