package com.example.android.fragments;

import android.util.Log;

/**
 * Created by Trust on 22-06-2016.
 */
public class TestThread extends Thread{
        public void run(){
            for(int i=1;i<5;i++){
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    Log.e("String: ",e.getMessage());
                }
                Log.e("i: ", String.valueOf(i));
                //System.out.println(i);
            }
        }
//        public static void main(String args[]){
//            TestThread t1 =new TestThread();
//            TestThread t2 =new TestThread();
//            t1.start();
//
//        }
    }
