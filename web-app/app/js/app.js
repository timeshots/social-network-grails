angular.module('timeshots', [
    'ngRoute',
    'AutoFocusDirective',,
    'SessionService',
    'UserService',
    'CommonCtrl',
    'LoginCtrl',
    'RegistrationCtrl',
    'DashboardCtrl'
])

.config(['$routeProvider', '$httpProvider',
    function($routeProvider, $httpProvider) {
        $routeProvider
            .when('/home', {
                templateUrl: 'partials/home.html',
                controller: 'HomeCtrl'
            })
            .when('/dashboard', {
                templateUrl: 'partials/dashboard.html',
                controller: 'DashboardCtrl',
                resolve: requiresAuthentication
            })
            .when('/login', {
                templateUrl: 'partials/login.html',
                controller: 'LoginCtrl'
            })
            .when('/signup', {
                templateUrl: 'partials/registration.html',
                controller: 'RegistrationCtrl'
            })
            .when('/confirmEmail', {
                templateUrl: 'partials/confirmEmail.html',
                controller: 'ConfirmCtrl'
            })
            .otherwise({
                redirectTo: '/dashboard'
            });

        $httpProvider.interceptors.push('AuthInterceptor');
    }
]);

var app = angular.module('app', []).config(function($routeProvider){
    $routeProvider.when('/login', {
        templateUrl : 'partials/login.html',
        controller  : 'LoginCtrl'
    })

    $routeProvider.when('/home', {
        templateUrl : 'partials/home.html',
        controller  : 'HomeCtrl'
    })
});