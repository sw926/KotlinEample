package com.example.chapter02.section02

/**
 * Created by sunwei on 2018/9/17.
 * Project: KotlinSample
 */
class Demo1 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val foo = Example.Foo()
            print(foo.`var`)
        }
    }
}

class Demo2 {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            var foo = StringBuilder("hello").toString()
            var bar = StringBuilder("hello").toString()

            println(foo == bar)   // 输出结果为：true
            println(foo === bar)  // 输出结果为：false
        }
    }
}

class Demo3 {
    companion object {

        fun sum(a: Int, b: Int): String {
            return "$a + $b = ${a + b}"
        }

        @JvmStatic
        fun main(args: Array<String>) {
            print(sum(10, 11))
        }
        // 输出结果：10 + 11 = 21
    }
}


