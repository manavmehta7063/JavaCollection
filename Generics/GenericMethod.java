import java.util.*;
public class GenericMethod {
    public static void main(String[] args) {
        Integer[] i = {1,2,3,4,5};
        String[] s = {"London","Paris","New York"};

        GenericMethod.print(i);
        GenericMethod.print(s);
    }

    // Generic type Method
    public static <E> void print(E[] list){
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]+" ");
        System.out.println();
    }

    // Generic bounded type method
    // ! A generic type can be specified as a subtype of another type. 
    // ! Such a generic type is called bounded
    
}
