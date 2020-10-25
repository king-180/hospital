package com.neu.hospital.outpatientdoctor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.neu.hospital.outpatientdoctor.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class HospitalOutpatientdoctorApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalOutpatientdoctorApplication.class, args);
    }

}
