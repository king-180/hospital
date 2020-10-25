package com.neu.hospital.outpatientfinancial;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.neu.hospital.outpatientfinancial.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class HospitalOutpatientfinancialApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalOutpatientfinancialApplication.class, args);
    }

}
