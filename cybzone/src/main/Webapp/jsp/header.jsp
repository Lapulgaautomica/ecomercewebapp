<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="stylesheet" href="/css/header.css">
</head>
<body>
<div class= "main-header">


 <div class="header">

        <div class="logo">
            <h1>Cybzone.in</h1>
        </div>
        
            <div class="serch">
                <form action="search">
                    <input type="text" name="keyword" id="">
                    <input type="submit" class="btn" value="Search">
                </form>
            </div>
            <ul>
                <li><a href="home">home</a></li>
                <li><a href="">${email} </a></li>
                <li><a href="userlogin"></a></li>
                <li><a href="cart?email=${email}">cart</a></li>
                <li><a href="order?email=${email}">orders</a></li>
                <li><a href="userlogout">Logout</a></li>
            </ul>
      
    </div>
    



</div>
</body>
</html>