package com.carara.implementation;

import com.carara.WordCounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/*
 * This implementation of WordCounter uses Java imperative programming to
 * read a text file and count the occurrences of each word in the file.
 */
public class ImperativeExample implements WordCounter {

    // This pattern matches a single space character
    private static final Pattern SPACE_PATTERN = Pattern.compile(" ");

    /*
     * Reads a file line-by-line using a BufferedReader, splits each line into words, and adds
     * the words to a list. Counts the occurrences of each word using a `HashMap`.
     */
    @Override
    public List<String> getWords(String filename) {
        List<String> wordsList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.trim().split(SPACE_PATTERN.pattern());
                for (String word : lineWords) {
                    wordsList.add(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordsList;
    }

    /*
     * Counts the occurrences of each word in a list using a `HashMap`.
     */
    @Override
    public Map<String, Integer> countWords(List<String> wordsList) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : wordsList) {
            wordCount.compute(word, (k, v) -> v == null ? 1 : v + 1);
        }

        return wordCount;
    }
}