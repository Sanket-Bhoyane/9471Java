<html>
<head>
<%@include file="./base.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<div class="container mt-3">
<div class="row">
<div class="col-md-12">
<h1 class="text-center mb-3">Welcome To Mars Telecom</h1>

<table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Employee Name</th>
      <th scope="col">Employee Email</th>
      <th scope="col">Employee Age</th>
            <th scope="col">Action</th>
      
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${empl}" var="e">
    <tr>
      <th scope="row">${e.e_id}</th>
      <td>${e.name}</td>
      <td>${e.email}</td>
      <td>${e.age}
      </td>
      <td>
      <a href="delete/${e.e_id}"><i class="fa-solid fa-trash-can text-danger"style="font-size: 20px"></i></a>
      <a href="update/${e.e_id}"><i class="fa-solid fa-pen-to-square"style"="font-size: 20px"></i></a>
      </td>
    </tr>
    </c:forEach>
  </tbody>
</table>
<div class="container text-center">
<a href="addemp" class="btn btn-outline-success">Add Employee</a>
</div>
</div>
</div>
</div>
</body>
</html>
