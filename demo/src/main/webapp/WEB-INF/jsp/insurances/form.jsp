<%--
  Created by IntelliJ IDEA.
  User: karolina
  Date: 17.10.2021
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<%--@elvariable id="insurance" type="text"--%>
<form:form method="post" modelAttribute="insurance">

    <form:hidden path="id"/>

    Insurance number: <form:input path="insuranceNumber" /> <br />
    <form:errors path="insuranceNumber" /> <br />

    Insurance price: <form:input path="insurancePrice" /> <br />
    <form:errors path="insurancePrice" /> <br />

    Insurance status: <form:input path="isInsuranceActive" /> <br />
    <form:errors path="isInsuranceActive" /> <br />

    <input type="submit">

</form:form>


