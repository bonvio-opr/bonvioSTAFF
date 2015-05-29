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
            }).
            when('/index', {
                templateUrl: '/resources/partials/index.html'
            }).
            /*when('/login', {
                templateUrl: '/resources/partials/login.html'
            }).*/
            /*when('/logout', {
                templateUrl: '/resources/partials/login.html'
            }).*/
            /*when('/user', {
                templateUrl: '/resources/partials/index.html'
            }).
            when('/admin', {
                templateUrl: '/resources/partials/index.html'
            }).*/
            otherwise({
                redirectTo: '/'
            });
    }]);
