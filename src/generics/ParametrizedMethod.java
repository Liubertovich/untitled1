package generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(110);
        al1.add(120);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Privet");
        al2.add("Vonuchiy");
        al2.add("Drug");
        String b = GenMethod.getSecondElement(al2);
        System.out.println(b);
    }

}
class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }

}