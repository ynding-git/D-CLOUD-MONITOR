package com.ynding.cloud.monitor.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ynding
 */
@SpringBootApplication
@EnableAdminServer
public class MonitorSpringbootAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorSpringbootAdminApplication.class, args);
    }

}
