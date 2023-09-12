<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="pl">

<!-- Header -->
<%@ include file="/WEB-INF/views/header.jsp" %>
<!-- End of Header -->

<body>

<div class="global-container">
    <form:form method="POST"
               action="/cart"
               modelAttribute="order">
        <form:hidden path="tableNumber"/>
        <form:hidden path="restaurantId"/>
    </form:form>
</div>

</body>
</html>
