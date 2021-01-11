package org.note.user.controller;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * 这里会实时更新的
 */
@Component
@ConfigurationProperties("domi.ha")
public class NacosPropertiesRRRRRR {

    private String pnane;
    private Integer page;
    private Boolean phas;

    public String getPnane() {
        return pnane;
    }

    public void setPnane(String pnane) {
        this.pnane = pnane;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Boolean getPhas() {
        return phas;
    }

    public void setPhas(Boolean phas) {
        this.phas = phas;
    }
}
