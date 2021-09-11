package pkge;

 

import addition.Addition;
import division.Division;
import eveodd.EvenOdd;
import multiplication.Multiplication;
import subtraction.Subtraction;

 

public class MainClientSide
{
    public static void main(String args[])
    {
        Addition add = new Addition();
        int Result1 = add.showAdd(53, 91);
        System.out.println("Addition: " + Result1);
        
        Subtraction sub = new Subtraction();
        int Result2 = sub.showSub(10, 22);
        System.out.println("Subtraction: " + Result2);
        
        Multiplication prod = new Multiplication();
        int Result3 = prod.showProd(17, 9);
        System.out.println("Multiplication: " + Result3);
        
        Division div = new Division();
        int Result4 = div.showDiv(9, 3);
        System.out.println("Division: " + Result4);
        
        EvenOdd eo = new EvenOdd();
        eo.showEvenOdd(134);
    }
}