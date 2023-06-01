package teste;

import java.util.List;

//ReduceP1
public class MainUm {
    public static void main(String[] args) {
        List<Integer>integers = List.of(1,2,3,4,5,6);
        System.out.println("-------------Adding---------------");
        integers.stream().reduce((x,y)-> x + y).ifPresent(System.out::println);//as 4 opcs fazem o mesmo
        System.out.println(integers.stream().reduce(0,(x,y)->x + y));
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0,Integer::sum));
        System.out.println("-----------Multiplying----------------------");
        integers.stream().reduce((x,y)->x * y).ifPresent(System.out::println);//as 2 opcs fazem o mesmo
        System.out.println(integers.stream().reduce(1,(x,y)->x * y));
        System.out.println("------------Highest Value------------");
        integers.stream().reduce((x,y)->x > y ? x : y).ifPresent(System.out::println);//as 2 opcs fazem o mesmo
        System.out.println(integers.stream().reduce(0,Integer::max));
    }
}