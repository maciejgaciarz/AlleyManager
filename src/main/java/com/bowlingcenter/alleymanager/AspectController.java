package com.bowlingcenter.alleymanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/log")
public class AspectController {

    private final LogRepository logRepository;

    @Autowired
    public AspectController(LogRepository logRepository) {
        this.logRepository = logRepository;
    }



    @RequestMapping(method = RequestMethod.GET)
    public List<CallLog> showAllLogs(){
        return logRepository.findAll();
    }

}
