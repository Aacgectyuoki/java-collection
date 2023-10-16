/**
 * Author: Shahbaz Ali
 * Email: shahbazkhaniq@gmail.com
 * Date: 10/16/2023$
 * Time: 5:58 AM$
 * Project Name: java-collection$
 */


package com.collection.javacollection.lambda;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {

    private int id;
    private String name;
    private int pages;
}
