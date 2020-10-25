package com.neu.hospital.outpatientmedicaltechnology;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.neu.hospital.outpatientmedicaltechnology.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class HospitalOutpatientmedicaltechnologyApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalOutpatientmedicaltechnologyApplication.class, args);
    }

}
