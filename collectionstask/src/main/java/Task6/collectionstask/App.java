package Task6.collectionstask;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<Integer>(10);
        for(int i=0;i<10;i++)
        	l.add(sc.nextInt());
        System.out.println("current list is" +l);
        System.out.println("which element do you want to fetch???");
        System.out.println(l.get(sc.nextInt()));
        System.out.println("which element do you want to remove???");
        l.remove(sc.nextInt());
        System.out.println("current list after removing element" +l);
        sc.close();
    }
}
