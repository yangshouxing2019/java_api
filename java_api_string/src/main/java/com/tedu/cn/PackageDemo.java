package com.tedu.cn;

import com.tedu.cn.ex.PasswordException;
import org.junit.Test;

import java.io.*;

public class PackageDemo {
    @Test
    public  void  m1(){
        Integer a=1;
        System.out.println(Integer.toOctalString(12));

    }
    @Test
    public void m2(){
        min();
    }

    public  static void min(){
        try {

            File file=new File("tts.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            InputStream inputStream=new FileInputStream(file);
//            System.out.println(1/0);
            String src=null;
            System.out.println(src.lastIndexOf("ds"));
        }catch (ArithmeticException e1){
            System.out.println("除数不能为0 ");
        }catch (FileNotFoundException e2){
            System.out.println("没找到文件");
        }catch (NullPointerException e3){
            System.out.println("出现空指针异常");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("程序运行完了");
        }
    }
    @Test
    public void m3(){
        try {
            autoEX();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void autoEX() throws Exception {
        Exception exception=new Exception("我创建的异常");
        throw exception;//这两句等价于 throw new Exception("我创建的异常");
    }
    @Test
    public void m4(){
        String pwd="cbns1234";
        if(pwd.length()<8){
            throw new PasswordException(2,"安全系数较低");
        }else if(pwd.matches("\\d{4,8}&&\\w{4,8}")){
            throw new PasswordException(1,"密码不匹配");
        }else if(!pwd.equals("cbhs1234")){
            throw new PasswordException(3,"密码错误");
        }
    }
}
