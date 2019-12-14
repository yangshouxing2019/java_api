package com.tedu.cn.api.file;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileTest {


    @Test
    public void m1() throws IOException {
        /*
         File类位于java.io包下的一个类，可通过该类操作本地磁盘的数据
         但不能读取文件的内容
         */
        File f=new File("t.txt");
        if(f.exists()){
            System.out.println("文件存在");
        }else{
            System.out.println("文件不存在");

            System.out.println(f.createNewFile()?"创建成功":"创建不成功");
        }
    }


    @Test
    public void m2() throws IOException {
        //文件是否存在，若不存在创建
        File f=new File("file");
        if(f.exists()){
            System.out.println("文件存在");
        }else{
            System.out.println("文件不存在");
            boolean flag=f.mkdir();     //创建文件夹
            System.out.println(flag?"创建成功":"创建不成功");
        }
        //创建子文件
        f=new File(f,"ch");
        if(f.exists()){
            System.out.println("文件存在");
            System.out.println("ok");
        }else{
            System.out.println(f.createNewFile()?"创建成功":"创建不成功");
        }

    }


    @Test
    public void m3(){
        //重命名文件
        File f=new File("t.txt");
        if(f.exists()){
            f.renameTo(new File("new.txt"));
        }
    }


    @Test
    public void m4(){

        File f=new File("E:\\homework");
        if(f.exists()){
//            File[] fs=f.listFiles(new FileFilter() {
//                @Override                  //选择性获取文件名
//                public boolean accept(File pathname) {
////                    return pathname.getName().contains(".doc");
//                    return pathname.isDirectory();
//                }
//            });
//            File[] fs=f.listFiles(pathname -> pathname.getName().contains(".doc"));
            //获取所有文件夹的名称
            File[] fs=f.listFiles(pathname -> pathname.isDirectory());
            for (int i = 0; i <fs.length ; i++) {
                System.out.println(fs[i].getName());
            }
        }
    }


    @Test
    public void m5(){
        //遍历删除文件
        File f=new File("file");
        del(f);

    }

    public static void del(File file){
        if(file.isDirectory()){
            File[] fs=file.listFiles();  //创建文件数组
            for (int i = 0; i < fs.length; i++) {
                del(fs[i]);
            }
            file.delete();
        }
    }


    /**
     * 测试RandomAccessFile
     * 该类专门用于向文件里写内容
     */
    @Test
    public void m6() throws IOException {
        File f=new File("new.txt");
        RandomAccessFile raf=new RandomAccessFile(f,"rw");//记得最后要关闭流 rw可读可写
        String first_line=raf.readLine();//读一行内容
        System.out.println(new String(first_line.getBytes("ISO-8859-1"),
                "utf-8"));//中文读取
        raf.close();
    }
}

