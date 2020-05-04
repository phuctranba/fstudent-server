package com.zipenter.fstudent.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NamePattern("%s|name")
@Table(name = "FSTUDENT_BOOK")
@Entity(name = "fstudent_Book")
public class Book extends StandardEntity {
    private static final long serialVersionUID = -2816209460820774736L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID")
    protected User user;

    @NotNull
    @Lob
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @NotNull
    @Column(name = "TYPE_SOURCE", nullable = false)
    protected String typeSource;

    @NotNull
    @Column(name = "TYPE_FILE", nullable = false)
    protected String typeFile;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MAJOR_ID")
    protected Major major;

    @NotNull
    @Column(name = "VIEW_", nullable = false)
    protected Integer view;

    @Column(name = "SCORE")
    protected Integer score;

    @NotNull
    @Lob
    @Column(name = "AVATAR", nullable = false)
    protected String avatar;

    @NotNull
    @Lob
    @Column(name = "LINK_STORE", nullable = false)
    protected String linkStore;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_UPLOAD", nullable = false)
    protected Date dateUpload;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_DELETE")
    protected Date dateDelete;

    @Column(name = "NUM_OF_REPORT")
    protected Integer numOfReport;

    public Integer getNumOfReport() {
        return numOfReport;
    }

    public void setNumOfReport(Integer numOfReport) {
        this.numOfReport = numOfReport;
    }

    public Date getDateDelete() {
        return dateDelete;
    }

    public void setDateDelete(Date dateDelete) {
        this.dateDelete = dateDelete;
    }

    public Date getDateUpload() {
        return dateUpload;
    }

    public void setDateUpload(Date dateUpload) {
        this.dateUpload = dateUpload;
    }

    public String getLinkStore() {
        return linkStore;
    }

    public void setLinkStore(String linkStore) {
        this.linkStore = linkStore;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public TypeFile getTypeFile() {
        return typeFile == null ? null : TypeFile.fromId(typeFile);
    }

    public void setTypeFile(TypeFile typeFile) {
        this.typeFile = typeFile == null ? null : typeFile.getId();
    }

    public TypeSource getTypeSource() {
        return typeSource == null ? null : TypeSource.fromId(typeSource);
    }

    public void setTypeSource(TypeSource typeSource) {
        this.typeSource = typeSource == null ? null : typeSource.getId();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}