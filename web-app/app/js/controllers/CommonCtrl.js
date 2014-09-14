"use strict";

angular.module('CommonCtrl', [])
    .controller('CommonCtrl', ['$scope', '$location', '$rootScope', '$http',
        function($scope, $location, $rootScope, $http) {

            $scope.isActive = function(route) {
                console.log("-------------------->>> "+route);
                return route === $location.path();
            }
            $scope.app = {
                name: 'Timeshots'
            };
        }
    ])