package com.software.contorller;

import org.springframework.http.converter.json.GsonBuilderUtils;

public class ThreadTest{
  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    myThread.start();
    for (int i = 0; i <= 50 ; i++) {
      if (i%2 != 0){
        System.out.println("i = " + i);;
      }
    }
  }
}


class MyThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i <= 50; i++) {
      if (i%2==0){
        System.out.println(i);
      }
    }
  }
}
