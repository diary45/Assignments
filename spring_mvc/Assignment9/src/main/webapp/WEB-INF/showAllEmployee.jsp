
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"  %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


  <html>
  <body>
           <table border="3">
               <th>Employee EmployeeID</th>
               <th>Employee EmployeeName</th>
               <th>Employee EmployeeSalary</th>

              <c:forEach items="${list}" var="emp">
                  <tr>

                     <td><c:out value="${emp.empId}" /></td>
                     <td><c:out value="${emp.empName}" /></td>
                     <td><c:out value="${emp.empSalary}" /></td>



                  </tr>
                  </c:forEach>
           </table>

            <c:forEach  var="emp" begin="1" end="${length}">
               <a href="http://localhost:8080/Assignment9/view/${emp}"> ${emp}</a>
            </c:forEach>







  </body>
  </html>
