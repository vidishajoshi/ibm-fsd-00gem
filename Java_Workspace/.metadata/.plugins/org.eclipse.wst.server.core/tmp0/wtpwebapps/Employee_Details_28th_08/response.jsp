<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="comm.example.factory.MyConnFactory"%>
<%@page import="java.sql.Connection"%>
<%@page import="comm.example.model.ValidateUserBean"%>
<jsp:useBean id="u" class="comm.example.model.ValidateUserBean" scope="page">
<jsp:setProperty name="u" property="*"/>
</jsp:useBean>

<%

Connection connection = MyConnFactory.getMyConnection();

PreparedStatement pst;
try {
	pst = connection.prepareStatement("select eEmail,ePass from employees");
	ResultSet rs = pst.executeQuery();
	boolean flag =false;
	while(rs.next()){
		String res=u.validate(rs.getString(1),rs.getString(2));
		if(res=="VALID"){
			flag = true;
		}
	}
	if(flag == true){
		%>
	   
	   <a href="add_employee.view">Add Employee</a>
	<% 
	}
	else{
		out.println("invaid user");
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
%>

<body>
  <br>
<jsp:getProperty name="u" property="user" />

 You entered user name as <jsp:getProperty name="u" property="user" /> <br>

  You entered user password as <jsp:getProperty name="u" property="password" /> <br>

 

  <b>Thank You</b>
</body>
</html>