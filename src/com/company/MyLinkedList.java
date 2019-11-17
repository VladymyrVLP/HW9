package com.company;

import javax.print.attribute.standard.MediaSize;
import java.util.LinkedList;

public class MyLinkedList<E> implements CustomCollection<E> {

    private Node<E> fstNode;
    private Node<E> lstNode;
    private int size = 0;

    public MyLinkedList(){
        lstNode = new Node<E>(fstNode,null,null);
        fstNode = new Node<E>(null,null, lstNode);
    }

    @Override
    public boolean add(E e) {
      // Node<E> prev =lstNode;
       //prev.setNewElem(e);
       //lstNode = new Node<E>(prev, null ,null);
       //prev.setNextElem(lstNode);
        //size++;
        final Node<E> l = lstNode;
        final Node<E> newNode = new Node<>(l, e, null);
        lstNode= newNode;
        if (l == null)
            fstNode = newNode;
        else
            l.nextElem = newNode;
        size++;
        return true;
    }


    @Override
    public E get(int index) {
        Node<E> target = fstNode.getNextElem();
        for (int i = 0;i < index; i++){
            target =getNexElement(target);
        }
        return target.getNewElem();
    }
    private Node<E> getNexElement(Node<E> newe){
        return newe.getNextElem();
}
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean trim() {
        return false;
    }

    @Override
    public boolean clear(){
        for (Node<E> x = fstNode; x != null; ) {
            Node<E> next = x.nextElem;
            x.newElem= null;
            x.nextElem = null;
            x.prevElem = null;
            x = next;
        }
        fstNode = lstNode = null;
        size = 0;
        return true;
    }

    private static class Node<E> {
      private E newElem;
      private Node<E> nextElem;
      private Node<E> prevElem;
        Node(Node<E> prevElem, E newElem, Node<E> nextElem) {
            this.newElem = newElem;
            this.nextElem = nextElem;
            this.prevElem = prevElem;
        }

         public E getNewElem() {
             return newElem;
         }

         public void setNewElem(E newElem) {
             this.newElem = newElem;
         }

         public Node<E> getNextElem() {
             return nextElem;
         }

         public void setNextElem(Node<E> nextElem) {
             this.nextElem = nextElem;
         }

         public Node<E> getPrevElem() {
             return prevElem;
         }

         public void setPrevElem(Node<E> prevElem) {
             this.prevElem = prevElem;
         }
     }


}
