/**
 * Created by AlexAbril on 8/3/17.
 */
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");


        int a;
        a = 5;
        int b = a++;


        int c = 11 % 4;

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);


        double d1 = 45.5;
        double d2 = 5.2;
        double d3 = d1 / d2;

        System.out.println(d3);

        Float f1 = new Double(d3).floatValue();
        f1 = new Integer(b).floatValue();

        System.out.println(f1);

        Integer il = f1.intValue();

        System.out.println(il);

    }
}
