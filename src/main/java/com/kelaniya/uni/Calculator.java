package com.kelaniya.uni;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2, result;
         try {
             List<Double> numArr = new ArrayList<Double>();
             File file = new File(".\\src\\numbers.txt");
             Scanner input = new Scanner(file);

             while (input.hasNextLine()){
                 String data = input.nextLine();
                 String[] numbers = data.split("\\s");
                 numArr.add(Double.parseDouble(numbers[0]));
                 numArr.add(Double.parseDouble(numbers[1]));
             }

             input.close();

             num1 = numArr.get(0);
             num2 = numArr.get(1);

             switch (args[0]){
                 case "add":
                     result = num1 + num2;
                     System.out.println(num1 + " + " + num2 + " = " + result);
                     break;

                 case "sub":
                     result = num1 - num2;
                     System.out.println(num1 + " - " + num2 + " = " + result);
                     break;

                 case "mul":
                     result = num1 * num2;
                     System.out.println(num1 + " * " + num2 + " = " + result);
                     break;

                 case "div":
                     result = num1 / num2;
                     System.out.println(num1 + " / " + num2 + " = " + result);
                     break;

                 default:
                     System.out.println("Invalid operator!");
                     break;
             }
         } catch (FileNotFoundException e) {
             System.out.println("An error occurred");
             e.printStackTrace();
         }
    }
}
