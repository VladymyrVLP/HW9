package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
      CustomCollection<String> stringCustomCollection =new MyLinkedList<>();
      stringCustomCollection.add("a");
      stringCustomCollection.add("b");
      stringCustomCollection.add("c");
      stringCustomCollection.add("d");
      stringCustomCollection.add("e");
      stringCustomCollection.add("f");
      System.out.println(stringCustomCollection.size());
      System.out.println(stringCustomCollection.get(6));
      stringCustomCollection.clear();
      System.out.println(stringCustomCollection.size());

    }
}
