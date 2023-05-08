package com.carara.implementation;

import com.carara.WordCounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * This implementation of WordCounter uses Java 8 streams to read a text file
 * and count the occurrences of each word in the file.
 */
public class DeclarativeExample implements WordCounter {

    // This pattern matches any one or more whitespace character (including spaces, tabs and newlines)
    private static final Pattern SEPARATOR_PATTERN = Pattern.compile("\\s+");

    /*
     * The getWords method reads each line of the file and splits it into words using
     * a regular expression. It then uses a flatMap operation to create a stream of words
     * and returns them as a list.
     */
    @Override
    public List<String> getWords(String filename) {
        try {
            return Files.lines(Paths.get(filename))
                    .flatMap(line -> Stream.of(line.split(SEPARATOR_PATTERN.pattern())))
                    .toList();

        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }


    @Override
    public Map<String, Integer> countWords(List<String> wordsList) {
        // This approach uses a stream to create a map with each word as the key and its
        // count as the value
        // return wordsList.stream()
        //         .collect(Collectors.toMap(Function.identity(), word -> 1, Integer::sum, HashMap::new));

        /*
         * This approach uses a stream to group the words by their value and
         * count the number of occurrences of each word.
         */
        return wordsList.stream()
                .collect(Collectors.groupingBy(String::toString, Collectors.summingInt(word -> 1)));
    }
}