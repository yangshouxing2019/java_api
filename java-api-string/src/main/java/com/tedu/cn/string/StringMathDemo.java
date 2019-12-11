package com.tedu.cn.string;

import org.junit.Test;

public class StringMathDemo {
    //正则表达式查找jdk1.8==pattern
    /**
     * 基本匹配规则，：
     * [a-zA-Z0-9]或者\w表示a-z，A-Z，0-9之间的任意一个字符
     * 参考网上的资源。
     */
    @Test
    public void m1(){
        String r="[a-z]";
        System.out.println("a".matches(r));//判断 ：a是否匹配r的正则表达式
        System.out.println("0".matches(r));
        r="[a-zA-Z0-9]";//r表示a-z，A-Z，0-9之间的任意一个字符
        System.out.println("===========");
        System.out.println("0".matches(r));

        r="[a-z]+";// +表示多个字符
        System.out.println("wsbxunijn".matches(r));

        r="[^a-f]";//除了a-f之间的一个任意字符
        String b="[^a-f]+";//除了a-f之间的字符，的任意多个字符串。
        System.out.println("===========");
        System.out.println("h".matches(r));
        System.out.println("mm".matches(b));

        String c="[a-z&&[^abc]]+";
        System.out.println("===========");
        System.out.println("zz".matches(c));
    }
    @Test
    public void m2() {
        /**
         *  . 表示任意一个字符
         *  \d 表示任意一个数字字符 相当于[0-9]
         *  \w 表示任意一个单词字符 相当于[a-zA-Z0-9]
         *  \s 表示任意一个空白字符
         *  \D 表示非数字字符
         *  \W 表示非单词字符
         *  \S 表示任意一个空白字符
         */
        /**
         * 数量词
         * X? 表示前面的X出现0次或者1次
         * X+ 表示前面的X出现1次或者多次
         * X* 表示前面的X出现0次或者多次
         * X{n}  表示前面的X刚好出现n次
         * X{n,} 表示前面的X至少出现n次
         * X{m，n} 表示前面的X出现m次到n次之间包含n
         */
        String r = "\\d";
        System.out.println("9".matches(r));
        r = "\\d*";//表示前面的X出现0次或者多次
        System.out.println("11".matches(r));
        r = "\\d?";//表示前面的X出现0次或者1次
        System.out.println("55".matches(r));
        r = "\\d{1,2}";
        System.out.println("666666".matches(r));
        r = "\\w{1,2}";
        System.out.println("vv".matches(r));
        r = ".{1,2}";
        System.out.println("*$*".matches(r));
    }
    //电话号码、邮箱、文字
    @Test
    public void m3(){
        String r="(\\+86)?\\s?\\d{11}";
//           Scanner scanner=new Scanner(System.in);
//           String a=scanner.next();
        String a="18798251600";
        System.out.println("请输入有效的手机号码：");
        if(a.matches(r)){
            System.out.println("手机号码合法："+a);
        }
        else{
            System.out.println("手机号码不合法："+a);
        }
//           scanner.close();//关闭流，必须关闭
    }

    @Test
    //邮箱：2431582791@qq.com，，10个数字，@qq.com
    public void m4(){
        String  r="\\d{10}(\\@qq.com)";
        String s="2431582791@qq.com";
        if(s.matches(r)){
            System.out.println("邮箱规格合法：");
        }else{
            System.out.println("邮箱规格不合法");
        }
    }
}
