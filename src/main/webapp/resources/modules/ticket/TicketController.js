function TicketController(TicketService) {
    var ticket = this;
    ticket.list = [];
    ticket.single = {};
    ticket.getTickets = function () {
        TicketService.getTickets().then(function (data) {
            ticket.list = data.reverse();
        });
    };
    ticket.insertTicket = function() {
        TicketService.insertTicket(ticket.single).then(function (data) {
            ticket.list.unshift(data);
        });

        ticket.single = {};
    };
    ticket.deleteTicket = function (single) {
        TicketService.deleteTicketById(single.id).then(function (data) {
            ticket.list.splice(ticket.list.indexOf(single), 1)
        });
    };
}

angular
    .module("staff")
    .controller("TicketController", TicketController);