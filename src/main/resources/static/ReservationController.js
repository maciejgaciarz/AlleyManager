angular.module('ReservationManager.controllers')

    .controller('ReservationController1', ReservationController1);



ReservationController1.$inject = ['$scope', '$http'];

function ReservationController1($scope, $http){

        $http.get("http://localhost:8080/reservation").
        then(function(response) {

            $scope.myJsonResponse = response.data;

        })


     $scope.DeleteReservation = function(id){


                $http.delete("http://localhost:8080/reservation" + "?id=" + id).then(function(response){
                    $scope.msg = "Data deleted succesfully";
                })
        }

}