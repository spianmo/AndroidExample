package com.kirshi.advance.pojo;

import android.content.Context;
import android.text.format.DateFormat;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Finger
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SmsMessage {
    private String name;
    private String phoneNumber;
    private String smsBody;
    private String date;
    private Type type;

    public enum Type {
        received, send;
    }

    public static SmsMessage random(Context context) {
        return SmsMessage.builder()
                .name(getStringRandom(4 + new Random().nextInt(3)))
                .phoneNumber(randomNum(11))
                .date(String.valueOf(DateFormat.format("yyyy-MM-dd hh:mm:ss", randomDate("2021-04-01", "2021-05-14"))))
                .type(new Random().nextBoolean() ? Type.received : Type.send)
                .smsBody("Hello，Android")
                .build();
    }


    public static String getStringRandom(int length) {

        StringBuilder val = new StringBuilder();
        Random random = new Random();

        //参数length，表示生成几位随机数
        for (int i = 0; i < length; i++) {
            int temp = random.nextInt(26);
            val.append(i == 0 ? String.valueOf((char) (65 + temp)).toUpperCase() : String.valueOf((char) (65 + temp)).toLowerCase());
        }
        return val.toString();
    }


    public static String randomNum(int count) {
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < count; i++) {
            sb.append(r.nextInt(9));
        }
        return sb.toString();
    }

    private static Time randomDate(String beginDate, String endDate) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date start = format.parse(beginDate);
            Date end = format.parse(endDate);

            if (start.getTime() >= end.getTime()) {
                return null;
            }
            long date = random(start.getTime(), end.getTime());
            return new Time(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static long random(long begin, long end) {
        long rtn = begin + (long) (Math.random() * (end - begin));
        if (rtn == begin || rtn == end) {
            return random(begin, end);
        }
        return rtn;
    }
}
