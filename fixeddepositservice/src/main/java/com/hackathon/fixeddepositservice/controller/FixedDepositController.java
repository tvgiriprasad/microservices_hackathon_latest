package com.hackathon.fixeddepositservice.controller;

import com.hackathon.fixeddepositservice.modal.DepositsRequest;
import com.hackathon.fixeddepositservice.modal.FixedDepositsModal;
import com.hackathon.fixeddepositservice.serviceImpl.FixedDepositServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fixed-deposits")
public class FixedDepositController {
    @Autowired
    FixedDepositServiceImpl fixedDepositServiceImpl;
    @PostMapping("/add")
    public ResponseEntity<FixedDepositsModal> addDepositDetails(@RequestBody DepositsRequest depositsRequest){
        FixedDepositsModal fixedDepositsModal = fixedDepositServiceImpl.addDepositDetails(depositsRequest);
        return new ResponseEntity<>(fixedDepositsModal, HttpStatus.CREATED);
    }

    /* @PostMapping("/calculatematureamount")
    public void calculateMatureAmount(){

    }

    @GetMapping("/alldeposits/{customerId}")
    public ResponseEntity<List<FixedDepositsModal>> allocatedFixedDeposits(@PathVariable("customerId") String customerId){
        List<FixedDepositsModal>  depositsData = fixedDepositServiceImpl.getAllFixedDeposits(customerId, null);
        return new ResponseEntity<>(depositsData, HttpStatus.OK);
    }

    @GetMapping("/alldeposits")
    public ResponseEntity<List<FixedDepositsModal>> getAllFixedDeposits(){
        List<FixedDepositsModal>  depositsData = fixedDepositServiceImpl.getAllFixedDeposits(null, null);
        return new ResponseEntity<>(depositsData, HttpStatus.OK);
    }

    @GetMapping("/deposit/{customerId}/{depositId}")
    public ResponseEntity<List<FixedDepositsModal>> getFixedDepositData(@PathVariable("customerId") String customerId, @PathVariable("depositId") String depositId){
        List<FixedDepositsModal>  depositsData = fixedDepositServiceImpl.getAllFixedDeposits(customerId, depositId);
        return new ResponseEntity<>(depositsData, HttpStatus.OK);
    }

    @PostMapping("/updatedeposit/{customerId}/{depositId}")
    public void updateDepositData(){

    }

    @PostMapping("/deallocatedeposit/{customerId}/{depositId}")
    public void deallocateDeposit(){

    }*/

}
