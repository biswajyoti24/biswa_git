package practice;

public class Test

{

    public static void main(String [] args)

    {

        int i = 10;

        MyClass obj = new MyClass();

        obj.j = 25;

        method1(i,obj);

        System.out.println("i="+i+" obj.j="+obj.j);

    }

    public static void method1(int i,MyClass obj)

    {

        i=5;

        obj.j=20;

    }

}

class MyClass

{

    public int j;

    MyClass()

    {

        j = 0;

    }

}

