<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="pl">

<!-- Header -->
<%@ include file="/WEB-INF/views/header.jsp" %>
<!-- End of Header -->

<body>

<div class="global-container">
    <div class="menu-global-container">

        <div class="logo-header">
            <span class="header-image"></span>
        </div>

        <div class="categories-menu-container">

        </div>

        <div class="menu-grid">
            <div class="menu-item">

            </div>
        </div>
    </div>
</div>

<script type="module" src="${pageContext.request.contextPath}/public/theme/js/fetchFunctions.js"></script>
<script type="module" src="${pageContext.request.contextPath}/public/theme/js/menu-rendering.js"></script>

</body>

</html>
