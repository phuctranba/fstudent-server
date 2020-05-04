package com.zipenter.fstudent.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s|name,faculty")
@Table(name = "FSTUDENT_MAJOR")
@Entity(name = "fstudent_Major")
public class Major extends StandardEntity {
    private static final long serialVersionUID = 8191759227545468336L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "FACULTY", nullable = false)
    protected String faculty;

    public Faculty getFaculty() {
        return faculty == null ? null : Faculty.fromId(faculty);
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty == null ? null : faculty.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}