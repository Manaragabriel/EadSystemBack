package org.ead.system.back.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController()
@RequestMapping("/category")
public class CategoryController {
    @GetMapping("/")
    public ResponseEntity getCategories(){
        return ResponseEntity.ok(3);
    }
}
