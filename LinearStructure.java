
package linearstructure;

import java.util.Scanner;

public class LinearStructure {

   Node head;
static class Node{
    String linked;
    Node next;
    
    Node(String d){
        linked = d;
        next = null;
    }
}

public static LinearStructure insert(LinearStructure linked, String song_title){
    
    Node new_node = new Node(song_title);
    
    if(linked.head == null){
        linked.head = new_node;
    }
    else{
        Node last = linked.head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
    }
    return linked;
}

public static void show(LinearStructure list){
    
    Node currNode = list.head;
    
    System.out.println();
    System.out.println("LinkedList Output:");
    while(currNode != null){
        System.out.print(currNode.linked + " -> ");
        currNode = currNode.next;
    }
    System.out.println("null");
}

    
    public static void main(String[] args) {
        
      
       Scanner scan = new Scanner(System.in);
        
       System.out.println("------SELECTIONS------");
       
       System.out.println("Press 1: Array // Press 2: Linked List");
       
       System.out.println();
       
       System.out.print("Press:");
       String all = scan.nextLine();
       
       
       System.out.println();
       
      System.out.print("Q1. How many items entered? ");
      int elem = scan.nextInt();
      
      System.out.println();
      
       if(all.equalsIgnoreCase("1")){
           
           String[] array = new String[elem];
           int num = 0;
          
           System.out.println("Provide any value to store");
           scan.nextLine();
           
       while(num < elem){
              
           System.out.print("Input: ");
           array[num] = scan.nextLine();
           
           num++;
           
           
          }
         System.out.println();
         
         System.out.println("Output: ");
       
       for(String print:array){
           
          
           System.out.println(print);
           
       }
          
       }
       
       else if(all.equalsIgnoreCase("2")){
           LinearStructure list = new LinearStructure();
           
           int num = 0;
          
           System.out.println("Provide any value to store");
           scan.nextLine();
           
       while(num < elem){
              
           System.out.print("Input: ");
           list.insert(list, scan.nextLine());
           
           num++;
           
           
          }
       
        list.show(list);
       }
   
        
    }
    
}