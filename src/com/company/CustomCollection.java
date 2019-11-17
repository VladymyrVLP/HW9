package com.company;

public interface CustomCollection<E> {//extends Iterable<E>{
    boolean add(E e);
    E get(int index);
    int size();
    boolean clear();
    boolean trim();
}
