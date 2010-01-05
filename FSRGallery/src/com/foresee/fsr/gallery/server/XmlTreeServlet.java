package com.foresee.fsr.gallery.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.extjs.gxt.ui.client.data.ModelData;
import com.foresee.fsr.gallery.resources.client.TestData;
import com.foresee.fsr.gallery.resources.client.model.Folder;

public class XmlTreeServlet extends HttpServlet {

  private Folder root = TestData.getTreeModel();
  private Map<Integer, Folder> folders = new HashMap<Integer, Folder>();

  public XmlTreeServlet() {
    processFolder(root);
  }

  private void processFolder(Folder folder) {
    folders.put(folder.getId(), folder);
    for (ModelData model : folder.getChildren()) {
      if (model instanceof Folder) {
        Folder child = (Folder) model;
        processFolder(child);
      }
    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    super.doPost(req, resp);
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    String id = req.getParameter("id");

    Folder folder = null;
    if (id != null) {
      Integer iid = Integer.parseInt(id);
      folder = folders.get(iid);
    } else {
      folder = root;
    }

    String xml = generateXml(folder);

    resp.setContentType("text/xml");
    PrintWriter out = resp.getWriter();
    out.println(xml);
    out.flush();
  }

  private String generateXml(Folder folder) {
    StringBuffer sb = new StringBuffer();
    sb.append("<items>");

    for (ModelData child : folder.getChildren()) {
      sb.append("<item folder=\"" + (child instanceof Folder ? "true" : "false")
          + "\" name=\"" + child.get("name") + "\" id=\"" + child.get("id") + "\">");
      sb.append("</item>");
    }

    sb.append("</items>");

    return sb.toString();
  }
}
