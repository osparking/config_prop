package com.bumsoap.config_prop.controller;

import com.bumsoap.config_prop.pojo.AppProperties;
import com.bumsoap.config_prop.pojo.GlobalProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private AppProperties app;

    @Autowired
    private GlobalProperties global;

    // return object in JSON format
    @GetMapping("/")
    public AppProperties main() {
        return app;
    }

    @GetMapping("/global")
    public GlobalProperties global() {
        return global;
    }

}
