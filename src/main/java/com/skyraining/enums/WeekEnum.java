package com.skyraining.enums;

/**
 * 日期类型枚举
 * 星期一 至 星期天
 */
public enum WeekEnum {
    /*
        星期一枚举
     */
    MONDAY("星期一", "Monday", "Mon.", 1),
    /*
        星期二枚举
     */
    TUESDAY("星期二", "Tuesday", "Tues.", 2),
    /*
        星期三枚举
     */
    WEDNESDAY("星期三", "Wednesday", "Wed.", 3),
    /*
        星期四枚举
     */
    THURSDAY("星期四", "Thursday", "Thur.", 4),
    /*
        星期五枚举
     */
    FRIDAY("星期五", "Friday", "Fri.", 5),
    /*
        星期五枚举
     */
    SATURDAY("星期六", "Saturday", "Sat.", 6),
    /*
        星期日枚举
     */
    SUNDAY("星期日", "Sunday", "Sun.", 7);

    String nameCn;
    String nameEn;
    String nameEnShort;
    int number;

    WeekEnum(String nameCn, String nameEn, String nameEnShort, int number) {
        this.nameCn = nameCn;
        this.nameEn = nameEn;
        this.nameEnShort = nameEnShort;
        this.number = number;
    }

    public String getChineseName() {
        return nameCn;
    }

    public String getName() {
        return nameEn;
    }

    public String getShortName() {
        return nameEnShort;
    }

    public int getNumber() {
        return number;
    }
}  