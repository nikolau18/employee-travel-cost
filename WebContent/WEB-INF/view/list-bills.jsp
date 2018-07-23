<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div id="wrapper">
		<div id="header">
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			
			<table>
				
				<c:forEach var="tempBill" items="${bills}">
				
					<tr>
						<td>${tempBill.billId}</td>
						<td>${tempBill.businessTripId.businessTripId}</td>
						<td>${tempBill.type}</td>
						<td>${tempBill.amount}</td>
						<td>${tempBill.recieveDate}</td>
					</tr>
				
				</c:forEach>
				
			</table>
			
		</div>
	</div>
	
</body>
</html>