<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<style>
</head>
<body>

.login{
display:block;
background:azure;
heigth:1000px;
}
.form_{
display:block;
background:white;
width:500px;
heigth:700px;
margin-left:570px;
}
 label{
 margin-top:20px;
 margin-left:20px;}
 
 input[type="email"]{
 margin-top:10px;
 width:400px;
 margin-left:20px;}

 input[type="password"]{
 margin-top:10px;
 width:400px;
 margin-left:20px;}
 
 
 input[type="submit"]{
 margin-top:10px;
 width:80px;
 margin-left:20px;
 margin-bottom:20px;}

input[type="button"]{
 margin-top:10px;
 width:80px;
 margin-left:10px;
 margin-bottom:20px;}
</style>

</head>
<body>
<div class="login">
<div class="head_">
<h1 style="text-align:center">Login</h1>
</div>
<div class="form_">
<form action="response.jsp" method="post">
<div class="form-group">
<label for="email">Email:</label>
<input type="email" class="form-control" placeholder="Enter email" name="user">
</div>

<div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" placeholder="Enter password" name="password">
    </div>

<input type="submit" class="btn btn-primary" value="login"/>
<input type="button" class="btn btn-success" value="Home"/>
</form>
</div>
</div>
</body>
</html>