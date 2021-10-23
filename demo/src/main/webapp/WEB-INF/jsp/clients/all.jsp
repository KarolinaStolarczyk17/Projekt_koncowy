<%--
  Created by IntelliJ IDEA.
  User: karolina
  Date: 17.10.2021
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page contentType="text/html; charset=UTF-8" %>--%>

<%--<h2> Lista wszystkich klientów</h2>--%>

<%--<a href="add">--%>
<%--    Dodaj nowego klienta--%>
<%--</a>--%>

<%--<c:forEach items="${allClient}" var="client">--%>
<%--    <br />--%>
<%--    ------------------------------%>
<%--    <br />--%>
<%--    ${client.firstName} <br />--%>
<%--    ${client.lastName} <br />--%>
<%--    ${client.pesel} <br />--%>
<%--    ${client.email} <br />--%>


<%--    <a href="edit?idToEdit=${client.id}">--%>
<%--        Edytuj--%>
<%--    </a>--%>
<%--    </br />--%>
<%--    <a href="remove?toRemoveId=${client.id}">--%>
<%--        Usun--%>
<%--    </a>--%>
<%--    <br />--%>

<%--    ------------------------------%>
<%--    <br />--%>

<%--</c:forEach>--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <title>Klienci</title>
    <%@ include file="../header.jsp" %>
<%--    <link href="<c:url value="../../../theme/css/sb-admin-2.css"/>" rel="stylesheet">--%>
</head>
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <a href="<c:url value="add"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class="fas fa-download fa-sm text-white-50"></i> Dodaj klienta</a>
    </div>
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Lista klientów</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table">
                    <tr>
                        <td><b>Imie klienta</b></td>
                        <td><b>Nazwisko klienta</b></td>
                        <td><b>PESEL</b></td>
                        <td><b>email</b></td>
                        <td><b>Edycja</b></td>
                        <td><b>Usuwanie</b></td>
                    </tr>
                    <c:set var="expTotal" value="${0}"/>
                    <c:forEach items="${allClients}" var="client">
                        <c:set var="clientTotal" value="${clientTotal + client.client}"/>
                        <tr>
                            <td> ${client.firstName} </td>
                            <td> ${client.lastName} </td>
                            <td> ${client.PESEL} </td>
                            <td> ${client.email}</td>
                            <td><a href="edit?idToEdit=${client.id}">Edytuj</a></td>
                            <td><a href="remove?toRemoveId=${client.id}">Usuń</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
    Klienci: ${expTotal} <br/>
    <a href="..">Powrót do strony głównej</a>
</div>

<%@ include file="../footer.jsp" %>
</html>
