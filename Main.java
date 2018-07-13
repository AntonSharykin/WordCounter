package com.sharykin.anton;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        String[] ImpData = null;
        Map<String,Integer> map = new HashMap<>();
        try {
            String str = null;
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            while ((str = br.readLine()) != null) {
                String[] list = str.split("[,. ]");
                for (String elem : list) {
                    map.put(elem, map.containsKey(elem) ? map.get(elem)+1 : 1);
                }
            }
            br.close();
        } catch (IOException exc) {
            System.out.println("IO error!" + exc);
        }
        Set<Map.Entry<String, Integer>> set = map.entrySet();


        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
