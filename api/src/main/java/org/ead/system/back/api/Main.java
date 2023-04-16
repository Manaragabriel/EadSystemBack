package org.ead.system.back.api;

import org.ead.system.back.domain.Category.Category;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.swing.*;
import java.util.UUID;

@SpringBootApplication
@ComponentScan(basePackages = {"org.ead.system.back.api"})
public class Main {
    public static void main(String[] args) {
        final String Id = UUID.randomUUID().toString();
        final String CategoryName = "Front End";
        final String Description = "Description test";

        Category category = new Category(
                Id,
                CategoryName,
                Description

        );
        System.out.println(category.getCategoryName());
        SpringApplication.run(Main.class, args);
    }
}