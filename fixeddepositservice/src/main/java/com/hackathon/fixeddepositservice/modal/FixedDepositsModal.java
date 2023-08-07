package com.hackathon.fixeddepositservice.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name="fixed_deposits_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FixedDepositsModal {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="DEPOSIT_ID")
        private int depositId;

        @Column(name="CUSTOMER_ID")
        private int customerId;

        @Column(name="DEPOSIT_TENURE")
        private int depositTenure;

        @Column(name="INTEREST_RATE")
        private double interestRate;

        @Column(name="DEPOSIT_AMOUNT")
        private double depositAmount;

        @Column(name="MATURED_AMOUNT")
        private double maturedAmount;

        @Column(name="INTEREST_AMOUNT")
        private double interestAmount;

        @Column(name="DEPOSIT_START_DATE")
        private String depositStartDate;

        @Column(name="MATURITY_DATE")
        private String maturityDate;

        @Column(name="IS_ACTIVE")
        private String active;

        @Column(name="IS_DEPOSIT_MATURED")
        private String depositMatured;

}
