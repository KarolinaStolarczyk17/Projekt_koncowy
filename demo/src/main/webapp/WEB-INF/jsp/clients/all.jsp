<%--
  Created by IntelliJ IDEA.
  User: karolina
  Date: 17.10.2021
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<h2> Lista wszystkich klientów</h2>

<a href="add">
    Dodaj nowego klienta
</a>

<c:forEach items="${allClient}" var="client">
    <br />
    ----------------------------
    <br />
    ${client.firstName} <br />
    ${client.lastName} <br />
    ${client.pesel} <br />
    ${client.email} <br />


    <a href="edit?idToEdit=${client.id}">
        Edytuj
    </a>
    </br />
    <a href="remove?toRemoveId=${client.id}">
        Usun
    </a>
    <br />

    ----------------------------
    <br />

</c:forEach>