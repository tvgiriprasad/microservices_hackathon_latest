package com.hackathon.fixeddepositservice.service;

import com.hackathon.fixeddepositservice.modal.DepositsRequest;
import com.hackathon.fixeddepositservice.modal.FixedDepositsModal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FixedDepositService {

    FixedDepositsModal addDepositDetails(DepositsRequest depositsRequest);

    // List<FixedDepositsModal> getAllFixedDeposits(String customerId, String depositId);

}
