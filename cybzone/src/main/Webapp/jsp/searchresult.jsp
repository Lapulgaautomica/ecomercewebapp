<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <jsp:include page="/jsp/header.jsp"></jsp:include>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <div class="cart">
        <form action="" class="frm" method="post">

            <table>
    
                <tr>
                <th>
                        product ID
                    </th>
                    <th>
                        product
                    </th>
                    <th>
                        category
                    </th>
                  
                    <th>
                        price
                    </th>
                    <th>
                        checkout
                    </th>
                </tr>  
                 
      
                
                   <tr>
                    <td>
                       ${list.getId()}
                    </td>
           
                    <td>
                       ${list.getProductName()}
                    </td>
                    <td>
                    ${list.getProductCatogery()}
                    </td>
               
                    <td>
                         ${list.getPrice()}
                    </td>
                    <td>
                        <a href="cartcheckout?id=${item.id}&&productName=${item.productName}&&productCategory=${item.productCategory}&&productPrice=${item.productPrice}&&productQuantity=${item.productQuantity}&&userEmail=${item.userEmail}">check out</a>
                    </td>
                </tr>
                
                
       
             
                
                
                 
            </table>
            <input type="submit" class="check" value="checkout all">
        </form>


    </div>
    




</body>
</html>