package com.bowlingcenter.alleymanager;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);


    //log repository to pass logs to api
    private LogRepository logRepository;
    public LoggingAspect(LogRepository logRepository) {
        this.logRepository = logRepository;
    }


    //tracking whole reservationController
    @Pointcut("execution(* com.bowlingcenter.alleymanager.ReservationController..*(..))")
    private void logReservationController() {
    }

    //Tracking get reservation by id Method
    @Pointcut("execution(public Reservation com.bowlingcenter.alleymanager.ReservationIDController.getResById(int))")
    private void logAfterGetResByIdMethod(){}

    //Tracking add Reservation Method
    @Pointcut("execution(public void com.bowlingcenter.alleymanager.ReservationController.addReservation(Reservation))")
    private void logAfterAddReservationMethod(){}

    //Tracking Delete Reservation by id method
    @Pointcut("execution(public void com.bowlingcenter.alleymanager.ReservationController.deleteReservation(int))")
    private void logAfterDeleteReservationMethod(){}



    private static int logAfterGetResByIdMethod = 0;
    @After("logAfterGetResByIdMethod()")
    public void logAfterGetResByIdMethod(JoinPoint joinPoint){

        logAfterGetResByIdMethod++;
        String methodName = joinPoint.getSignature().getName();
        String date = ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME);

        int called = logAfterGetResByIdMethod;
        log.info("Method " + methodName +" called on " + date + " " + called + " times.");

        CallLog calllog = new CallLog();
        calllog.setDateCalled(date);
        calllog.setMethodName(methodName);
        calllog.setTimesCalled(called);
        logRepository.save(calllog);
    }


    private static int logAfterAddReservationMethod = 0;
    @After("logAfterAddReservationMethod()")
    public void logAfterAddReservationMethod(JoinPoint joinPoint){
        logAfterAddReservationMethod++;
        String methodName = joinPoint.getSignature().getName();
        String date = ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME);

        int called = logAfterAddReservationMethod;
        log.info("Method " + methodName +" called on " + date + " " + called + " times.");

        CallLog calllog = new CallLog();
        calllog.setDateCalled(date);
        calllog.setMethodName(methodName);
        calllog.setTimesCalled(called);
        logRepository.save(calllog);
    }


    private static int logAfterDeleteReservationMethod = 0;
    @After("logAfterDeleteReservationMethod()")
    public void logAfterDeleteReservationMethod(JoinPoint joinPoint){
        logAfterDeleteReservationMethod++;
        String methodName = joinPoint.getSignature().getName();
        String date = ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME);
        int called = logAfterDeleteReservationMethod;
        log.info("Method " + methodName +" called on " + date + " " + called + " times.");

        CallLog calllog = new CallLog();
        calllog.setDateCalled(date);
        calllog.setMethodName(methodName);
        calllog.setTimesCalled(called);
        logRepository.save(calllog);
    }



    private static int logReservationController = 0;
    @After("logReservationController()")
    public void logAfterReservationController(JoinPoint joinPoint){

        logReservationController++;
        String methodName = joinPoint.getSignature().getName();
        String date = ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME);
        int called = logReservationController;
        log.info("Method " + methodName +" called on " + date + " " + called + " times.");

        CallLog calllog = new CallLog();
        calllog.setDateCalled(date);
        calllog.setMethodName(methodName);
        calllog.setTimesCalled(called);
        logRepository.save(calllog);
    }



}