<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true"%>
<!doctype html>
<html lang="ru" ng-app="staff">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.css">
    <script src="bower_components/angular/angular.js"></script>
    <script src="modules/main.js"></script>
    <script src="modules/ticket/TicketService.js"></script>
    <script src="modules/ticket/TicketController.js"></script>
</head>
<body ng-controller="TicketController as ticket" ng-init="ticket.getTickets()" class="container">
<br>
<form>
    <fieldset>
        <div class="form-group">
            <label for="ticketName">Название</label>
            <input type="text" id="ticketName" class="form-control" placeholder="Почистить банан"
                   ng-model="ticket.single.name">
        </div>
        <div class="form-group">
            <label for="ticketDescription">Описание</label>
            <textarea class="form-control" rows="3" id="ticketDescription"
                      placeholder="Банан не чищен, срочно нужна помощь"
                      ng-model="ticket.single.description"></textarea>
        </div>
        <button type="submit" class="btn btn-primary" ng-click="ticket.insertTicket()">Добавить</button>
    </fieldset>
</form>
<hr>
<ul class="list-group">
    <li class="list-group-item" ng-repeat="single in ticket.list">
        <span class="badge" ng-click="ticket.deleteTicket(single)">Удалить</span>
        <h4 class="list-group-item-heading">{{single.name}}</h4>
        <p class="list-group-item-text">{{single.description}}</p>
    </li>
</ul>
</body>
</html>