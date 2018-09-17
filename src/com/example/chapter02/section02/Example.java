package com.example.chapter02.section02;

/**
 * Created by sunwei on 2018/9/17.
 * Project: KotlinSample
 */

public class Example {

    public static class Foo {
        public int var = 0;
    }

    static class Demo1 {
        public static void main(String[] args) {
            String foo = new String("hello");
            String bar = new String("hello");

            System.out.println(foo == bar);   // 引用地址不同，比较结果为false
            System.out.println(foo.equals(bar));  // 字符串内容相同，比较结果为true
        }
    }
}
