create index IX_CFFD06FF on FOO_Foo (field2);
create index IX_B2FCA947 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_905CD589 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_9B97B505 on Pamphlet_Pamphlet (groupId);
create index IX_CCAE96E1 on Pamphlet_Pamphlet (locationId, groupId);
create index IX_4E0B77F9 on Pamphlet_Pamphlet (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_ADD3A8BB on Pamphlet_Pamphlet (uuid_[$COLUMN_LENGTH:75$], groupId);