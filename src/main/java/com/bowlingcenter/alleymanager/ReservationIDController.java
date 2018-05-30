package com.bowlingcenter.alleymanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReservationIDController {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationIDController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }


    @RequestMapping(value = "/reservation", params = "id", method = RequestMethod.GET)
    public Reservation getResById(@RequestParam int id){
        for (Reservation r:reservationRepository.findAll()
                ) {
            if(r.getId() == id){
                return r;
            }
        }
        return null;
    }


    @RequestMapping(value = "/reservation", params = "id", method = RequestMethod.DELETE)
    public void deleteResById(@RequestParam int id){
        for (Reservation r:reservationRepository.findAll()
                ) {
            if (r.getId() == id) {
                reservationRepository.delete(r);
            }
        }
    }





}