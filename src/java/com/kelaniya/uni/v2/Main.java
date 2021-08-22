package com.kelaniya.uni.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Please provide the operation as an argument");
            return;
        }

        String operation = args[0];

        if(!( operation.equals("add") || operation.equals("sub") || operation.equals("mul")
                || operation.equals("div"))
        ){
            System.out.println("Please proivde add, sub , mul , div as operator argument");
            return;
        }

        List<String> numbersStrs =  Files.readAllLines(Paths.get("src/numbers.txt"));

        double num1 = Double.parseDouble(numbersStrs.get(0));
        double num2 = Double.parseDouble(numbersStrs.get(1));

        double result = 0;

        if(operation.equals("add")){
            result = num1 + num2;
        }else if (operation.equals("sub")){
            result = num1 - num2;
        }else if (operation.equals("mul")){
            result = num1 * num2;
        }else if (operation.equals("div")){
            result = num1 / num2;
        }

        System.out.println("The result is " + result);
    }
}
