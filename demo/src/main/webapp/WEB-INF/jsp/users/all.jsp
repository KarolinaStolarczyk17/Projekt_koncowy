<%--
  Created by IntelliJ IDEA.
  User: karolina
  Date: 17.10.2021
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<h2> Lista wszystkich uzytkownikow</h2>

<a href="add">
    Dodaj nowego uzytkownika
</a>

<c:forEach items="${allUsers}" var="user">
    <br />
    ----------------------------
    <br />
    ${user.userName} <br />
    ${user.email} <br />

    <a href="edit?idToEdit=${user.id}">
        Edytuj
    </a>
    </br />
    <a href="remove?toRemoveId=${user.id}">
        Usun
    </a>
    <br />

    ----------------------------
    <br />

</c:forEach>