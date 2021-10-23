<%--
  Created by IntelliJ IDEA.
  User: karolina
  Date: 17.10.2021
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%--<%@ page contentType="text/html; charset=UTF-8" %>--%>

<%--&lt;%&ndash;@elvariable id="client" type="text"&ndash;%&gt;--%>
<%--<form:form method="post" modelAttribute="client">--%>

<%--    <form:hidden path="id"/>--%>

<%--    First name: <form:input path="firstName" /> <br />--%>
<%--    <form:errors path="firstName" /> <br />--%>

<%--    Last name: <form:input path="lastName" /> <br />--%>
<%--    <form:errors path="lastName" /> <br />--%>

<%--    PESEL: <form:input path="pesel" /> <br />--%>
<%--    <form:errors path="pesel"/> <br />--%>

<%--    Email: <form:input path="email" /> <br />--%>
<%--    <form:errors path="email" /> <br />--%>

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
        <h6 class="m-0 font-weight-bold text-primary">Dodaj klienta</h6>
    </div>
    <div class="card-body">
        <div class="form-group">
            <form:form method="post" modelAttribute="client">

                <form:hidden path="id"/>
            <label for="firstName">Imie klienta</label>
                <form:input path="firstName" class="form-control"/>
                <form:errors path="firstName"/><br/><br/>
            <label for="lastName">Nazwisko Klienta</label>
                <form:input path="lastName" class="form-control"/>
                <form:errors path="client"/><br/><br/>
            <label for="pesel">PESEL</label>
                    <form:input path="pesel" class="form-control"/>
                    <form:errors path="pesel"/><br/><br/>
            <button type="submit" class="btn btn-primary">Zapisz</button>
            </form:form>
            <br/><br/>
            <a href="<c:url value="/clientsForm/list"/>"
               class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
                <i class="fas fa-download fa-sm text-white-50"></i> Lista klientów</a>
            <br/><br/>
            <a href="..">Powrót do strony głównej</a>
<%@ include file="../footer.jsp" %>