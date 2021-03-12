use tms_mvc;
show tables;
select * from task_list_user;
INSERT INTO `tms_mvc`.`task_list_user` (`User_Name`,`Password_Hash`,`is_Manager`,`is_Administrator`,`mobile_no`) VALUES ('abc','abc123',0,1,194838272);
INSERT INTO `tms_mvc`.`task_list_user` ( `User_Name`, `Password_Hash`, `is_Manager`, `is_Administrator`,`mobile_no`) VALUES ('def', 'def123', 1, 0,2745632742);
INSERT INTO `tms_mvc`.`task_list_user` ( `User_Name`, `Password_Hash`, `is_Manager`, `is_Administrator`,`mobile_no`) VALUES ( 'ghi', 'ghi123', 0, 0,873473824);


select * from task_list_categories;
INSERT INTO `tms_mvc`.`task_list_categories` ( `Description`) VALUES ( 'General');
INSERT INTO `tms_mvc`.`task_list_categories` ( `Description`) VALUES ('Project1');
INSERT INTO `tms_mvc`.`task_list_categories` ( `Description`) VALUES ( 'Information');


select * from task_list_status;
INSERT INTO `tms_mvc`.`task_list_status` ( `Status_Description`) VALUES ( 'open');
INSERT INTO `tms_mvc`.`task_list_status` ( `Status_Description`) VALUES ( 'closed');
INSERT INTO `tms_mvc`.`task_list_status` ( `Status_Description`) VALUES ( 'inProgress');


select * from task_list_items;
INSERT INTO `tms_mvc`.`task_list_items` ( `Owner_User_ID`, `Created_Date`, `Modefied_Date`, `Subject`, `Body`, `Status_id`, `Category_ID`) VALUES ( '1', curdate(),curdate(), 'DataBaseDesign', 'To create a test plan for db', '1', '2');
INSERT INTO `tms_mvc`.`task_list_items` ( `Owner_User_ID`, `Created_Date`, `Modefied_Date`, `Subject`, `Body`, `Status_id`, `Category_ID`) VALUES ( '1', '2021-03-02 00:00:00', curdate(), 'UMLDiagram', 'To draw uml diagram for TMS', '3', '2');
INSERT INTO `tms_mvc`.`task_list_items` ( `Owner_User_ID`, `Created_Date`, `Modefied_Date`, `Subject`, `Body`, `Status_id`, `Category_ID`) VALUES ( '1', curdate(),curdate(), 'Holiday', '8-3-2021 is holiday', '2', '3');

select * from task_list_assignment;
INSERT INTO `tms_mvc`.`task_list_assignment` ( `User_ID`, `Task_List_ID`) VALUES ('1', '1');
INSERT INTO `tms_mvc`.`task_list_assignment` (`User_ID`, `Task_List_ID`) VALUES ('2', '1');
INSERT INTO `tms_mvc`.`task_list_assignment` (`User_ID`, `Task_List_ID`) VALUES ('3', '2');


