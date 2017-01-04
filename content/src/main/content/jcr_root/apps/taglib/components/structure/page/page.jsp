<%@page session="false"
        contentType="text/html; charset=utf-8"
%>
<%@include file="/libs/foundation/global.jsp" %>
<%@taglib prefix="cq" uri="http://www.day.com/taglibs/cq/1.0" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="tag" uri="http://github.com/Shashi-Bhushan/tag" %>
<cq:defineObjects/>
<!DOCTYPE html>
<html class="no-js">
  <body>
    <c:set var="name" value="SimpleTagSupportImpl"/>

    <tag:printTime/>
    <tag:printTime className = "${name}"/>
  </body>
</html>
