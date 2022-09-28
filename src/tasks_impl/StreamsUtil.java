package tasks_impl;

import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsUtil {
    public static String oddIndexCollect(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(names::get)
                .collect(Collectors.joining(" "));
    }

    public static List<String> toUpperCaseAndSort(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    public static String sortArray(Integer[] integers) {
        List<Integer> list= new ArrayList<>(List.of(integers));
        return list.stream()
                .sorted()
                .toList()
                .toString();
    }

    public static Stream<Long> generateLongRandom(long seed, long a, long c, double m) {
        // According to the task we don`t need limit, but I added it to see the result of the stream
        return Stream.iterate(seed, i -> (long) ((a * i) + c % m))
                .limit(10);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.toList();
        List<T> secondList = second.toList();

        Stream<T> firstPart = IntStream.range(0, Math.min(firstList.size(), secondList.size()))
                .mapToObj(i -> i % 2 == 0 ? firstList.get(i) : secondList.get(i));

        Stream<T> secondPart = IntStream.range(0, Math.min(firstList.size(), secondList.size()))
                .mapToObj(i -> i % 2 == 0 ? secondList.get(i) : firstList.get(i));

        return Stream.concat(firstPart,secondPart);
    }
}



