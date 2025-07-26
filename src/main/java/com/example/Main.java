package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    Integer[] scores = new Integer[]{80, 66, 73, 92, 43};

    Stream<Integer> scoresStream = Arrays.stream(scores);
    scoresStream.forEach(score -> System.out.print(score + ", "));
    System.out.println();
    // create a new stream
    Arrays.stream(scores).sorted().forEach(score -> System.out.print(score + ", "));
    System.out.println();

    List<String> shoppingList = new ArrayList<>();
    shoppingList.add("coffee");
    shoppingList.add("bread");
    shoppingList.add("pineapple");
    shoppingList.add("milk");
    shoppingList.add("pasta");

    Stream shoppingListStream = shoppingList.stream();
    shoppingListStream.sorted().forEach(item -> System.out.println(item));


  }
}
