<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>

<html>
	<head>
		<title>Adding New Customer</title>
		<link type="text/css"
			  rel="stylesheet" 
			  href="${pageContext.request.contextPath}/resources/css/style.css">
			  
		<link type="text/css"
			  rel="stylesheet" 
			  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
	</head>

	<body>
		
		<div id = "wrapper">
		
			<div id="header">
				<h2>CRM - Customer Relationship Management</h2>
			</div>
			
			<div id="container">
				<h3>Save Customer</h3>
				<form:form action="saveCustomer" modelAttribute="customer" method="POST">
					
					<tabel>
						<tbody>
							<tr>
								<td><label>First Name:</label></td>
								<td><form:input path="firstName"/></td>
								
							</tr>
							
							<tr>
								<td><label>Last Name:</label></td>
								<td><form:input path="lastName"/></td>
								
							</tr>
							
							<tr>
								<td><label>Email:</label></td>
								<td><form:input path="email"/></td>
								
							</tr>
							
							<tr>
								<td><label></label></td>
								<td><input type="submit" value="Save"/></td>
								
							</tr>
						</tbody>
					</tabel>
				
				</form:form>
				
				<div style="clear; both;"></div>
				
				<p>
					<a href="${pageContext.request.contextPath}/customer/list"> Back To List </a>
				</p>
			
			</div>
		</div>
		
	
	</body>

</html>