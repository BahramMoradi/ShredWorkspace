// dependency injection :) minification case problem if injection is not used properly
(function(){
  'use strict'
  angular.module('MsgApp',[])
  .controller('MsgController',MsgController);
  MsgController.$inject=['$scope'];
  function MsgController($scope){
    $scope.name='Bahram';
    $scope.sayMsg=function(){
      return 'I am not happy today';
     };
}

})();
