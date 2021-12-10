package com.emard.techefx.techefxpropertyaccessservice.controller;

import com.emard.techefx.techefxpropertyaccessservice.beans.PropertyAccessBean;
import com.emard.techefx.techefxpropertyaccessservice.beans.PropertyAccessValue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/access")
public class PropertyAccessController {

    private final  PropertyAccessBean accessBean;

    public PropertyAccessController(PropertyAccessBean accessBean){
        this.accessBean = accessBean;
    }

    @GetMapping("accessPropertyFile")
    public PropertyAccessValue accessPropertyFile() {
        return new PropertyAccessValue(accessBean.getName(), accessBean.getDescription());
    }

    /*public void refreshActuator(){
        Reste
    }*/

}
