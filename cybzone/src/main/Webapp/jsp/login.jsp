<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="/css/login.css">
</head>
<body>




	 <div class="hero">
	 <h1>${success}</h1>

    <div class="main">
 <% String msg=request.getParameter("msg"); 
    System.out.print(msg);
    if("1".equals(msg))
    {
    	   %><p> "Invalid username and password"</p><%
    }
    else{
    	
    }
    %>
        <form action="login"  method="post"  class="form">
         <%-- <label >Enter Email</label>    <input type="email" name="useremail" placeholder="emaple@gmail.com"><br>
         // <label >Enter Password</label><input type="password" name="userpassword"><br>  --%>
         <label >Enter Email</label> <input type="text" name="email"><br>
        <label >Enter Password</label> <input type="text" name="password"><br>
            <input type="submit" value="Login" class="btn">
        </form>
        <div class="signup">
            <p>New User Signup Here</p>
            <a href="signup">Signup</a>
        </div>
    </div>

    </div>



</body>
</html>