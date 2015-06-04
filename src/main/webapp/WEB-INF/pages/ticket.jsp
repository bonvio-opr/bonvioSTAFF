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


<div class="panel panel-default">
    <!-- Default panel contents -->
    <div class="panel-heading">Список задач</div>
    <div class="panel-body">
        <p>В данном разделе отображен список созданных ранее задач. Вы можете добавить новую задачу или удалить созданную ранее.</p>
    </div>

    <!-- Table -->
    <table class="table">
        <%--<tr>
            <th></th>
            <th></th>
            <th></th>
            <th></th>
        </tr>--%>
        <tr ng-repeat="single in ticket.list">
            <td></td>
            <td>
                <h4 class="list-group-item-heading">{{single.name}}</h4>
                <p class="list-group-item-text">{{single.description}}</p>
            </td>
            <td>
                <button class="btn btn-danger" ng-click="ticket.deleteTicket(single)">Удалить</button>
            </td>
            <td>
                <span class="badge">{{single.dateCreate}}</span>
            </td>
        </tr>
    </table>
</div>



<%--<ul class="list-group">
    <li class="list-group-item" ng-repeat="single in ticket.list">
        <span class="badge">{{single.dateCreate}}</span>
        <h4 class="list-group-item-heading">{{single.name}}</h4>
        <p class="list-group-item-text">{{single.description}}</p>
    </li>
</ul>--%>
</body>
</html>