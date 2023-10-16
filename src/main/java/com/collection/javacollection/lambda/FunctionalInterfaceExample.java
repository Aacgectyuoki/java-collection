/**
 * Author: Shahbaz Ali
 * Email: shahbazkhaniq@gmail.com
 * Date: 10/16/2023$
 * Time: 5:31 AM$
 * Project Name: java-collection$
 */


package com.collection.javacollection.lambda;

@FunctionalInterface
public interface FunctionalInterfaceExample  {


    void method1();

    default void method2() {

        System.out.println("Method 2");
    }

    default void method3() {
        System.out.println("Method 3");
    }

    default void method4() {
        System.out.println("Method 4");
    }


}
