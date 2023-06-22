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
    <link rel="stylesheet" href="/css/cart.css">
</head>
<body>

<div class="cart">
<h1 style="padding: 2rem">your orders</h1>
        <form action="" class="frm" method="post">

            <table>
    
                <tr>
                <th>
                        Order ID
                    </th>
                    <th>
                        product
                    </th>
                    <th>
                        category
                    </th>
                    <th>
                        quantity
                    </th>
                     <th>
                        ordered date 
                    </th>
                    <th>
                        price
                    </th>
                    <th>
                        checkout
                    </th>
                </tr>  
                 
                <c:forEach items="${list}" var="item">
                
                   <tr>
                    <td>
                       ${item.getOrderId()}
                    </td>
           
                    <td>
                       ${item.getProductName()}
                    </td>
                    <td>
                    ${item.getProductCategory()}
                    </td>
                       <td>
                    ${item.getDateAndTime()}
                    </td>
                    
                    <td>
                         ${item.getProductQuantity()}
                    </td>
                    <td>
                         ${item.getProductPrice()}
                    </td>
                    <td>
                        <a href="cancel?id=${item.orderId}">cancel order</a>
                    </td>
                </tr>
                
                
                </c:forEach> 
             
                
                
                 
            </table>
            <input type="submit" class="check" value="checkout all">
        </form>


    </div>

</body>
</html>