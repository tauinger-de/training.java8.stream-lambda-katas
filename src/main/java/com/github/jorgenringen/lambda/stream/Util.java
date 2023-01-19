package com.github.jorgenringen.lambda.stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Util {

    public static List<String> mapToUppercase(List<String> input) {
        return input
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static List<String> removeElementsWithFourOrMoreCharacters(List<String> input) {
        throw new RuntimeException("not implemented");
    }

    public static List<String> sortStrings(List<String> input) {
        throw new RuntimeException("not implemented");
    }

    public static List<Integer> sortIntegers(List<String> input) {
        throw new RuntimeException("not implemented");
    }

    public static List<Integer> sortIntegersDescending(List<String> input) {
        throw new RuntimeException("not implemented");
    }

    public static Integer sum(List<Integer> numbers) {
        throw new RuntimeException("not implemented");
    }

    public static List<String> flattenToSingleCollection(List<List<String>> input) {
        throw new RuntimeException("not implemented");
    }

    public static String separateNamesByComma(List<Person> input) {
        throw new RuntimeException("not implemented");
    }

    public static String findNameOfOldestPerson(List<Person> input) {
        throw new RuntimeException("not implemented");
    }

    public static List<String> filterPeopleLessThan18YearsOld(List<Person> input) {
        throw new RuntimeException("not implemented");
    }

    public static IntSummaryStatistics getSummaryStatisticsForAge(List<Person> input) {
        throw new RuntimeException("not implemented");
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> input) {
        throw new RuntimeException("not implemented");
    }

    public static Map<String, List<Person>> partitionByNationality(List<Person> input) {
        throw new RuntimeException("not implemented");
    }
}
