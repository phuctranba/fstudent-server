alter table FSTUDENT_BOOK rename column link_store to link_store__u28658 ;
alter table FSTUDENT_BOOK alter column link_store__u28658 drop not null ;
alter table FSTUDENT_BOOK rename column avatar to avatar__u13559 ;
alter table FSTUDENT_BOOK alter column avatar__u13559 drop not null ;
-- alter table FSTUDENT_BOOK add column LINK_STORE_ID uuid ^
-- update FSTUDENT_BOOK set LINK_STORE_ID = <default_value> ;
-- alter table FSTUDENT_BOOK alter column LINK_STORE_ID set not null ;
alter table FSTUDENT_BOOK add column LINK_STORE_ID uuid not null ;
-- alter table FSTUDENT_BOOK add column AVATAR_ID_ID uuid ^
-- update FSTUDENT_BOOK set AVATAR_ID_ID = <default_value> ;
-- alter table FSTUDENT_BOOK alter column AVATAR_ID_ID set not null ;
alter table FSTUDENT_BOOK add column AVATAR_ID_ID uuid not null ;
