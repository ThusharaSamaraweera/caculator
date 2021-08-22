package com.kelaniya.uni.v2;

public class Main {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Please provide the operation as an argument");
            return;
        }
        String operation = args[0];
        if(!( operation.equals("add") || operation.equals("sub") || operation.equals("mul") || operation.equals("div"))){
            System.out.println("Please proivde add, sub , mul , div as operator argument");
            return;
        }
        System.out.println(args[0]);
    }
}
