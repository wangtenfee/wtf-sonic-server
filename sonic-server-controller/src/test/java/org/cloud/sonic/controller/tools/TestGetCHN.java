package org.cloud.sonic.controller.tools;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 王腾飞11
 * @function
 * @date 2024-10-23 星期三 21:21:27
 */

public class TestGetCHN {

    @Test
    public void test01(){
        String str = "//android.widget.TextView[contains(@text,'')]";
        String regex = "[\\u4E00-\\u9FA5]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            sb.append(matcher.group());
        }
        System.out.println(sb);

    }
}
