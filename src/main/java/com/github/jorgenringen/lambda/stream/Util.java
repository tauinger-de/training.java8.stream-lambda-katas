package com.github.jorgenringen.lambda.stream;

import java.util.Collections;
import java.util.Comparator;
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
        return input
                .stream()
                .filter(s -> s.length() < 3)
                .collect(Collectors.toList());
    }

    public static List<String> sortStrings(List<String> input) {
    	return input
    	.stream()
    	.sorted()
    	.collect(Collectors.toList());
    }

    public static List<Integer> sortIntegers(List<String> input) {
    	return input
    			.stream()
    			.mapToInt(Integer::parseInt)
    			.boxed()
    			.sorted()
    			.collect(Collectors.toList());
    }

    public static List<Integer> sortIntegersDescending(List<String> input) {
    	return input
    			.stream()
    			.mapToInt(Integer::parseInt)
    			.boxed()
    			.sorted(Collections.reverseOrder())
    			.collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> numbers) {
    	return numbers
    			.stream()
    			.mapToInt(Integer::intValue)
    			.sum();
    }

    public static List<String> flattenToSingleCollection(List<List<String>> input) {
    	return input
    			.stream()
    			.flatMap(l -> l.stream())
    			.collect(Collectors.toList());
    }

    public static String separateNamesByComma(List<Person> input) {
        return "Names: " +
                input.stream().map(Person::getName)
                        .collect(Collectors.joining(", "))
                + ".";
    }

    public static String findNameOfOldestPerson(List<Person> input) {
        return input
                .stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .map(Person::getName)
                .findFirst()
                .orElse(null);
    }

    public static List<String> filterPeopleLessThan18YearsOld(List<Person> input) {
        return input
                .stream()
                .filter(p -> p.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toList());
    }

    public static IntSummaryStatistics getSummaryStatisticsForAge(List<Person> input) {
        return input
                .stream()
                .mapToInt(Person::getAge)
                .collect(IntSummaryStatistics::new, IntSummaryStatistics::accept, IntSummaryStatistics::combine);
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> input) {
        return input
                .stream()
                .collect(Collectors.partitioningBy(p -> p.getAge() >= 18));
    }

    public static Map<String, List<Person>> partitionByNationality(List<Person> input) {
        return input
                .stream()
                .collect(Collectors.groupingBy(Person::getCountry));
    }
}
