angular.module("timeshots", ['ngRoute', 'HomeCtrl', 'LoginCtrl', ])
.config(['$routeProvider',
    function($routeProvider){
        console.log("------->>>>>> app.js");
        $routeProvider.
        when('/home', {
            templateUrl: 'partials/home.html',
            controller: 'HomeCtrl'
        })
        when.when('/login', {
            templateUrl: 'partials/login.html',
            controller: 'LoginCtrl'
        })
        when.otherwise({
            redirectTo: '/home'
        });
    }
])
.controller('HomeCtrl', ['$scope', '$location', '$rootScope', '$http',
    function($scope, $location, $rootScope, $http){
        
    }
])
.controller('LoginCtrl', ['$scope', '$location', '$rootScope', '$http',
    function($scope, $location, $rootScope, $http){

    }
]);