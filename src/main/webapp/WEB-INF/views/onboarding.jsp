<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="pl">

<!-- Header -->
<%@ include file="header.jsp" %>
<!-- End of Header -->

<body>

<div class="global-container">
    <div class="onboarding-background">
        <h1>Parametry id w sesji: ${sessionScope.idParams}</h1>
        <div class="onboarding-wrapper">
            <div class="onboarding-container">
                <div class="logo-area">
                    <span class="logo-icon"></span>
                </div>
                <div class="flag-pl-area">
                    <span class="flag-pl-icon" id="lang-pl"></span>
                </div>
                <div class="flag-eng-area">
                    <span class="flag-eng-icon" id="lang-eng"></span>
                </div>
            </div>
        </div>
    </div>
</div>

</body>

</html>
