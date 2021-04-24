package org.example;

import java.sql.SQLOutput;

public class Hello {
    public static void main(String[] args){
//        String str = "Language is very important";
//        String str1= "language ";
//        //char ch = str.charAt(5);
//        //boolean result = str.contains("g");
//        System.out.println(str.charAt(5));
//        System.out.println(str.contains("n"));
//        System.out.println(str.startsWith("L"));
//        System.out.println(str.endsWith("age"));
//        System.out.println(str.startsWith("u",5));
//        System.out.println(str.equalsIgnoreCase(str1));
//        System.out.println(str.indexOf("a"));
//        System.out.println(str.replace("n","w"));
//        System.out.println((str.split(" ")));
//

StringBuffer stringbuffer = new StringBuffer("Hello");
stringbuffer.append("World");
stringbuffer.insert(1,"k");
stringbuffer.reverse();
        System.out.println(stringbuffer);
StringBuilder stringbuilder = new StringBuilder("Java");
        stringbuilder.append("Program");
        System.out.println(stringbuilder);
    }

 }
