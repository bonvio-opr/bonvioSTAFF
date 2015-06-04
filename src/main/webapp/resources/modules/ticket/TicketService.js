function TicketService($http) {
    this.getTickets = function () {
        return $http.get("ticket/getTickets").then(function (response) {
            if (response.status == 200) return response.data;
        });
    };

    this.insertTicket = function (ticket) {
        return $http.post("ticket/insertTicket", ticket).then(function (response) {
            if (response.status == 200) return response.data;
        });
    };

    this.deleteTicketById = function (ticketId) {
        console.log(ticketId);
        return $http.delete("ticket/deleteTicketById/" + ticketId).then(function (response) {
            console.log(response);
            if (response.status == 200) return response.data;
        });
    };
}

angular
    .module("staff")
    .service("TicketService", TicketService);