package com.umutavci;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AccountingThread extends Thread{
    Map<String, Integer> map;
    String path;
    public AccountingThread(String path, Map<String, Integer> map){
        this.map = map;
        this.path = path;
    }
    @Override
    public void run(){
        try (BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            String l;
            while((l = br.readLine()) != null){
                String[] array = l.split(",");
                if(array.length != 3){
                    throw new RuntimeException("File has not correct structure!");
                }
                if(!map.containsKey(array[1])){
                    map.put(array[1], Integer.valueOf(array[2]));
                }
                else{
                    map.put(array[1],map.get(array[1]) + Integer.valueOf(array[2]));
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
