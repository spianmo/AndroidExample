package com.kirito666.room.util;

import android.annotation.SuppressLint;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Intro：时间工具类
 *
 * @author Finger
 * @date 2020-01-22 16:39
 */
public class DateUtil {

    /**
     * 获取月份的英语
     */
    public static String getMonthInEng() {
        switch (getDate("MM")) {
            case "01":
                return "Jan.";
            case "02":
                return "Feb.";
            case "03":
                return "Mar.";
            case "04":
                return "Apr.";
            case "05":
                return "May.";
            case "06":
                return "Jun.";
            case "07":
                return "Jul.";
            case "08":
                return "Aug.";
            case "09":
                return "Sept.";
            case "10":
                return "Oct.";
            case "11":
                return "Nov.";
            case "12":
                return "Dec.";
            default:
                return "unknown";
        }
    }


    /**
     * 获取星期的汉语
     */
    public static String getWeekInChi(int day) {
        if (day < 1 && day > 7) {
            return "";
        }
        String[] weeks = new String[]{"一", "二", "三", "四", "五", "六", "日"};
        return weeks[day - 1];
    }

    /**
     * 获取日期
     *
     * @param format 格式
     */
    public static String getDate(String format) {
        Date date = new Date();
        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }


    @SuppressLint("DefaultLocale")
    public static String getDateBeforeOfAfter(Date date, int num) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int day = calendar.get(Calendar.DATE);
        calendar.set(Calendar.DATE, day + num);
        return String.format("%02d", calendar.get(Calendar.DATE));
    }
}

