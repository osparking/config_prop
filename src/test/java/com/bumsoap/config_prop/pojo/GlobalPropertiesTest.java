package com.bumsoap.config_prop.pojo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GlobalPropertiesTest {
    private GlobalProperties globalProperties;

    @Autowired
    public GlobalPropertiesTest(GlobalProperties globalProperties) {
        this.globalProperties = globalProperties;
    }

    @Test
    public void testEmail() {
        assertEquals(globalProperties.getEmail(), "test@bumsoap.com");
    }

    @Test
    public void testThreadPool() {
        assertEquals(globalProperties.getThreadPool(), 12);
    }

}