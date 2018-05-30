package com.bowlingcenter.alleymanager;


import javax.persistence.*;

@Entity
@Table(name = "logs")
public class CallLog {

    @Id
    @GeneratedValue
    private Long id ;

    private String methodName;

    private String dateCalled;

    private int timesCalled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getDateCalled() {
        return dateCalled;
    }

    public void setDateCalled(String dateCalled) {
        this.dateCalled = dateCalled;
    }

    public int getTimesCalled() {
        return timesCalled;
    }

    public void setTimesCalled(int timesCalled) {
        this.timesCalled = timesCalled;
    }
}