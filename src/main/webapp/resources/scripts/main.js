/**
 * Created by mil on 27.05.15.
 */

angular.module('app', ['ngRoute'])
    .config(['$routeProvider', '$httpProvider', '$locationProvider',
    function($routeProvider, $httpProvider, $locationProvider) {
        $locationProvider.html5Mode(true);
        $routeProvider.
            when('/', {
                templateUrl: '/resources/partials/index.html'
            })
            .when('/index', {
                templateUrl: '/resources/partials/index.html'
            })
            .when('/login', {
                templateUrl: '/resources/partials/login.html'
            })
            .when('/logout', {
                templateUrl: '/resources/partials/login.html',
                controller: "LogoutController",
                controllerAs: "logout"
            })
            .when('/user', {
                templateUrl: '/resources/partials/user.html',
                controller: "UserController",
                controllerAs: "user"
            })
            .when('/admin', {
                templateUrl: '/resources/partials/admin.html',
                controller: "AdminController",
                controllerAs: "admin"
            })
            .otherwise({
                redirectTo: '/'
            });

        $httpProvider.interceptors.push('Security');
    }]);

function Security($q, $location) {
    var responseError = function (reject) {
        console.log(reject.status);
        if (reject.status === 403) {
            $location.path("index");
        }

        return $q.reject(reject);
    };

    return {
        responseError: responseError
    };
}

function run($rootScope, $http, $location) {
    $rootScope.$on("$locationChangeSuccess", function () {
        //$http.get("/admin").then(function (responce) {
        //    console.log("1", responce);
        //});

        $http.get($location.path()).then(function (responce) {
            console.log("2", responce);
        });
    });
}

angular
    .module("app")
    .factory('Security', Security)
    .run(run);