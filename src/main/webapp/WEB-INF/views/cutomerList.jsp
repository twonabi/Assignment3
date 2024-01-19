<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>
<body>

    <div class="container">
     <h2>Online Shopping</h2>
     <div class="card">
      <div class="card-header">customer</div>
      <div class="card-body">
      <table class="table table-bordered table-hover">
       <thead>
       <tr>
        <th>고객아이디</th>
        <th>비밀번호</th>
        <th>고객이름</th>
        <th>나이</th>
        <th>등급</th>
        <th>직업</th>
        <th>적립금</th>
       </tr>
       </thead>
       <tbody>
       <c:forEach var="customers" items="${list}">
         <tr>
          <td>${customer.customerId}</td>
          <td>${customer.password}</td>
          <td>${customer.customerName}</td>
          <td>${customer.age}</td>
          <td>${customer.rating}</td>
          <td>${customer.occupation}</td>
          <td>${customer.reserves}</td>
        </tr>
        </c:forEach>
       </tbody>
      </table>

      </div>
      <div class="card-footer">@2024 Online Shopping Cart_1조_김지안</div>
    </div>
    </div>

<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>