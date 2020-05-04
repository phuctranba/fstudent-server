package com.zipenter.fstudent.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum AreaCountry implements EnumClass<String> {

    BAC("BAC"),
    TRUNG("TRUNG"),
    NAM("NAM");

    private String id;

    AreaCountry(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static AreaCountry fromId(String id) {
        for (AreaCountry at : AreaCountry.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}