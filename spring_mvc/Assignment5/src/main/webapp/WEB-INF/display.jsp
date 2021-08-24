
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"  %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<form action="add">
    <h1>add employee here</h1>
   EmployeeName <input type="text" name="employeeName"><br>
   Employee Department <input type="text" name="employeeDept"><br>
   EmployeeDesignation <input type="text" name="employeeDesignation"><br>
   Employee Salary <input type="text" name="employeeSal"><br>
   Employee ID <input type="text" name="employeeID"><br>
    <input type="submit" value="Add employee">
    <br>
    <br>

</form>

<form action="delete">
    <h1>delete employee here</h1>

   Employee ID <input type="text" name="employeeID"><br>
    <input type="submit" value="delete employee">

</form>


<form action="update">
    <h1>update employee here</h1>
   EmployeeName <input type="text" name="employeeName"><br>
   Employee Department <input type="text" name="employeeDept"><br>
   EmployeeDesignation <input type="text" name="employeeDesignation"><br>
   Employee Salary <input type="text" name="employeeSal"><br>
   Employee ID <input type="text" name="employeeID"><br>
    <input type="submit" value="update employee">
    <br>
    <br>

</form>
<table border="3">
    <th>Employee Name</th>
    <th>Employee Dept</th>
    <th>Employee Role</th>
    <th>Employee Salary</th>
    <th>Employee ID</th>
    <c:forEach items="${list}" var="emp">
    <tr>

       <td><c:out value="${emp.employeeName}" /></td>
       <td><c:out value="${emp.employeeDept}" /></td>
       <td><c:out value="${emp.employeeDesignation}" /></td>
       <td><c:out value="${emp.employeeSal}" /></td>
       <td><c:out value="${emp.employeeID}" /></td>

    </tr>
    </c:forEach>
</table>




</body>
</html>