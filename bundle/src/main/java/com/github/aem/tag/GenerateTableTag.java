package com.github.aem.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by shabhushan on 1/4/2017.
 */
public class GenerateTableTag extends BodyTagSupport {

  private String tagBodyContent;
  private StringBuilder table = new StringBuilder();

  public static final String ROW_DELIMETER = ";";
  public static final String ROW_ENTRIES_DELIMETER = ", ";

  private String heading;
  private String colspan;

  public String getColspan() {
    return colspan;
  }

  public void setColspan(String colspan) {
    this.colspan = colspan;
  }

  public String getHeading() {
    return heading;
  }

  public void setHeading(String heading) {
    this.heading = heading;
  }

  /**
   * Get Table Heading and data to generate the HTML table
   * @return
   * @throws JspException
   */
  @Override
  public int doEndTag() throws JspException {

    BodyContent content = getBodyContent();

    tagBodyContent = content.getString();

    populateTable();

    try {
      pageContext.getOut().print(table.toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
    /*
     * Returning Skip_page here would mean that page won't be evaluated after this tag has ended.
     * return SKIP_PAGE;
     */
    return EVAL_PAGE;
  }

  private void populateTable(){
    table.append(
      "<table>"
    );

    if(this.getHeading() != null) {
      table.append(
        "<tr>" +
          "<th colspan=" + this.getColspan() + ">" +
            this.getHeading() +
          "</th>" +
        "<tr>"
      );
    }

    StringTokenizer tableRow = new StringTokenizer(tagBodyContent, ";");

    while(tableRow.hasMoreTokens()){
      StringTokenizer tableRowElements = new StringTokenizer(tableRow.nextToken(), ",");

      table.append(
        "<tr>"
      );
      while(tableRowElements.hasMoreTokens()){
        String tableRowElement = tableRowElements.nextToken();

        table.append(
          "<td>" +
            tableRowElement +
          "</td>"
        );
      }
      table.append(
        "</tr>"
      );
    }

    table.append(
      "</table>"
    );
  }
}
