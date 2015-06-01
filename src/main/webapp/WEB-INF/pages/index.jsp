<%--
  Created by IntelliJ IDEA.
  User: mil
  Date: 27.05.15
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="true"%>
<!doctype html>
<html lang="en" ng-app="app">
<head>
  <link rel="stylesheet" href="/resources/libs/bootstrap/dist/css/bootstrap.min.css">
  <script src="/resources/libs/angular/angular.js"></script>
  <script src="/resources/libs/angular-route/angular-route.js"></script>
  <script src="/resources/scripts/main.js"></script>

  <script src="resources/scripts/controllers/LogoutController.js"></script>
  <script src="resources/scripts/controllers/AdminController.js"></script>
  <script src="resources/scripts/controllers/UserController.js"></script>
  <meta charset="utf-8">



    <title>${title}</title>
  <base href="/">
</head>
<body>





<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
              aria-expanded="false" aria-controls="navbar">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" ng-href="/">
        <c:if test="${pageContext.request.userPrincipal.name != null}">
           Welcome: ${pageContext.request.userPrincipal.name}
        </c:if>
      </a>
    </div>
    <div id="navbar" class="collapse navbar-collapse">
      <ul class="nav navbar-nav">
        <li><a ng-href="/user">User</a></li>
        <li><a ng-href="/admin">Admin</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li>
          <c:if test="${pageContext.request.userPrincipal.name == null}">
            <a ng-href="<c:url value="/login" />" > Login</a></h2>
          </c:if>
        </li>
        <li>
          <c:if test="${pageContext.request.userPrincipal.name != null}">
            <a ng-href="<c:url value="/logout" />" > Logout</a></h2>
          </c:if>
        </li>
      </ul>
    </div>
    <!--/.nav-collapse -->
  </div>
</nav>


<section class="container" style="background-color: rgba(255,255,255,0.8); padding: 70px 50px;" ng-view=""></section>

</body>
</html>

