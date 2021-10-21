<%--
  Created by IntelliJ IDEA.
  User: karolina
  Date: 17.10.2021
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%--@elvariable id="client" type="text"--%>
<form:form method="post" modelAttribute="client">

    <form:hidden path="id"/>

    First name: <form:input path="firstName" /> <br />
    <form:errors path="firstName" /> <br />

    Last name: <form:input path="lastName" /> <br />
    <form:errors path="lastName" /> <br />

    PESEL: <form:input path="pesel" /> <br />
    <form:errors path="pesel"/> <br />

    Email: <form:input path="email" /> <br />
    <form:errors path="email" /> <br />

    <input type="submit">

</form:form>