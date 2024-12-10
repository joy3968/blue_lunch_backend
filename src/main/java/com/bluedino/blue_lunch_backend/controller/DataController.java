package com.bluedino.blue_lunch_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @PostMapping
    public ResponseEntity<String> receiveData(@RequestBody Map<String, String> requestData) {
        String receivedData = requestData.get("data");
        System.out.println("Received data: " + receivedData);
        return ResponseEntity.ok("Data received successfully: " + receivedData);
    }

    @GetMapping
    public ResponseEntity<Map<String, String>> sendData() {
        Map<String, String> responseData = new HashMap<>();
        responseData.put("message", "Hello from Spring Boot!");
        return ResponseEntity.ok(responseData);
    }
}
