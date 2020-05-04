-- begin FSTUDENT_USER_PROFILE
create table FSTUDENT_USER_PROFILE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FULL_NAME varchar(255) not null,
    USER_ID uuid not null,
    SCHOOL_ID uuid not null,
    MAJOR_ID uuid not null,
    DISTRICT_ID uuid,
    DOB date not null,
    EMAIL varchar(255) not null,
    PHONE_NUMBER varchar(255),
    GENDER varchar(50) not null,
    NUM_OF_BOOK integer not null,
    FIRST_NAME varchar(255) not null,
    AVATAR text,
    MIDDLE_NAME varchar(255),
    LAST_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end FSTUDENT_USER_PROFILE
-- begin FSTUDENT_PROVINCIAL
create table FSTUDENT_PROVINCIAL (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    AREA varchar(50) not null,
    --
    primary key (ID)
)^
-- end FSTUDENT_PROVINCIAL
-- begin FSTUDENT_MAJOR
create table FSTUDENT_MAJOR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    FACULTY varchar(50) not null,
    --
    primary key (ID)
)^
-- end FSTUDENT_MAJOR
-- begin FSTUDENT_BOOK_CASE
create table FSTUDENT_BOOK_CASE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_ID uuid not null,
    BOOK_ID uuid not null,
    PAGE integer,
    SCORE integer,
    FAVOURITE boolean not null,
    DONE boolean not null,
    --
    primary key (ID)
)^
-- end FSTUDENT_BOOK_CASE
-- begin FSTUDENT_DISTRICT
create table FSTUDENT_DISTRICT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    PROVINCIAL_ID uuid not null,
    --
    primary key (ID)
)^
-- end FSTUDENT_DISTRICT
-- begin FSTUDENT_BOOK
create table FSTUDENT_BOOK (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_ID uuid not null,
    NAME text not null,
    DESCRIPTION text,
    TYPE_SOURCE varchar(50) not null,
    TYPE_FILE varchar(50) not null,
    MAJOR_ID uuid not null,
    VIEW_ integer not null,
    SCORE integer,
    AVATAR text not null,
    LINK_STORE text not null,
    DATE_UPLOAD date not null,
    DATE_DELETE date,
    NUM_OF_REPORT integer,
    --
    primary key (ID)
)^
-- end FSTUDENT_BOOK
-- begin FSTUDENT_SCHOOL
create table FSTUDENT_SCHOOL (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    TYPE varchar(50) not null,
    PROVINCIAL_ID uuid not null,
    --
    primary key (ID)
)^
-- end FSTUDENT_SCHOOL
