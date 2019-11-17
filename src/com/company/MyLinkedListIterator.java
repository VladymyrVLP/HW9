package com.company;

import java.util.Iterator;

public class MyLinkedListIterator<E> implements Iterator {
    private int index = 0;
    private E[] array;

    MyLinkedListIterator(E[] array){
        this.array = array;
    }
    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public Object next() {
        return array[index++];
    }


}
