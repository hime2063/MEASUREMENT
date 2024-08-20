
import models.Measurement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("enter the value: ");
        input = sc.nextInt();
        Measurement conversion = new Measurement(input);
        System.out.println("meters to cm : " + conversion.getcm());
        System.out.println("meters to km: " + conversion.getkm());
        System.out.println("meters to mm: " + conversion.getmm());
        System.out.println("meters to dm: " + conversion.getdm());
    }
}
