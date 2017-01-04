package com.github.aem.tag.sample;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Calendar;

/**
 * Created by Shashi Bhushan on 4/1/17.
 */
public class SimpleTagSupportImpl extends SimpleTagSupport {

  private String className;

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  @Override
  public void doTag() throws JspException, IOException {
    JspWriter writer = getJspContext().getOut();

    writer.write("Hello World");
    writer.write("Class name is : " + this.className + " and time is : " + Calendar.getInstance().getTime().toString());
  }
}
