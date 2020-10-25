package com.neu.hospital.outpatientpharmacy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.neu.hospital.outpatientpharmacy.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class HospitalOutpatientpharmacyApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalOutpatientpharmacyApplication.class, args);
    }

}
