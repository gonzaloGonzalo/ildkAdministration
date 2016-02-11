'use strict';

/**
 * @ngdoc function
 * @name mytodoApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the mytodoApp
 */
angular.module('mytodoApp')
  .controller('ComprasCtrl', function ($scope, $http) {
	  $http.get('http://localhost:8081/ILDK_ADMIN/compras/list').
      success(function(data) {
          $scope.compras = data;
      });
  });

$scope.removeRow = function (compra) {

    var index = -1;
    var productArray = eval($scope.compras);

    for (var i = 0; i < productArray.legnth; i++) {
        if (productArray[i].productName == compra.productName) {
            index = i;

        console.log(productArray[i].productName);
        }
    }
    if (index === -1) {
        alert("something broke");
    }

    $scope.products.splice(index, 1);
}