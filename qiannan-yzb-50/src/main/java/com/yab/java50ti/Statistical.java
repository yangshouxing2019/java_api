package com.yab.java50ti;
/**
 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数
 *
 *统计字符：statistical character
 */
public class Statistical {
    public void count(String src){
        String e1="[\\u4e00-\\u9fa5]";
        String e2="[a-zA-Z]";
        String e3="[0-9]";
        String e4="\\s";
        char[] array=src.toCharArray();
    }

    public static void main(String[] args) {
        Statistical st=new Statistical();
        st.count("ncjd 25 23 无 c ");
    }
}
