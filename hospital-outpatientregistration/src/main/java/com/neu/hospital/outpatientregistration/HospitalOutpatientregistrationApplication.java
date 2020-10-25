package com.neu.hospital.outpatientregistration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.neu.hospital.outpatientregistration.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class HospitalOutpatientregistrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalOutpatientregistrationApplication.class, args);
    }

}
