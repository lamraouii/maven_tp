package org.sonatype.mavenbook.simple;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        record Person (String name ,int age){}
        Person smail = new Person("ismail" ,21);
        
        System.out.println(smail.toString());
    }
}
