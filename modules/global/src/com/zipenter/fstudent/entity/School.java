package com.zipenter.fstudent.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "FSTUDENT_SCHOOL")
@Entity(name = "fstudent_School")
public class School extends StandardEntity {
    private static final long serialVersionUID = -4921331625667567414L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    protected String name;

    @NotNull
    @Column(name = "TYPE", nullable = false)
    protected String type;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PROVINCIAL_ID")
    protected Provincial provincial;

    public Provincial getProvincial() {
        return provincial;
    }

    public void setProvincial(Provincial provincial) {
        this.provincial = provincial;
    }

    public TypeSchool getType() {
        return type == null ? null : TypeSchool.fromId(type);
    }

    public void setType(TypeSchool type) {
        this.type = type == null ? null : type.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}