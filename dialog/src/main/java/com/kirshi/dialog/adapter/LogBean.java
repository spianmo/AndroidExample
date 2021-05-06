package com.kirshi.dialog.adapter;

import java.text.SimpleDateFormat;

/*
 * Copyright (c) 2020
 * @Project:TrackerProject
 * @Author:Finger
 * @FileName:LogBean.java
 * @LastModified:2020-10-30T08:32:06.621+08:00
 */

public class LogBean {
    public String mTime;
    public String mLog;
    public String mWho;

    public LogBean(long time, String log) {
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        mTime = format.format(time);
        mLog = log;
    }
}