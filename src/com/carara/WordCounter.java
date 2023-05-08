package com.carara;

import java.util.List;
import java.util.Map;
/**
 * Interface for counting the occurrences of words in a file or list of strings.
 */
public interface WordCounter {
    /**
     * Reads the words from the specified file and returns them as a list of strings.
     * @param filePath the path to the input file
     * @return a list of strings representing the words in the input file
     */
    List<String> getWords(String filePath);

    /**
     * Counts the occurrences of each word in the specified list and returns a map of word counts.
     * @param wordsList the list of strings representing the words to count
     * @return a map of word counts, where each key is a word and the corresponding value is its count
     */
    Map<String, Integer> countWords(List<String> wordsList);
}