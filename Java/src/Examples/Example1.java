package Examples;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        // Before Version 5
        Object instance1 = new String("Sample Data");
        System.out.println(instance1);

        System.out.println("After Type Conversion To String");
        String instance2 = (String) instance1;
        System.out.println(instance2);

        instance1 = 1212;
        System.out.println(instance1);
        System.out.println("After Type Conversion To Integer");
        Integer instance3 = (Integer) instance1;
        System.out.println(instance2);

        instance1 = new int[]{1,2,3,4,5};
        System.out.println(instance1);
        System.out.println("After Type Conversion To Integer");
        int[] instance4 = (int[]) instance1;
        System.out.println(instance4);
        System.out.println(Arrays.toString(instance4));



    }
}