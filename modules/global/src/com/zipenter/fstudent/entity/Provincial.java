package com.zipenter.fstudent.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "FSTUDENT_PROVINCIAL")
@Entity(name = "fstudent_Provincial")
public class Provincial extends StandardEntity {
    private static final long serialVersionUID = -6738334308111234601L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    protected String name;

    @NotNull
    @Column(name = "AREA", nullable = false)
    protected String area;

    public AreaCountry getArea() {
        return area == null ? null : AreaCountry.fromId(area);
    }

    public void setArea(AreaCountry area) {
        this.area = area == null ? null : area.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}