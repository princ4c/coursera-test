
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.seneca.server.Student"%>
<%@page import="java.util.Vector"%>
<%@page import="java.util.Hashtable"%>
<%@page import="java.util.ArrayList"%>

<html>
  <head>
    <title>Insert title here</title>
    <meta http-equiv="Content-Type" content="text/html; charset=unicode"/>
    <meta content="CoffeeCup HTML Editor (www.coffeecup.com)" name="generator"/>
  </head>
	<% 
	ArrayList<Student> list = (ArrayList<Student>) request.getAttribute("student_info");
	%> 
  <body>
    <% 
    Student student = new Student();
		for(int i=0; i<list.size(); i++) {
			student = list.get(i);
    out.println(student.getName());
    out.println(student.getMark()); %><br/><% 

}
%>

    </body>
</html>