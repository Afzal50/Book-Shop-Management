package main;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Bill extends CustomerName{
    public static String getRandomNumberString() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%06d", number);
    }
    String billNo;
    String date;
    public void getBill(String name){
        billNo = getRandomNumberString();
        Date d = new Date();
        date = d.toString();
        System.out.println('\n');
        System.out.println("-------------------------------------------------------");
        System.out.println("|  Bill No: "+billNo+" "+date+'\n');
        System.out.println("|  Customers Name: "+ name+'\n');
    }
}