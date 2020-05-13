package org.codingdojo.kata;

import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Java8Test {
    @Test
    void should_lambda() {
        //Lambda表达式
        new Thread(() -> System.out.println("hello1")).start();
        //使用Lambda表达式提供Supplier接口实现，返回OK字符串
        Supplier<String> stringSupplier = () -> "OK";
        //使用方法引用提供Supplier接口实现，返回空字符串
        Supplier<String> supplier = String::new;

        // Predicate 接口是输入一个参数，返回布尔值。
        // 我们通过and方法组合两个Predicate条件，判断是否值大于0并且是偶数
        Predicate<Integer> positiveNumber = i -> i > 0;
        Predicate<Integer> evenNumber = i -> i % 2 == 0;
        assertTrue(positiveNumber.and(evenNumber).test(2));

        // Consumer 接口是消费一个数据。
        // 我们通过andThen方法组合调用两个Consumer，输出两行 abcdefg
        Consumer<String> println = System.out::println;
        println.andThen(println).accept("abcdefg");

        // Function接口是输入一个数据，计算后输出一个数据。
        // 我们先把字符串转换为大写，然后通过andThen组合另一个Function实现字符串拼接
        Function<String, String> upperCase = String::toUpperCase;
        Function<String, String> duplicate = s -> s.concat(s);
        assertThat(upperCase.andThen(duplicate).apply("test"), is("TESTTEST"));

        // Supplier是提供一个数据的接口。这里我们实现获取一个随机数
        Supplier<Integer> random = () -> ThreadLocalRandom.current().nextInt();
        System.out.println(random.get());

        // BinaryOperator是输入两个同类型参数，输出一个同类型参数的接口。
        // 这里我们通过方法引用获得一个整数加法操作，通过Lambda表达式定义一个减法操作，然后依次调用
        BinaryOperator<Integer> add = Integer::sum;
        BinaryOperator<Integer> subtraction = (a, b) -> a - b;
        assertThat(subtraction.apply(add.apply(1, 2), 3), is(0));
    }

    @Test
    void example_for_stream() {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        double average = Java8.calc(ints);
        double streamResult = ints.stream()
                .map(i -> new Point2D.Double((double) i % 3, (double) i / 3))
                .filter(point -> point.getY() > 1)
                .mapToDouble(point -> point.distance(0, 0))
                .average()
                .orElse(0);
        // 如何用一行代码来实现，比较一下可读性
        assertThat(average, is(streamResult));
    }

    @Test
    public void optional() {
        //通过get方法获取Optional中的实际值
        assertThat(Optional.of(1).get(), is(1));
        // 通过 ofNullable 来初始化一个 null，
        // 通过 orElse 方法实现 Optional 中无数据的时候返回一个默认值
        assertThat(Optional.ofNullable(null).orElse("A"), is("A"));
        // OptionalDouble 是基本类型 double 的 Optional 对象，
        // isPresent 判断有无数据
        assertFalse(OptionalDouble.empty().isPresent());
        // 通过map方法可以对Optional对象进行级联转换，
        // 不会出现空指针，转换后还是一个Optional


    }

//    @FunctionalInterface
//    public interface Function<T, R> {
//        R apply(T t);
//
//        default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
//            Objects.requireNonNull(before);
//            return (V v) -> apply(before.apply(v));
//        }
//
//        default <V> Function<T, V> addThen(Function<? super R, ? extends V> after) {
//            Objects.requireNonNull(after);
//            return (T t) -> after.apply(apply(t));
//        }
//    }

}
