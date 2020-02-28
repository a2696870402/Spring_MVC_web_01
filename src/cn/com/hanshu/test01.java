package cn.com.hanshu;

import java.util.stream.Stream;

public class test01 {
    public static void main(String[] args) {
        Stream<String> stringStream=Stream.of("test","t1","t2","t3","aaa");
        Stream<String> stringStream2=Stream.of("test","t1","t2","t3","aaa");
        Stream<String> stringStream3=Stream.of("test i am","you am i","1 234","t3","aaa");
        Stream<String> stringStream4=Stream.of("test", "t1", "t2", "teeeee", "aaaa", "taaa");

        //查找所有含有t的字符串并输出
        //filter 进行过滤操作
        System.out.println("----filter的使用----");
        stringStream.filter(n->n.contains("t")).forEach(System.out::println);
        //map 对每一个元素进行相同的操作，并输出一个，一对一的处理
        System.out.println("----map的使用----");
        stringStream2.map(n->n.concat(".txt")).forEach(System.out::println);
        //flatMap 对每一个元素进行处理，并输出多个，一对多的处理
        System.out.println("----flatMap的使用----");
        stringStream3.flatMap(n->Stream.of(n.split(" "))).forEach(System.out::println);
        //takeWhile 如果Stream是有序的，那么返回最长命中序列(符合传入的规则的最长命中序列)，
        //          如果是无序的，那么返回所有的符合规则的命中序列
        //dropWhile 如果Stream是有序的，那么返回除了最长命中序列的其他序列，
        //          如果是无序的，那么返回所有未命中的序列


    }
}
