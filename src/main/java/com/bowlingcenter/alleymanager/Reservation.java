package com.bowlingcenter.alleymanager;


import javax.persistence.*;

@Entity
@Table(name = "Reservation")
public class Reservation {

    @Id
    @GeneratedValue
    private Long id ;

    private int usedTrackId ;

    private String timeStarted ;

    private String timeEnding ;

    private int playingUserId ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsedTrackId(int usedTrackId) {
        this.usedTrackId = usedTrackId;
    }

    public void setTimeStarted(String timeStarted) {
        this.timeStarted = timeStarted;
    }

    public void setTimeEnding(String timeEnding) {
        this.timeEnding = timeEnding;
    }

    public void setPlayingUserId(int playingUserId) {
        this.playingUserId = playingUserId;
    }

    public int getUsedTrackId() {
        return usedTrackId;
    }

    public String getTimeStarted() {
        return timeStarted;
    }

    public String getTimeEnding() {
        return timeEnding;
    }

    public int getPlayingUserId() {
        return playingUserId;
    }

}
