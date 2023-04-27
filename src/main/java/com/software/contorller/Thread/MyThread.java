package com.software.contorller.Thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MyThread extends Thread {
    private String url;
    private String fileName;
    public MyThread(String url, String fileName) {
        this.url = url;
        this.fileName = fileName;
    }



    @Override
    public void run() {
        DownLoad downLoad = new DownLoad();
        downLoad.down(url,fileName);
        System.out.println("下载的文件名"+fileName);
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread
                ("https://c-ssl.dtstatic.com/uploads/blog/202207/09/20220709165352_b65b9.thumb.1000_0.jpg","鞠婧祎.jpg");
        myThread.start();
    }
}

class DownLoad{
    public void down(String url,String fileName){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，down方法出现问题");
        }
    }
}

