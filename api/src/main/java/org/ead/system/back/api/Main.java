package org.ead.system.back.api;

import org.ead.system.back.domain.Course.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.swing.*;

@SpringBootApplication
@ComponentScan(basePackages = {"org.ead.system.back.api"})
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }
}