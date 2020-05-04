package com.zipenter.fstudent.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TypeSource implements EnumClass<String> {

    SELF_WRITING("SELFWRITING"),
    COLLECT("COLLECT");

    private String id;

    TypeSource(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TypeSource fromId(String id) {
        for (TypeSource at : TypeSource.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}