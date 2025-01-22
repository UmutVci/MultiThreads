package com.umutavci;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        String path = "data.txt";
        List<Thread> threadList = new ArrayList<>();
       try (BufferedReader br = new BufferedReader(new FileReader(path)))
       {
           String m;
           while((m = br.readLine()) != null){
               AccountingThread accountingThread = new AccountingThread(m, map);
               threadList.add(accountingThread);
               accountingThread.start();
           }
       }
       catch (IOException e){
           e.printStackTrace();
       }
       for(Thread thread : threadList){
           try {
               thread.join();
           }
           catch (InterruptedException e){
               e.printStackTrace();
           }
       }
    }
}