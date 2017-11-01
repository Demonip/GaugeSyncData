package com.easted.data.publicutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

/**
 * Created by admin on 2017/10/12.
 */
public class ConvertUtils {

    //将字符串格式转换为时间格式
    public static Date convertTimeFromString(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date d = new Date(sdf.parse(date).getTime());
        return d;
    }
    //将时间格式转换为字符串
    public String convertTimeTypeToString(Date date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sb=simpleDateFormat.format(date);
        return sb;
    }
}
