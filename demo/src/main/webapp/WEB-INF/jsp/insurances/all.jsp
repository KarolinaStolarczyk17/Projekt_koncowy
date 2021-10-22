<%--
  Created by IntelliJ IDEA.
  User: karolina
  Date: 17.10.2021
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page contentType="text/html; charset=UTF-8" %>--%>

<%--<h2> Lista wszystkich polis</h2>--%>

<%--<a href="add">--%>
<%--    Dodaj nowa polise--%>
<%--</a>--%>

<%--<c:forEach items="${insuranceList}" var="insurance">--%>
<%--    <br />--%>
<%--    ------------------------------%>
<%--    <br />--%>
<%--    ${insurance.insuranceNumber} <br />--%>
<%--    ${insurance.insurancePrice} <br />--%>
<%--    ${insurance.isInsuranceActive} <br />--%>

<%--    <a href="edit?idToEdit=${insurance.id}">--%>
<%--        Edytuj--%>
<%--    </a>--%>
<%--    </br />--%>
<%--    <a href="remove?toRemoveId=${insurance.id}">--%>
<%--        Usun--%>
<%--    </a>--%>
<%--    <br />--%>

<%--    ------------------------------%>
<%--    <br />--%>

<%--</c:forEach>--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Lista wszystkich polis</title>
    <%@ include file="../header.jsp" %>
<%--    <link href="<c:url value="../../../theme/css/sb-admin-2.css"/>" rel="stylesheet">--%>
</head>
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <a href="<c:url value="add"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class="fas fa-download fa-sm text-white-50"></i> Dodaj polise</a>
    </div>
    <div class="card-body">
        <div class="table-responsive">
            <table class="table">
                <tr>
                    <td><b>Polisy</b></td>
                    <td><b>Edycja</b></td>
                    <td><b>Usuwanie</b></td>
                </tr>

                <tr>
                    <c:forEach items="${allInsurance}" var="insurance">
                    <td>${allInsurance.insuranceNumber}</td>
                <tr><
                    <td> ${insurance.insuranceNumber}
                    <td/>
                    <td> ${insurance.insurancePrice}
                    <td/>
                    <td> ${insurance.isInsuranceActive}
                    <td/>


                    <td><a href="edit?idToEdit=${insurance.id}">Edytuj</a></td>
                    <td><a href="remove?toRemoveId=${insurance.id}">Usuń</a></td>
                </tr>

                </c:forEach>
            </table>
        </div>
    </div>
</div>
<a href="..">Powrót do strony głównej</a>
</div>
<%@ include file="../footer.jsp" %>