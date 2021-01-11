package org.note.user.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NacosConfig {


    @Bean
    public TestNacoProper testNacoProper(NacosPropertiesRRRRRR nacosPropertiesRRRRRR) {
        TestNacoProper testNacoProper = new TestNacoProper();
        testNacoProper.setAge(nacosPropertiesRRRRRR.getPage());
        testNacoProper.setHas(nacosPropertiesRRRRRR.getPhas());
        testNacoProper.setName(nacosPropertiesRRRRRR.getPnane());
        testNacoProper.setNacosPropertiesRRRRRR(nacosPropertiesRRRRRR);
        return testNacoProper;
    }
}
