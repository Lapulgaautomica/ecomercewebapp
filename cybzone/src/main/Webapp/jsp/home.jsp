<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="/jsp/header.jsp"></jsp:include>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>cybzone.in</title>
 <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="stylesheet" href="/css/home.css">
</head>
<body>


  <div class="main">

        <div class="welcome">
        <h1>${cart}</h1>
            <h2>welcome to Cybzone.in</h2>
            <p class="p">shop your premium gadgets!!</p>
        </div>
       
 

    </div>
    <div class="products">
    <c:forEach items="${list}"  var="item">
        <div class="product">
            <img src="/images/${item.productName}.jpg" alt="">
            <div class="text">
                <p>${item.getProductName()}</p>
                <p>${item.getPrice()}</p>
                <a href="addtocart?id=${item.id}&&productName=${item.productName}&&productCategory=${item.productCatogery}&&ProductPrice=${item.price}&&ProductQuantity=1&&userEmail=${email}">add to cart</a>
            </div>
        </div>
    
    </c:forEach>
    
        
    </div>
    

</body>
</html>