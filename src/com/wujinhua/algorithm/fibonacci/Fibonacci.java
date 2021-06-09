package com.wujinhua.algorithm.fibonacci;

/**
 * 斐波拉契数列
 * 0 1 1 2 3 5 8 13 21 ...
 *
 * @author JinHua_Wu
 * @email wjh1832@163.com
 * @date 2021/6/9 22:31
 */
public class Fibonacci {

    /**
     * 传统方式使用递归来求得斐波拉契
     *
     * @param n 共多少项
     * @return 返回结果
     */
    private static int fib1(int n) {
        if (n <= 1) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    /**
     * 使用递归以后,发现性能极差,改用for循环提升性能
     * 项数:  0 1 2 3 4 5 6 7  8
     * 项值:  0 1 1 2 3 5 8 13 21 ...
     * 可以理解为: 传入一个参数为n, 需要进行n - 1 次相加, 才能得到项数为n的值
     *
     * @param n 项数
     * @return 返回结果
     */
    private static int fib2(int n) {
        if (n <= 1) {
            return n;
        }
        //能走到这一步, 意味着: 项数n >= 3.
        // 那必然会从项数为0  1  开始加起
        int first = 0;
        int second = 1;
        for (int i = 0; i < n - 1; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(fib1(30));
        System.out.println(fib2(30));
    }
}
