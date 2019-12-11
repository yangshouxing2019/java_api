package com.tedu.cn.api.file;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class FileTest {
    @Test
    public void m1() throws IOException {
        /**
         * File类位于java.io包下的一个类，可通过该类操作本地磁盘的数据
         * 但不能读取文件的内容
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
        File f=new File("file");
//        if(f.exists()){
//            System.out.println("文件存在");
//            f.delete();
//            System.out.println("ok");
//        }else{
//            System.out.println("文件不存在");
////            boolean flag=f.mkdir();
////            System.out.println(flag?"创建成功":"创建不成功");
//        }
//        f=new File(f,"ch");
//        if(f.exists()){
//            System.out.println("文件存在");
//            f.delete();
//            System.out.println("ok");
//        }else{
////            System.out.println(f.createNewFile()?"创建成功":"创建不成功");
//        }
        if(f.exists()){

        }

    }
    @Test
    public void m3(){
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
//                @Override
//                public boolean accept(File pathname) {
////                    return pathname.getName().contains(".doc");
//                    return pathname.isDirectory();
//                }
//            });
//            File[] fs=f.listFiles(pathname -> pathname.getName().contains(".doc"));
            File[] fs=f.listFiles(pathname -> pathname.isDirectory());
            for (int i = 0; i <fs.length ; i++) {
                System.out.println(fs[i].getName());
            }
        }

    }
}

