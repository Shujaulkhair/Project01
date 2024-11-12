package com.nit.main;
import static com.nit.sum.DuplicateRemove.removeElement;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a = 5;
        int b = 9;
        int c = a + b;
        System.out.println(c);
        int temp[] = {1,2,3,1,5,2,1,2};
        
        removeElement(temp);
        
    }
}
