package com.emard.techefx.techefxpropertyaccessservice.beans;
public class PropertyAccessValue {
    private String name;
    private String description;


    public PropertyAccessValue() {
    }

    public PropertyAccessValue(String name, String description) {
        this.name = name;
        this.description = description;
    }

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

    public PropertyAccessValue name(String name) {
        setName(name);
        return this;
    }

    public PropertyAccessValue description(String description) {
        setDescription(description);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            "}";
    }
    
}
