/*
 demo tables for mariadb/mysql
 Table1: items
 Table2: vendors
 Date: 221115 
*/


-- ----------------------------
-- Table structure for items
-- ----------------------------
DROP TABLE IF EXISTS "items";
CREATE TABLE "items" (
  "itemId" serial PRIMARY KEY,
  "itemName" varchar(100) NOT NULL,
  "itemVendorId" int4 NOT NULL,
  "itemListPrice" numeric(10,2) NOT NULL,
  "itemModelYear" int2
);


-- ----------------------------
-- Table structure for vendors
-- ----------------------------
DROP TABLE IF EXISTS "vendors";
CREATE TABLE "vendors" (
  "vendorId" serial PRIMARY KEY,
  "vendorName" varchar(100) NOT NULL
);


