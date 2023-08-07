package com.hackathon.fixeddepositservice.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepositsRequest {

    private int customerId;

    private String depositStartDate;

    private int tenure;

    private double depositAmount;

}
