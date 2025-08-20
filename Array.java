

package com.mycompany.laboratory_exercise;

public class Array {
        static String[] arr = new String[5];
        
        static int[] array = new int[5];
  
        public static void main(String[] args) {
        
            System.out.println("Relatives Check");
                    System.out.println();

        arr[0] = "Vincent";
        arr[1] = "Jerson";
        arr[2] = "Ina";
        arr[3] = "Chan";
        arr[4] = "Althea";
        int idx = 0;
        
        
        
        System.out.println("Item 1:");
        for(String i: arr){
            System.out.println(idx +  ": " + i);
            idx++;
        }
        
        
        array[0] = 20;
        array[1] = 10;
        array[2] = 10;
        array[3] = 7;
        array[4] = 1;
        
        int total = 0;
        
        System.out.println();
        System.out.println("Item 2:");


                
        for(int i = 0; i < array.length; i++){
            
            System.out.println("Value of index position " + i + ": " + array[i]);
            
            total = total + array[i];
            
        }
        System.out.println("====================");
                
        System.out.println("Final Count: " + total);
        
        
    }
}