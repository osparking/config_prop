package com.bumsoap.config_prop.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// This component binds values from application.properties to object via @ConfigurationProperties
@Component
@ConfigurationProperties("app") // prefix app, find app.* values
@Data
public class AppProperties {

    private String error;
    private List<Menu> menus = new ArrayList<>();
    private Compiler compiler = new Compiler();

    @Data
    public static class Menu {
        private String name;
        private String path;
        private String title;
    }

    @Data
    public static class Compiler {
        private String timeout;
        private String outputFolder;
    }
}