/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.deque;

/**
 *
 * @author yaroslavtrykoz
 */
public class Deque_main {
    public static void main(String[] args) 
    { 
          
         Deque dq = new Deque(5); 
           
         System.out.println("Insert element at rear end  : 5 "); 
         dq.insertrear(5); 
           
         System.out.println("insert element at rear end : 10 "); 
         dq.insertrear(10); 
           
         System.out.println("get rear element : "+ dq.getRear()); 
           
         dq.deleterear(); 
         System.out.println("After delete rear element new rear become : " +  
                                dq.getRear()); 
           
         System.out.println("inserting element at front end"); 
         dq.insertfront(15); 
           
         System.out.println("get front element: " +dq.getFront()); 
           
         dq.deletefront(); 
           
         System.out.println("After delete front element new front become : " + 
                                    +  dq.getFront()); 
          
    } 
}
