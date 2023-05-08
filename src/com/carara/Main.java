package com.carara;


import com.carara.implementation.ImperativeExample;
import com.carara.implementation.DeclarativeExample;

import java.util.List;
import java.util.Map;



/*
    * This code demonstrates SOLID principles by implementing a solution to CodeSHare's WordCounter problem.
    * It has an interface to count words from a .txt file using two different approaches (imperative and declarative with Streams).
    * It uses programming best practices to create flexible, extensible and maintainable code.

    * SOLID Principles
    * S - Single Responsibility Principle
      *  I demonstrated this principle by creating a WordCounter interface,
      *  wich has a single responsibility: count words from a .txt file.

    * O - Open/Closed Principle
       *  I demonstrated this principle by making the WordCounter open for extension
       * and closed for modification. New implementations of the interface can be
       * added without changing the code that uses the interface.

    * L - Liskov Substitution Principle
       *  I demonstrated this principle by creating two implementations of the
       * WordCounter interface (one imperative and other declarative, with Streams)
       * that can be used interchangeably without affecting the correctness of the program.
       *
    * I - Interface Segregation Principle
      * I demonstrated this principle by defininf a minimal set of methods that are needed
      * to count wordsm, and not forcing the implementations to implement methods that aren't needed.
      *
    * D - Dependency Inversion Principle
       * I demonstrated this principle by depending on abstractions (the WordCounter interface)
       * instead of concrete implementations (the ImperativeExample and DeclarativeExample classes).
    *
 */

public class Main {

    public static final String FILENAME = "src/resources/words.txt";

    public static void main(String[] args) {
        List<String> wordsList;
        Map<String, Integer> wordCount;

        WordCounter imperativeCounter = new ImperativeExample();
        wordsList = imperativeCounter.getWords(FILENAME);
        wordCount = imperativeCounter.countWords(wordsList);
        System.out.println("Word count using ImperativeExample: " + wordCount);

        WordCounter declarativeCounter = new DeclarativeExample();
        wordsList = declarativeCounter.getWords(FILENAME);
        wordCount = declarativeCounter.countWords(wordsList);
        System.out.println("Word count using DeclarativeExample: " + wordCount);
    }
}
