<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>



</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	
	first name: <form:input path="firstName" />
	
	<br><br>
	
	last name: <form:input path="lastName" />
	
	<br><br>
	
	<input type="submit" value="Submit" />
	
	</form:form>


</body>




</html>