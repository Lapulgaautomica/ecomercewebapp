<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>   <link rel="stylesheet" href="/css/signup.css">
</head>
<body>
    

<body>
    
    <div class="hero">

        <div class="signup">
        
        
            <form action="save" method="post">

                <table>
                    <tr>
                        <td>
                            Enter Name 
                        </td>
                        <td>
                            <input type="text" name="name"><br>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Enter Email 
                        </td>
                        <td>
                            <input type="text" name="email">
                        </td>
                    </tr>

                    <tr>
                        <td>
                            Enter Password
                        </td>
                        <td>
                            <input type="password" name="password">
                        </td>
                    </tr>
                    <tr>
                       
                        <td>
                            <input type="submit"  value="Signup" class="btn">
                        </td>
                    </tr>
                    

                       

                 </table>
            </form>
            
            <a href="/jsp/Login.jsp">Login</a>

        </div>



            
        


    </div>
</body>
</html>