<%@page import="comm.example.model.League"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
League league = (League) request.getAttribute("SUCCESS");
%>
<table>
<tr>
<th>Title</th>
<th>Year</th>
<th>Season</th>
</tr>
<tr>
<td><%=league.getTitle()%></td>
<td><%=league.getYear()%></td>
<td><%=league.getSeason()%></td>
</tr>
</table>
</body>
</html>