(function(){
'use strict';
var app=angular.module('NameCalculator',[]);
app.controller('NameCalculatorController',function($scope){
  $scope.name="";
  $scope.totalValue=0;
  $scope.displayNumeric=function(){
    var totalNameVaue=calculateNameValue($scope.name);
    $scope.totalValue=totalNameVaue;

  };

  function calculateNameValue(string){
    var numricValue=0;
   for (var i = 0; i < string.length; i++) {
    numricValue+=string.charCodeAt(i);
   }
   return numricValue;
  };


});


// 2. controller

app.controller('NyController',function($scope){
  $scope.hello='Hello world';
});


})();
