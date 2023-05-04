package com.caito.springsoap.controller;

import com.caito.springsoap.client.SoapClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SoapController {
    private final SoapClient soapClient;

    @PostMapping("/sumar")
    public ResponseEntity<?> add(@RequestParam int numberA, @RequestParam int numberB){
        return ResponseEntity.ok(soapClient.getAddResponse(numberA, numberB));
    }
    @PostMapping("/restar")
    public ResponseEntity<?> subtract(@RequestParam int numberA, @RequestParam int numberB){
        return ResponseEntity.ok(soapClient.getSubtractResponse(numberA, numberB));
    }

    @PostMapping("/multiplicar")
    public ResponseEntity<?> multiply(@RequestParam int numberA, @RequestParam int numberB){
        return ResponseEntity.ok(soapClient.getMultiplyResponse(numberA, numberB));
    }

    @PostMapping("/dividir")
    public ResponseEntity<?> divide(@RequestParam int numberA, @RequestParam int numberB){
        return ResponseEntity.ok(soapClient.getDivideResponse(numberA, numberB));
    }
}
