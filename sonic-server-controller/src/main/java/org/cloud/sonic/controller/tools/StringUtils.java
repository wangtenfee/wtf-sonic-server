package org.cloud.sonic.controller.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 王腾飞11
 * @function
 * @date 2024-10-23 星期三 21:25:14
 */

public class StringUtils {

    /**
     * 提取字符串中的中文
     * @param str
     * @return
     */
    public static String getChinese(String str) {
        String regex = "[\\u4E00-\\u9FA5]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            sb.append(matcher.group());
        }
        return sb.toString();
    }

}
