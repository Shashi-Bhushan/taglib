package com.github.aem.tag;

import javax.servlet.ServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by shabhushan on 1/4/2017.
 */
public class SetResponseTag extends SimpleTagSupport {

  @Override
  public void doTag() throws JspException, IOException {
    PageContext pageContext = (PageContext)getJspContext();

    ServletResponse response = pageContext.getResponse();

    pageContext.getResponse().set
  }
}
