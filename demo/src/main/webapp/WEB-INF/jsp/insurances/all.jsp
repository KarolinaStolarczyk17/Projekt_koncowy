<%--
  Created by IntelliJ IDEA.
  User: karolina
  Date: 17.10.2021
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<h2> Lista wszystkich polis</h2>

<a href="add">
    Dodaj nowa polise
</a>

<c:forEach items="${allInsurance}" var="insurance">
    <br />
    ----------------------------
    <br />
    ${insurance.insuranceNumber} <br />
    ${insurance.insurancePrice} <br />
    ${insurance.isInsuranceActive} <br />

    <a href="edit?idToEdit=${insurance.id}">
        Edytuj
    </a>
    </br />
    <a href="remove?toRemoveId=${insurance.id}">
        Usun
    </a>
    <br />

    ----------------------------
    <br />

</c:forEach>