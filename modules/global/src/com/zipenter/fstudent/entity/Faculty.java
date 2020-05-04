package com.zipenter.fstudent.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Faculty implements EnumClass<String> {

    CONG_NGHE_THONG_TIN("CONGNGHETHONGTIN"),
    KINH_TE("KINHTE");

    private String id;

    Faculty(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Faculty fromId(String id) {
        for (Faculty at : Faculty.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}