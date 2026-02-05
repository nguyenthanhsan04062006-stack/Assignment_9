package Lec11_ExceptionHandling;

import Lec11_ExceptionHandling.BasicException.DivideExample;
import Lec11_ExceptionHandling.MultipleCatch.MultipleCatchExample;
import Lec11_ExceptionHandling.FinallyBlock.FinallyExample;
import Lec11_ExceptionHandling.ThrowExample.AgeChecker;
import Lec11_ExceptionHandling.ThrowsExample.ThrowsExample;

public class Main {
    public static void main(String[] args) {

        
        DivideExample.divide(10, 0);

        
        int[] arr = {1, 2, 3};
        MultipleCatchExample.test(arr, 5);

        
        FinallyExample.test();

        
        try {
            AgeChecker.checkAge(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        try {
            ThrowsExample.readFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
