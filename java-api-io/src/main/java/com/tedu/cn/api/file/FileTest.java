package com.tedu.cn.api.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileTest {


    @Test
    public void m1() throws IOException {
        /*
         File类位于java.io包下的一个类，可通过该类操作本地磁盘的数据
         但不能读取文件的内容
         */
        File f = new File("t.txt");
        if (f.exists()) {
            System.out.println("文件存在");
        } else {
            System.out.println("文件不存在");

            System.out.println(f.createNewFile() ? "创建成功" : "创建不成功");
        }
    }


    @Test
    public void m2() throws IOException {
        //文件是否存在，若不存在创建
        File f = new File("file");
        if (f.exists()) {
            System.out.println("文件存在");
        } else {
            System.out.println("文件不存在");
            boolean flag = f.mkdir();     //创建文件夹
            System.out.println(flag ? "创建成功" : "创建不成功");
        }
        //创建子文件
        f = new File(f, "ch");
        if (f.exists()) {
            System.out.println("文件存在");
            System.out.println("ok");
        } else {
            System.out.println(f.createNewFile() ? "创建成功" : "创建不成功");
        }

    }


    @Test
    public void m3() {
        //重命名文件
        File f = new File("t.txt");
        if (f.exists()) {
            f.renameTo(new File("new.txt"));
        }
    }


    @Test
    public void m4() {

        File f = new File("E:\\homework");
        if (f.exists()) {
//            File[] fs=f.listFiles(new FileFilter() {
//                @Override                  //选择性获取文件名
//                public boolean accept(File pathname) {
////                    return pathname.getName().contains(".doc");
//                    return pathname.isDirectory();
//                }
//            });
////            获取后缀为".doc"的文件
//            File[] fs=f.listFiles(pathname -> pathname.getName().contains(".doc"));
            //获取所有文件夹的名称
            File[] fs = f.listFiles(pathname -> pathname.isDirectory());
            for (int i = 0; i < fs.length; i++) {
                System.out.println(fs[i].getName());
            }
        }
    }


    @Test
    public void m5() {
        //遍历删除文件
        File f = new File("file");
        del(f);

    }

    public static void del(File file) {
        if (file.isDirectory()) {
            File[] fs = file.listFiles();  //创建文件数组
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
        File f = new File("new.txt");
        RandomAccessFile raf = new RandomAccessFile(f, "rw");//记得最后要关闭流 rw可读可写
        String first_line = raf.readLine();//读一行内容
        System.out.println(new String(first_line.getBytes("ISO-8859-1"),
                "utf-8"));//中文读取
        raf.close();
    }


    @Test
    public void m7() throws IOException {
        File f = new File("new.txt");
        RandomAccessFile raf = new RandomAccessFile(f, "rw");
        byte[] bs = new byte[9];//一个汉字占三个字节,读多个汉字  byte[3的倍数]
        System.out.println("当前指针位置：" + raf.getFilePointer());
        int i = raf.read(bs);//读取之后再读取将从上一次读取的位置开始
        System.out.println(new String(bs));
        System.out.println("当前指针位置：" + raf.getFilePointer());
        i = raf.read(bs);
        System.out.println(new String(bs));
        System.out.println("重置指针");
        raf.seek(48);
        System.out.println("当前指针位置：" + raf.getFilePointer());
        i = raf.read(bs);
        System.out.println(new String(bs));
        raf.close();
    }


    @Test
    public void m8() throws IOException {
        //如果读完了（即len=-1）则自动结束读取
        //若有多行，每行的最后有一个"\n"用于换行
        File f = new File("new.txt");
        RandomAccessFile raf = new RandomAccessFile(f, "rw");
        byte[] bs = new byte[1024];//每次读取1kb
        long len = 0;
        String src = "";
        while ((len = raf.read(bs)) != -1) {
            src += new String(bs);
        }
        System.out.println(src);
        raf.close();
    }


    @Test
    public void m9() throws IOException {
        //写入
        File f = new File("new.txt");
        RandomAccessFile raf = new RandomAccessFile(f, "rw");
        raf.seek(raf.length()); //重置指针
        raf.write("\n小女孩".getBytes());
        raf.close();
    }

    @Test
    //克隆 f1负责读 f2负责写
    public void m10() throws IOException {
        File f1=new File("11.png");
        RandomAccessFile raf1=new RandomAccessFile(f1,"r");
        File f2=new File("12.png");
        if(!f2.exists()){
            f2.createNewFile();
        }
        RandomAccessFile raf2=new RandomAccessFile(f2,"rw");
        //拷贝逻辑
        byte[] bs=new byte[1024];
        long len=0;
        while ((len=raf1.read(bs))!=-1){
            raf2.write(bs);
        }
        raf1.close();
        raf2.close();
    }
}

