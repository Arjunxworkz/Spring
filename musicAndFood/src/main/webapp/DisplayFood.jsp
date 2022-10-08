<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display food</title>
</head>
<body>
<h1>Food Details</h1>
	<table>
		<thead>
			<tr>
				<th>ItemName</th>
				<th>Price</th>
				<th>HotelName</th>
				<th>Type</th>
				<th>Location</th>
				<th>Ordered</th>
				<th>Quantity</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.itemName}</td>
					<td>${dto.price}</td>
					<td>${dto.hotalName}</td>
					<td>${dto.hotalType}</td>
					<td>${dto.hotalLocation}</td>
					<td>${dto.orderd}</td>
					<td>${dto.quantity}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>