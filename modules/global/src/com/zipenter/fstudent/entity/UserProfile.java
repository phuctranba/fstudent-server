package com.zipenter.fstudent.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@NamePattern("%s|fullName")
@Table(name = "FSTUDENT_USER_PROFILE")
@Entity(name = "fstudent_UserProfile")
public class UserProfile extends StandardEntity {
    private static final long serialVersionUID = -4973652196251288756L;

    @NotNull
    @Column(name = "FULL_NAME", nullable = false)
    protected String fullName;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", unique = true)
    protected User user;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SCHOOL_ID")
    protected School school;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MAJOR_ID")
    protected Major major;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DISTRICT_ID")
    protected District district;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DOB", nullable = false)
    protected Date dob;

    @Email(message = "{msg://fstudent_UserProfile.email.validation.Email}")
    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    protected String email;

    @Pattern(message = "{msg://fstudent_UserProfile.phoneNumber.validation.Pattern}", regexp = "[0-9]+")
    @Column(name = "PHONE_NUMBER", unique = true)
    protected String phoneNumber;

    @NotNull
    @Column(name = "GENDER", nullable = false)
    protected String gender;

    @NotNull
    @Column(name = "NUM_OF_BOOK", nullable = false)
    protected Integer numOfBook;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    protected String firstName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AVATAR_ID_ID")
    protected FileDescriptor avatarId;

    @Column(name = "MIDDLE_NAME")
    protected String middleName;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false)
    protected String lastName;

    public void setAvatarId(FileDescriptor avatarId) {
        this.avatarId = avatarId;
    }

    public FileDescriptor getAvatarId() {
        return avatarId;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getNumOfBook() {
        return numOfBook;
    }

    public void setNumOfBook(Integer numOfBook) {
        this.numOfBook = numOfBook;
    }

    public Gender getGender() {
        return gender == null ? null : Gender.fromId(gender);
    }

    public void setGender(Gender gender) {
        this.gender = gender == null ? null : gender.getId();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}