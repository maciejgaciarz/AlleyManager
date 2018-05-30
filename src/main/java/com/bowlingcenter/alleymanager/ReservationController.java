package com.bowlingcenter.alleymanager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addReservation(@RequestBody Reservation reservation){

        reservationRepository.save(reservation);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Reservation> getReservation(){
        //get all reservations
        return reservationRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteReservation(int id){
        //add unit tests
        for (Reservation r:reservationRepository.findAll()
             ) {
            if(r.getId() == id){
                reservationRepository.delete(r);
            }
        }
    }
    @RequestMapping(method = RequestMethod.PUT)
    public void updateReservation(@RequestBody Reservation reservation){

        for (Reservation r:reservationRepository.findAll()
                ) {
                if(r.getId() == reservation.getId()){
                    reservationRepository.save(reservation);
            }
        }
    }

    //GET BY ID METHODS//
    //localhost:8080/reservation?id=1
    @RequestMapping(value = "/reservation", params = "id")
    public Reservation getResById(@RequestParam int id){
        for (Reservation r:reservationRepository.findAll()
                ) {
            if(r.getId() == id){
                return r;
            }
        }
        return null;
    }

}