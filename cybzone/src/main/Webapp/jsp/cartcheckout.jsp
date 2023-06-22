<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <jsp:include page="/jsp/header.jsp"></jsp:include>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="stylesheet" href="/css/cartchek.css">
</head>
<body>


    <div class="main">
    
        <div class="checkout-container">
        <h1>${msg}</h1>
        
  
        
           <form action="place">
               <div class="product flex">
                <label for="">Product</label>
                <label for="">${list.productName}</label>
               </div>
               <div class="quantity flex">
                <label for="">quantity</label>
                <label for="">${list.productQuantity}</label>
               </div>
               <div class="price flex">
                <label for=""> Total Price</label>
                <label for="">${list.productPrice}</label>
               </div>
               <div class="sub">
                <a href="place?cartId=${list.id}&userEmail=${list.userEmail}&&productName=${list.productName}&&productQuantity=${list.productQuantity}&productPrice=${list.productPrice}&productCategory=${list.productCategory}">submit</a>
               </div>
            </form>
        

         
               
        </div>

    </div>

</body>
</html>