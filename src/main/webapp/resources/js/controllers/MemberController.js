
'use strict';

/**
 * MemberController
 * @constructor
 */
var MemberController = function($scope, $http, $rootScope) {
    $scope.rs = {};
    $scope.rs.count = 10;


    $scope.fetchMembersList = function (rs) {

        $scope.rs.startTime = Date.now();
        $scope.rs.backEndTime = "0";
        $scope.rs.totalTime = "0";

        $http.post('members/retrieve', rs).success(function (result) {

            console.log("Reached fetch: " + result.backEndTime);

            $scope.rs.backEndTime = result.backEndTime;

            $scope.result = result.fetchResponse;


        });
    };
}