package com.tedu.cn.api;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class StringDemo {
    /**
     * trim方法 去掉字符串左右两边的空白字符，但不能去掉中间的空白字符
     */
    @Test
    public void testTrim(){
        String str1="    **(*((()***   ";
        System.out.println(str1);
        str1=str1.trim();
        System.out.println(str1);
    }

    /**
     * 将一个字符串全部转化为大写字母toUpperCase()
     * 转化为小写字母toLowerCase()
     */
    @Test
    public void testLetterCHG(){
        String str1="i love YOU";
        System.out.println(str1);
        str1=str1.toUpperCase();
        System.out.println(str1);
        str1=str1.toLowerCase();
        System.out.println(str1);
    }
    /**
     * indexOf  返回所找字符在字符串中第一次出现的索引（从0开始）
     * lastIndexOf 返回所找字符在字符串中最后一次出现的索引（从0开始）
     */
    @Test
    public void testIndexOf(){
        String str1="I love you,my girl";
        System.out.println(str1.indexOf("m"));
        System.out.println(str1.lastIndexOf("o"));
    }
    @Test
    public void testContains(){
        String str="What are you doing?";
        boolean f=str.contains("are");
        System.out.println(f);
    }
    @Test
    public void testIgnoreCaseAndEquals(){
        String str1="abc";
        String str2="abc";
        String str3="ABC";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
    }
    @Test
    public void testGetBytes() throws UnsupportedEncodingException {
        byte bs[]="what do you do?".getBytes("UTF-8");
        for (int i = 0; i < bs.length; i++) {
            System.out.println(bs[i]);
        }
    }
    @Test
    public void testSubString(){
        String str="dsdjfnnfjsvnjsfecwexvbybnuv39853446www.baidu.comijfsf,iufmnazghosawww.baidu.com";
        String d="www.baidu.com";
        System.out.println(str.substring(str.indexOf(d),str.indexOf(d)+d.length()));
    }
}
