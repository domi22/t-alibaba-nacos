package org.note.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RefreshScope
@RestController
@RequestMapping("/cnf")
public class TestConfigController {


//    @NacosValue(value = "${cc.fname}",autoRefreshed = true)
    @Value("${cc.fname}")
    public String fname;

//    @NacosValue(value = "${cc.fage}",autoRefreshed = true)
    @Value("${cc.fage}")
    public Integer fage;

    @Value("${cc.fhas}")
    public Boolean fhas;

    @Value("${spring.datasource.url}")
    public String datasourceUrl;

    @Autowired
    private TestNacoProper testNacoProper;

    @Autowired
    private NacosPropertiesRRRRRR nacosPropertiesRRRRRR;


    @Autowired
    private Environment env;

    @GetMapping("/g")
    public Map<String,Object> get() {
        Map<String, Object> map = new HashMap<>();

        String property = env.getProperty("spring.datasource.url", "");
        map.put("nacosProperties", testNacoProper);
        map.put("nacosPropertiesRRRRRR", nacosPropertiesRRRRRR);
        map.put("fname", fname);
        map.put("fage", fage);
        map.put("fhas", fhas);
        map.put("datasourceUrl", property);
        return map;
    }


}
