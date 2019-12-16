package com.tedu.cn.api.file;

import com.tedu.cn.api.file.entity.Emp;
import org.junit.Test;

import java.io.*;
import java.util.Date;


public class IOTest {
    /**
     * 流的概念
     * 流就是一根水管，通过该水管运输数据，
     * 由于运输的方向有输入方向和输出方向
     * 所以流分为标准的输入输出流
     *
     * Java语言里面有一个抽象类叫做InputStream
     * 它是所有输入流的父类，该类是一个抽象类
     * 提供了3个重载的方法读取数据，分别是：
     * 1、int read();每次读取1字节
     * 2、int read(byte[] bf);每次读取bf长度的数据
     * 3、int read(byte[] bf, int off, int len);
     *
     * 标准的输出流的父类是：OutputStream
     * 该类提供了3个write方法：
     * 1、public abstract void write(int b)
     *                     throws IOException
     * 2、public void write(byte[] b)
     *            throws IOException
     * 3、public void write(byte[] b,
     *                   int off,
     *                   int len)
     *            throws IOException
     */
    @Test
    public void m1() throws IOException {
        //创建一个输入流对象
        InputStream is=new FileInputStream(new File("pkuthss.zip"));
        //创建一个输出流对象
        OutputStream os=new FileOutputStream(new File("copy.zip"));
        byte[] bs=new byte[1024];
//        long len=0;
        while (is.read(bs)!=-1){
            os.write(bs);
        }
        //关闭流
        is.close();
        os.close();
        System.out.println("拷贝完毕");
    }

    /**
     * 基于包装流（缓冲流的文件复制）
     * BufferedInputStream（缓冲输入流）
     * BufferedOutputStream（缓冲输出流）
     */

    @Test
    public void m2() throws IOException {
        //创建一个输入流对象
        InputStream is=new FileInputStream(new File("pkuthss.zip"));
        //创建一个输出流对象
        OutputStream os=new FileOutputStream(new File("copy.zip"));
        //创建一个高级输入流（包装流）
        BufferedInputStream bis=new BufferedInputStream(is);
        //创建一个高级输出流（包装流）
        BufferedOutputStream bos=new BufferedOutputStream(os);
        //执行复制的逻辑
        byte[] bs=new byte[1024];
        while (bis.read(bs)!=-1){
            bos.write(bs);
        }
        bos.flush();//通知司机。。没有砖块了。。开车走人
        bis.close();
        bos.close();
        System.out.println("拷贝成功");

    }

    /**
     * 测试序列化
     */
    @Test
    public void m3() throws IOException {
        Emp emp=new Emp(1234,"Jack","M",new Date(),5000,3000,2);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("emp.obj"));
        oos.writeObject(emp);
        oos.close();
        System.out.println("序列化完毕");
    }

    /**
     * 反序列化
     */
    @Test
    public void m4() throws IOException, ClassNotFoundException {
        InputStream is=new FileInputStream("emp.obj");
        ObjectInputStream ois=new ObjectInputStream(is);
        Emp emp=(Emp) ois.readObject();
        is.close();
        ois.close();
        System.out.println(emp);
    }
    @Test
    public void del(){
        File f=new File("copy.zip");
        if(f.exists()){
            f.delete();
        }
        System.out.println("删除成功");
    }
}
