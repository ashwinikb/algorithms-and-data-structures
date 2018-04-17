package com.github.ashwinikb;

public class CustomList<T> {

    private  Node head = null;

   public void add(T element){
       if(head == null){
           head = new Node(element, null);
           return;
       }

       Node prev = head;
       for (Node v = head; v != null; v = v.next){
           prev = v;
       }

       prev.next = new Node(element, null);
   }


   public T get(int index){
       int currentIndex = 0;
       for(Node v = head; v != null; v = v.next){
           if(currentIndex == index  ){
               return v.value;
           }
           currentIndex ++;
       }
       return null;
   }

   public  int size(){
       int size = 0;
       for(Node v = head; v != null; v = v.next){
           size++;

       }
       return size;
   }

   public T peekFirst(){
       return head.value;
   }

}



