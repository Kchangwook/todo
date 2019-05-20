DROP TABLE IF EXISTS list;

CREATE TABLE list
(
    num       INT            NOT NULL    AUTO_INCREMENT, 
    title     VARCHAR(45)    NOT NULL, 
    content   VARCHAR(45)    NOT NULL, 
    deadline  DATE           , 
    finish    INT            default 0, 
    priority  INT            default 100, 
    PRIMARY KEY (num)
);

insert into list(title,content,deadline) values("안녕","집에 가자",now());
insert into list(title,content,deadline) values("안녕","집에 가자",now());
commit;
