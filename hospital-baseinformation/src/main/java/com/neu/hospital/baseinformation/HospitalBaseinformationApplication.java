package com.neu.hospital.baseinformation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.neu.hospital.baseinformation.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class HospitalBaseinformationApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalBaseinformationApplication.class, args);
    }

}
