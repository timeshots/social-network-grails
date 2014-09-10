"use strict";

angular.module('AuthInterceptor', [])
    .factory('AuthInterceptor', function($rootScope, $q, $window) {
        return {
            request: function(config) {
                config.headers = config.headers || {};
                var deferred = $q.defer();
                if (localStorage['authToken']) {
                    config.headers.Authorization = 'Bearer ' + localStorage['authToken'];
                } else if (sessionStorage['authToken']) {
                    config.headers.Authorization = 'Bearer ' + sessionStorage['authToken'];
                }
                return config || $q.when(config);
            },
            requestError: function(rejection) {
                return $q.reject(rejection);
            },
            response: function(response) {
                return response || $q.when(response);
            },
            responseError: function(rejection) {
                return $q.reject(rejection);
            }
        };
    });