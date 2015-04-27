'use strict';

var AngularSpringApp = {};

var app = angular.module('AngularSpringApp', [ 'ngResource','ngRoute'])
	.directive('myPostRepeatDirective', function($timeout) {
		return function(scope, el, attrs) {
			if (scope.$last){
				console.log('before render:', el.text());
				$timeout(function() {
					console.log('after render:', el.text());
					scope.rs.totalTime = (Date.now()- scope.rs.startTime)/ 1000
				});

			}
		};
	});


app.config([ '$routeProvider', function($routeProvider) {

	$routeProvider.when('/members', {
		templateUrl : 'members/layout',
		controller : MemberController
	});


	$routeProvider.otherwise({
		redirectTo : '/members'
	});
	
} ]);





