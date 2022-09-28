import tasks_impl.StreamsUtil;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Artem");
        names.add("Taras");
        names.add("Petro");
        names.add("Andriy");
        names.add("Sofia");
        names.add("Dana");
        names.add("Max");

        //1-st Task
        System.out.println(StreamsUtil.oddIndexCollect(names));

        //2-nd Task
        System.out.println(StreamsUtil.toUpperCaseAndSort(names));

        //3-rd Task
        Integer[] integers = new Integer[]{1,5,0,4,2,3};
        System.out.println(StreamsUtil.sortArray(integers));

        //4-th Task
        Stream<Long> longStream = StreamsUtil.generateLongRandom(0L, 25214903917L, 11 , Math.pow(2,48));
        System.out.println(longStream.toList());

        //5-th Task
        Stream<Integer> stream = StreamsUtil.zip(Stream.of(3,5,4,6),Stream.of(1,2,7));
        System.out.println(stream.toList());
    }
}
