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
<style>
    .header {
        background-color: black;
        color: white;
        padding: 30px;
        text-align: center;
    }

    .footer {
        background-color: black;
        color: white;
        padding: 10px;
        text-align: center;
    }
</style>
</head>
<body>

<div class="header">
    <h2>Online Shopping</h2>
</div>

<div class="container">
    <div class="row">
        <div class="col-md-4">
            <!-- 로그인 폼 추가 -->
            <div class="card">
                <div class="card-header">Login</div>
                <div class="card-body">
                    <form action="/login" method="post">
                        <div class="form-group">
                            <label for="username">Username:</label>
                            <input type="text" class="form-control" id="username" name="username">
                        </div>
                        <div class="form-group">
                            <label for="password">Password:</label>
                            <input type="password" class="form-control" id="password" name="password">
                        </div>
                        <button type="submit" class="btn btn-primary">Login</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-md-8">
            <h2></h2>
            <div class="card">
                <div class="card-header">Products</div>
                <div class="card-body">
                    <button type="button" class="btn btn-secondary" onclick="location.href='/shopping/cartlist'">my cart list</button>
                    <table class="table table-bordered table-hover">
                        <thead>
                        <tr>
                            <th>제품번호</th>
                            <th>제품명</th>
                            <th>재고량</th>
                            <th>가격</th>
                            <th>제조업체</th>
                            <th>주문</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="products" items="${list}">
                            <tr>
                                <td>${products.productNumber}</td>
                                <td>${products.productName}</td>
                                <td>${products.inventory}</td>
                                <td>${products.price}</td>
                                <td>${products.manufacturer}</td>
                                <button type="button" class="btn btn-link">Add to Cart</button>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="footer">
                    @2024 Online Shopping Cart_1조_김지안
                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>