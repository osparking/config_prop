package com.bumsoap.config_prop.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AppPropTest {
    private AppProperties appProperties;

    @Autowired
    public AppPropTest(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    @Test
    public void menuTest() {
        var menus = appProperties.getMenus();
        assertEquals(menus.get(0).getName(), "Home");
    }
}
