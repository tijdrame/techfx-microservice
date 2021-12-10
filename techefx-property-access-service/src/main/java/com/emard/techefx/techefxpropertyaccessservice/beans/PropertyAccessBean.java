package com.emard.techefx.techefxpropertyaccessservice.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "property-file")
public class PropertyAccessBean {
    private String name;
    private String description;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
