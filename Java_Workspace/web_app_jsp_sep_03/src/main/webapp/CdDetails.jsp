<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cd Details</title>
</head>
<body>
<h1>CD Details</h1>
<form action="check_cd.do" method="post">
Title : <input type="text" name="title" placeholder="Enter Cd title"/>
<br><br>
Artist : <input type="text" name="artist" placeholder="Enter Artist name"/>
<br><br>
Purchase Date : <input type="date" name="purchasedate" placeholder="Enter purchase DAte"/>
<br><br>
Cost : <input type="number" name="cost" placeholder="Enter Cd cost"/>
<br><br>
CD Type : <select name="type">
<option value="select">Select</option>
<option value="international">international</option>
<option value="special">special</option>

</select>
<br><br>
<input type="submit"/>
</form>
</body>
</html>