<html>
<head>
<%@include file="./base.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<div class="container mt-3">
<div class="row">
<div class="col-md-12">
<h1 class="text-center mb-3">Welcome To My Mobile Shopiee</h1>

<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Product Name</th>
      <th scope="col">Product Description</th>
      <th scope="col">Product Price</th>
        <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
     <c:forEach items="${products}" var="p">
    <tr>
      <th scope="row">${p.id}</th>
      <td>${p.name}</td>
      <td>${p.description}</td>
      <td>${p.price}</td>
      <td>
      
      <a href="delete/${p.id}"><i class="fa-solid fa-trash-can text-danger"style="font-size: 20px"></i></a>
      <a href="update/${p.id}"><<i class="fa-solid fa-pen-to-square"style"="font-size: 20px"></i></a>
      
      </td>
    </tr>
    
 </c:forEach>
  </tbody>
</table>
<div class="container text-center">
<a href="addproduct" class="btn btn-outline-success">Add Product</a>
</div>
</div>
</div>
</div>
</body>
</html>
