package com.zipenter.fstudent.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TypeSchool implements EnumClass<String> {

    UNIVERSITY("UNIVERSITY"),
    HIGH_SCHOOL("HIGHSCHOOL");

    private String id;

    TypeSchool(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TypeSchool fromId(String id) {
        for (TypeSchool at : TypeSchool.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}