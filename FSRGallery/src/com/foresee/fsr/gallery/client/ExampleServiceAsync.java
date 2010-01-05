/*
 * Ext GWT - Ext for GWT
 * Copyright(c) 2007-2009, Ext JS, LLC.
 * licensing@extjs.com
 * 
 * http://extjs.com/license
 */
package com.foresee.fsr.gallery.client;

import java.util.List;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.foresee.fsr.gallery.client.examples.model.BeanPost;
import com.foresee.fsr.gallery.client.examples.model.Photo;
import com.foresee.fsr.gallery.client.examples.model.Post;
import com.foresee.fsr.gallery.resources.client.model.Customer;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ExampleServiceAsync {
  public void getPosts(PagingLoadConfig config, AsyncCallback<PagingLoadResult<Post>> callback);

  public void getBeanPosts(PagingLoadConfig config, AsyncCallback<PagingLoadResult<BeanPost>> callback);

  public void getCustomers(AsyncCallback<List<Customer>> callback);

  public void getPhotos(AsyncCallback<List<Photo>> callback);

  public void getLiveGridModels(PagingLoadConfig config, AsyncCallback<PagingLoadResult<ModelData>> callback);
}
