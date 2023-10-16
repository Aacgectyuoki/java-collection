/**
 * Author: Shahbaz Ali
 * Email: shahbazkhaniq@gmail.com
 * Date: 10/16/2023$
 * Time: 5:38 AM$
 * Project Name: java-collection$
 */


package com.collection.javacollection.lambda;


@FunctionalInterface
interface Calculator {
    //void switchOn();
//    void sum(int input);

    int subtract(int i1, int i2);
}

/*

Syntax:    Parameter         Expression         Body
			()                  ->              System.out.pritln("Lambda Syntax")
 */
public class CalculatorImpl {


    public static void main(String[] args) {

//        Calculator calculator = () -> System.out.println("Switch On");
//        calculator.switchOn();

//        Calculator calculator = (input) -> System.out.println("Sum " + input);
//        calculator.sum(10);

        Calculator calculator = (i1, i2) -> {

            if (i2 < i1) {
                throw new RuntimeException("Message");
            } else {
                return i2 - i1;
            }
        };
        System.out.println(calculator.subtract(8, 20));


    }

}
