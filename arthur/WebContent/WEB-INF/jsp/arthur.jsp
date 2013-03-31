<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Arthur</title>
</head>
<body>
	<article>
		<section>
			<h1>Arthur, Knight of the Round Table</h1>
		</section>
		<section>
			<h2>Quests</h2>
		</section>
		<section>
			<h2>Equipment</h2>
			<table>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Condition</th>
				</tr>
				<c:forEach items="${weapons}" var="w">
					<tr>
						<td>${w.id}</td>
						<td>${w.name}</td>
						<td>${w.condition}</td>						
					</tr>
				</c:forEach>
			</table>
		</section>
	</article>
</body>
</html>