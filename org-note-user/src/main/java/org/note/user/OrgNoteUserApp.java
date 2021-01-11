package org.note.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrgNoteUserApp{

    public static void main(String[] args) {
        SpringApplication.run(OrgNoteUserApp.class, args);
    }


}
