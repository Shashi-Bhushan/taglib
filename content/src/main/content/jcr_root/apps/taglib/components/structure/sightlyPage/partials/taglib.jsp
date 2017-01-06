<%@page session="false"
        contentType="text/html; charset=utf-8"
  %>
<%@include file="/libs/foundation/global.jsp" %>
<%@taglib prefix="cq" uri="http://www.day.com/taglibs/cq/1.0" %>
<%@taglib prefix="tag" uri="http://github.com/Shashi-Bhushan/tag" %>
<cq:defineObjects/>
<c:set var="name" value="SimpleTagSupportImpl"/>

<tag:printTime/>
<tag:printTime className = "${name}"/>
