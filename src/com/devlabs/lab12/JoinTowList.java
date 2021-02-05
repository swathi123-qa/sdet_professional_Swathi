package com.devlabs.lab12;

import java.util.ArrayList;
import java.util.List;

public class JoinTowList {

    public static void main(String[] args) {
        List item1 = new ArrayList();
        
        item1.add("Amit");
        item1.add("Suvendu");
        item1.add("Sruti");
        
        List item2 = new ArrayList();
        
        item2.add("Yelow");
        item2.add("Red");
        item2.add("Green");
        
// addall to item1      
        item1.addAll(item2);
        
         for(int j=0;j<item1.size();j++)
           {  
             System.out.println("" +item1.get(j)); 
           }  

        
        
    }

}
