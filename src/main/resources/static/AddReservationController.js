angular.module('ReservationManager.controllers')

    .controller('ReservationController2', ReservationController2);

ReservationController2.$inject = ['$scope', '$http'];



function ReservationController2($scope, $http){

    $http.get("http://localhost:8080/reservation").
    then(function(response) {

        $scope.myJsonResponse = response.data;

    })


    $scope.AddReservation = function(){

        var Reservation = {
            usedTrackId : $scope.usedTrackId,
            timeStarted : $scope.timeStarted,
            timeEnding : $scope.timeEnding,
            playingUserId : $scope.playingUserId

        };

        //Reservation.push({ 'usedTrackId':$scope.usedTrackId, 'timeStarted': $scope.timeStarted, 'timeEnding':$scope.timeEnding, 'playingUserId' : $scope.playingUserId });
        // Writing it to the server
        //

        var res = $http.post('http://localhost:8080/reservation', Reservation);
        res.success(function(data, status, headers, config) {
            $scope.message = data;
        });
        res.error(function(data, status, headers, config) {
            alert( "failure message: " + JSON.stringify({data: data}));
        });

        // Making the fields empty
        //
        $scope.usedTrackId='';
        $scope.timeStarted='';
        $scope.timeEnding='';
        $scope.playingUserId='';

    }
}