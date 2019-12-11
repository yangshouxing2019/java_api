package com.tedu.cn.string;

import org.junit.Test;
//pull文件
//1、vcs-share
//2、git-Add
//3、Git-->Repsitory-->Fetch
//4、Git-->Repsitory-->pull
import java.io.*;

public class PackageDemo {
    @Test
    public void m1() {
        /**
         * //1、看源码2、会查询API文档
         * 包装类：
         * java语言为每一种基本数据类型都提供一个包装类，
         * 类型的映射如下：
         *
         * 类型-->包装类
         * byte--->Byte
         * short-->Short
         * int-->Integer-*
         * long-->Long
         * double-->Double
         * float-->Float
         * char-->Character-*
         * boolean-->Boolean
         * 这些对应的包装类都实现了一个接口交做Serilizable接口（可序列化接口）
         * 表示这些类能够进行序列化和反序列化。
         * 序列化指：将java文件转化为二进制存储到磁盘里面
         * 反序列化：将java文件从存储转化为可用的class文件。
         * 以前
         * 引用数据类型（对象），基本数据类型
         */
//        int a=0;基本数据类型，不是对象，不能访问方法
        String str = "Hello";//引用数据类型（对象）,可以访问属性和方法

        //整型的包装类。
        Integer b = 0;//相当于：Integer b=new Intrger(b);是一个对像
        //尝试调用Integer的类的toOctorAPI
        //1、看源码2、会查询API文档
        Integer c = 0;
        //static修饰的则需要用类名调用
        System.out.println(Integer.toOctalString(7));//返回八进制；
    }
/**
 * java异常体系
 * 异常：程序不正常的退出。
 * java语言的异常分为两种：
 * （1）Error
 * 硬件故障（磁盘损坏，内存空间不足，断电、Down机服务器坏、）
 * （2）Exception
 * 是属于java程序异常
 *   该异常分为两种：
 *   1、编译时异常
 *   2、运行时异常
 */
    /**
     * 测试Exception异常
     * 出现异常的两种方式
     * 1）通过throws显示抛出，抛给方法的调动者
     * 2）通过try catch语句
     * 进行显示异常的捕获
     */
    @Test
    public void m2() {
        //快捷键 ctrl+alt+t
        try {
            min();
            System.out.println("有异常");


        } catch (Exception e) {
            //e.printStackTrace();打印出异常的代码，爆红的字
        }
    }

    private void min() {
    }

    //public static void main(String[] args) throws FileNotFoundException {

    //InputStream inputStream= new FileInputStream("tts.txt");//因为这里错误，那么try中的代码块就运行

    // }
    @Test
    public void m5() {
        ex();//运行方法ex
    }

    public static void ex() {

        try {  //可能发生的异常
            File f = new File("ttx.txt");
            if (!f.exists()) {//测试此抽象路径名表示的文件或目录是否存在
                f.createNewFile();
            }
            InputStream inputStream = new FileInputStream(new File(String.valueOf(f)));
            System.out.println(1 / 0);
            String str = null;
        } catch (FileNotFoundException f1) {
            System.out.println("文件未找到");
            //f1是对象。可以访问FileNotFoundException内的对象。
        } catch (ArithmeticException f2) {
            System.out.println("除数不能为0");
        } catch (NullPointerException f3) {
            System.out.println("字符串对应的不是null--出现空指针异常");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally程序已经执行");
        }
    }


//    public static void autoEx() throws Exception {
//        Exception e = new Exception("自己创建的异常");
//        throw e;//抛给虚拟机Exception
//    }
/**
 * 运行时异常：RuntimeException
 * 不需要显示抛出或者捕获
 */
//@Test
//public static void mm1(){
//    RuntimeException r=new RuntimeException("出现运行时异常");
//    throw  r;
//}
//public void m7(){
//    mm1();
//}
}
