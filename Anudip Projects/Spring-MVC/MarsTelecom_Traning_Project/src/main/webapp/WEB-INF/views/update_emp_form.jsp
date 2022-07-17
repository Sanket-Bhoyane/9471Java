<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>
<div class="container mt-3">

		<div class="row">

			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Change Employee Details</h1>

				<form action="${pageContext.request.contextPath }/handle-emp" method="post">
				<input type="hidden" value="${employee.e_id}" name="e_id"/>
					<div class="form-group">
						<label for="name">Employee Name</label> <input type="text"
							class="form-control" 
							id="name" aria-describedby="emailHelp"
							name="name"
							 placeholder="Enter the employee name here"
							 value="${employee.name}" >
					</div>


					<div class="form-group">

						<label for="email">Employee Email</label>
						<textarea class="form-control"
						 name="email" 
						 id="email"
							rows="5" 
							placeholder="Enter the employee email"
						    value="${emp.email }" ></textarea>
					</div>



					<div class="form-group">
						<label for="age">Employee Age</label> <input 
						type="text"
							placeholder="Enter Employee Age"
							 name="age"
							class="form-control" 
							id="age"
							value="${emp.age}">
					</div>

					<div class="container text-center">

						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-danger">Back</a>


						<button type="submit" class="btn btn-warning">Update</button>
					</div>
				</form>


			</div>

		</div>

	</div>

</body>
</html>