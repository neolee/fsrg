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
import com.google.gwt.user.client.rpc.RemoteService;

public interface ExampleService extends RemoteService {

  public PagingLoadResult<Post> getPosts(PagingLoadConfig config);

  public PagingLoadResult<BeanPost> getBeanPosts(PagingLoadConfig config);

  public List<Customer> getCustomers();

  public List<Photo> getPhotos();

  public PagingLoadResult<ModelData> getLiveGridModels(PagingLoadConfig config);

}