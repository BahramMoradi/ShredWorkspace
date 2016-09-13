// dependency injection :) minification case problem if injection is not used properly
// (function(){
//   'use strict'
//   angular.module('DIApp',[])
//   .controller('DIController',DIController);
//   DIController.$inject=['$scope','$filter'];
//   function DIController($scope,$filter){
//     $scope.name='Bahram';
//     $scope.upper=function(){
//     var upCase=$filter('uppercase');
//     $scope.name=upCase($scope.name)
//
//      };
//   }
//
// })();

!function(){"use strict";
function e(e,n){e.name="Bahram",
e.upper=function(){var r=n("uppercase");
e.name=r(e.name)}}angular.module("DIApp",[]).controller("DIController",e),e.$inject=["$scope","$filter"]}();
