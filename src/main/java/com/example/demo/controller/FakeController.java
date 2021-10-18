package com.example.demo.controller;

import com.example.demo.model.ContractApprovalRequestModel;
import com.example.demo.model.FoodModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
public class FakeController {
    @GetMapping("/fake/{id}")
    public ResponseEntity<String> getFoodById(@PathVariable(value = "id") int id) {
        if(id == 1){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Hello World", HttpStatus.CREATED);
    }

    @PostMapping("/contracts/{contractId}/approval")
    public void approveContract(@RequestHeader("authorization") String adminId,
                                @PathVariable("contractId") String contractId,
                                @RequestBody ContractApprovalRequestModel adminApproval){


        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//            contractDao.deleteContract(contractId);

    }
}
