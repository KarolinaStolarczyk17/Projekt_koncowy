<%--
  Created by IntelliJ IDEA.
  User: karolina
  Date: 17.10.2021
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%--<h2>Czy chcesz usunac klienta ${client.lastName} ?</h2>--%>

<%--<form method="post">--%>
<%--    <input type="hidden" name="toRemoveId" value="${client.id}">--%>
<%--    <button type="submit" value="yes" name="confirmed">TAK</button>--%>
<%--    <button type="submit" value="no" name="confirmed">NIE</button>--%>
<%--</form>--%>




<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <title>Usuwanie</title>
    <%@ include file="../header.jsp" %>
    <link href="<c:url value="../../../theme/css/sb-admin-2.css"/>" rel="stylesheet">
</head>
<h3>Czy chcesz usunąć ten klienta: ${client.lastName} ?</h3>
<br/><br/>
<div class="form-group">
    <form method="post">
        <input type="hidden" name="toRemoveId" value="${client.id}"><br/><br/>
        <button type="submit" value="yes" name="confirmed" class="btn btn-primary">TAK</button>
        <button type="submit" value="no" name="confirmed" class="btn btn-primary">NIE</button><br/><br/>
    </form>
    <br/><br/>
    <a href="..">Powrót do strony głównej</a>
<%@ include file="../footer.jsp" %>