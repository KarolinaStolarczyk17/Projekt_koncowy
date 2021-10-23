<%--
  Created by IntelliJ IDEA.
  User: karolina
  Date: 17.10.2021
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%--<%@ page contentType="text/html; charset=UTF-8" %>--%>

<%--&lt;%&ndash;@elvariable id="insurance" type="text"&ndash;%&gt;--%>
<%--<form:form method="post" modelAttribute="insurance">--%>

<%--    <form:hidden path="id"/>--%>

<%--    Insurance number: <form:input path="insuranceNumber" /> <br />--%>
<%--    <form:errors path="insuranceNumber" /> <br />--%>

<%--    Insurance price: <form:input path="insurancePrice" /> <br />--%>
<%--    <form:errors path="insurancePrice" /> <br />--%>

<%--    Insurance status: <form:input path="isInsuranceActive" /> <br />--%>
<%--    <form:errors path="isInsuranceActive" /> <br />--%>

<%--    <input type="submit">--%>

<%--</form:form>--%>




<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Formularz dodawania zmian</title>
    <%@ include file="../header.jsp" %>

    <%--    <link href="<c:url value="../../../theme/css/sb-admin-2.css"/>" rel="stylesheet">--%>
</head>
<div class="d-sm-flex align-items-center justify-content-between mb-4">
</div>
<div class="container-fluid">
    <div class="card-header py-3">
        <h6 class="m-0 font-weight-bold text-primary">Dodaj polisę</h6>
    </div>
    <div class="card-body">
        <div class="form-group">
            <form:form method="post" modelAttribute="insurance">

                <form:hidden path="id"/>
            <label for="insuranceNumber">Numer polisy</label>
                <form:input path="insuranceNumber" class="form-control"/>
                <form:errors path="insuranceNumber"/><br/><br/>
            <label for="insurancePrice">Składka polisy</label>
                <form:input path="insurancePrice" class="form-control"/>
                <form:errors path="insurancePrice"/><br/><br/>
<%--            <label for="isInsuranceActive">Status polisy</label>--%>
<%--                <form:input path="isInsuranceActive" class="form-control"/>--%>
<%--                <form:errors path="isInsuranceActive"/><br/><br/>--%>
            <button type="submit" class="btn btn-primary">Zapisz</button>
            </form:form>
            <br/><br/>
            <a href="<c:url value="/insuranceForm/list"/>"
               class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
                <i class="fas fa-download fa-sm text-white-50"></i> Lista polis</a>
            <br/><br/>
            <a href="..">Powrót do strony głównej</a>
<%@ include file="../footer.jsp" %>