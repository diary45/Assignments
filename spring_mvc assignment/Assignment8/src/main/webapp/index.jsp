
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored = "false"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<a href="http://localhost:8080/Assignment8/english">Login(English)</a>
<a href="http://localhost:8080/Assignment8/french">Login(French)</a>
<a href="http://localhost:8080/Assignment8/vietnamese">Login(vietnamese)</a>
<form>
    ${username}<input type="text">
    ${password}<input type="password">
    <submit>${login}</submit>

</form>
</body>
</html>
