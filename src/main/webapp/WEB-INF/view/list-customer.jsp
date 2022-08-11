<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
	
		<title>List Customers</title>
		<link type="text/css"
			  rel="stylesheet" 
			  href="${pageContext.request.contextPath}/resources/css/style.css">
	</head>

	<body>
		
		<div id = "wrapper">
		
			<div id="header">
				<h2>CRM - Customer Relationship Management</h2>
			</div>
		
			<div id="container">
				
				<!-- Add new customer button -->
				<input type="button" value="Add Customer"
				 onclick="window.location.href='showFormForAdd'; return false;" /> <!-- so when we click the button it's call spring 
				 																	controller mapping, shoFormForAdd -->
			
				<div id="content">
					<!-- add our html tabel -->
					<table>
						<tr>
							<th>
								First Name
							</th>
							<th>
								Last Name
							</th>
							<th>
								Email
							</th>
							
						</tr>
					
						<!-- loop over and print our customers -->
						<c:forEach var="tempCustomer" items="${customers}">
							<tr>
								<td> ${tempCustomer.firstName } </td>
								<td> ${tempCustomer.lastName } </td>
								<td> ${tempCustomer.email } </td>
									
						    </tr>
						</c:forEach>
					</table>
					
				</div>
			</div>
		</div>
	</body>

</html>