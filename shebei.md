#雷祥 09143752 电子商务14-3
###检修ER图
![image](/ER.png)
###原型设计图
![image](/model1.png)
![image](/model2.png)
![image](/model3.png)
![image](/model4.png)
***
[点击下载ER图文件](http://leixiang123.github.io/shebei.cdm)
***
[点击下载原型设计件](http://leixiang123.github.io/原型.rp)
***
[点击下载数据库文件](http://leixiang123.github.io/shebei.sql)
***
###查询检修语句
SELECT 
    device.Did,
    type.Tname,
    type.Time,
    type.Substance,
    content.Project,
    person.Pname,
    item.Date,
    item.Condition
FROM
    shebei.device,
    shebei.type,
    shebei.content,
    shebei.item,
    shebei.person
WHERE
    device.Tid = type.Tid
        AND type.Tid = content.Tid
        AND device.Did = item.Did
        AND item.Tid = type.Tid
        AND item.Cid = content.Cid
        AND item.Pid = person.Pid
***
###查询材料消耗语句
SELECT 
    device.Did,
    type.Tname,
    type.Time,
    type.Substance,
    content.Project,
    person.Pname,
    item.Date,
    item.Condition,
    expend.Material,
    expend.Count
FROM
    shebei.device,
    shebei.type,
    shebei.content,
    shebei.item,
    shebei.person,
    shebei.expend
WHERE
    device.Tid = type.Tid
        AND type.Tid = content.Tid
        AND device.Did = item.Did
        AND item.Tid = type.Tid
        AND item.Cid = content.Cid
        AND item.Pid = person.Pid
        AND item.Iid = expend.Iid
***
###预警语句
SELECT 
    item.Did,
    MAX(item.Date),
    type.Time,
    CASE type.Time
        WHEN '年检' THEN 365
        WHEN '月检' THEN 30
        WHEN '周检' THEN 7
        WHEN '双月检' THEN 60
        WHEN '半年检' THEN 183
    END AS a
FROM
    shebei.item,
    shebei.type
WHERE
    item.Tid = type.Tid
        AND TO_DAYS(DATE(NOW())) - TO_DAYS(DATE(item.Date)) > (SELECT 
            CASE type.Time
                    WHEN '年检' THEN 365
                    WHEN '月检' THEN 30
                    WHEN '周检' THEN 7
                    WHEN '双月检' THEN 60
                    WHEN '半年检' THEN 183
                END
        )
GROUP BY Did
