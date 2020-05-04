package com.zipenter.fstudent.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TypeFile implements EnumClass<String> {

    WORD("WORD"),
    POWERPOINT("POWERPOINT"),
    IMAGE("IMAGE");

    private String id;

    TypeFile(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TypeFile fromId(String id) {
        for (TypeFile at : TypeFile.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}