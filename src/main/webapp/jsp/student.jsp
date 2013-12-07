<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>

</head>
<body>

	<h2>Student Information</h2>
	<form:form method="POST" commandName="student"  action="/SpringMVC/addStudent">

		<table >
			<tr>
				<td><form:label path="firstName">Name</form:label></td>
				<td><form:input path="firstName" /></td>
				<td><form:errors path="firstName" cssclass="error"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="lastName">Last Name</form:label></td>
				<td><form:input path="lastName" /></td>
				<td><form:errors path="lastName" cssclass="error"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssclass="error"></form:errors></td>
			</tr>
 			<tr>
				<td><form:label  path="dateOfBirth">DOB</form:label></td>
				<td><form:input path="dateOfBirth" id="dateOfBirth" placeholder="MM/DD/YYYY"/></td>
				<td><form:errors path="dateOfBirth" cssclass="error"></form:errors></td>
			</tr> 
			<tr>
				<td><form:label path="age">Age</form:label></td>
				<td><form:input path="age" /></td>
				<td><form:errors path="age" cssclass="error"></form:errors></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit"
					value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>