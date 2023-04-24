<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>File Upload Application</h1>
<hr>
<form:form method="post" action="save.htm" modelAttribute="uploadForm" enctype="multipart/form-data">
Please select a file to Upload: <input type="file" name="file">
<br><br>
<input type="submit" value="UPLOAD">
</form:form>
</body>
</html>