<%--
  Created by IntelliJ IDEA.
  User: karolina
  Date: 17.10.2021
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<h2>Czy chcesz usunac polise ${insurance.insuranceNumber} ?</h2>

<form method="post">
    <input type="hidden" name="toRemoveId" value="${insurance.id}">
    <button type="submit" value="yes" name="confirmed">TAK</button>
    <button type="submit" value="no" name="confirmed">NIE</button>
</form>