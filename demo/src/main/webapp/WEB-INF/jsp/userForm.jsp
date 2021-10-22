<%--
  Created by IntelliJ IDEA.
  User: karolina
  Date: 17.10.2021
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<%--@elvariable id="user" type=""--%>
<form:form method="post" modelAttribute="user">
    Login: <form:input path="userName"/>
    Email: <form:input type="email" path="email"/>
    Password: <form:password path="password"/>
    <input type="submit"/>
</form:form>
