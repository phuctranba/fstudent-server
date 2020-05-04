package com.zipenter.fstudent.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s|name,provincial")
@Table(name = "FSTUDENT_DISTRICT")
@Entity(name = "fstudent_District")
public class District extends StandardEntity {
    private static final long serialVersionUID = 4546580838011029112L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}