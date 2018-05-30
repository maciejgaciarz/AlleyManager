# AlleyManager

Bowling Center Alley Manager spring boot API application, including JPA repositories and logging method execution with Aspect-J

# Usage:


## localhost:8080

Main page with very basic angular.js added to show consumed API

## localhost:8080/reservation

#### GET
Returns json that contains all reservations in database.

#### POST
Adds new reservation when provided with body json of type:
```
{
	"usedTrackId":"1",
	"timeStarted":"2",
	"timeEnding":"12:30",
	"playingUserId":"4"
}
```
#### DELETE
requires parameter ID - id of reservation to delete from db f.e.
```
localhost:8080/reservation?id=4
```
will delete reservation with ID number 4

#### PUT
Updates an existing reservation with a new one, requires a body of type: 
```
{
	"usedTrackId":"1",
	"timeStarted":"2",
	"timeEnding":"12:30",
	"playingUserId":"4"
}
```

## localhost:8080/log
Returns a json containing method execution time.


Feel free to contact me if you need a project or have issues with something.
