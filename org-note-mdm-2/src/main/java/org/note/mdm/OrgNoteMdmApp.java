package org.note.mdm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrgNoteMdmApp {

    public static void main(String[] args) {
        SpringApplication.run(OrgNoteMdmApp.class);
    }

}
