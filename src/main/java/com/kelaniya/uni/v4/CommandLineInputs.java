package com.kelaniya.uni.v4;

public class CommandLineInputs {

    private final String[] args;

    public CommandLineInputs(String[] arguments){
        this.args = arguments;
    }

    public String getOperator(){
        if(args.length == 0){
            System.out.println("Please provide the operation as an argument");
            return "";
        }

        String operation = args[0];

        if(!( operation.equals("add") || operation.equals("sub") || operation.equals("mul")
                || operation.equals("div"))
        ){
            System.out.println("Please proivde add, sub , mul , div as operator argument");
            return "";
        }

        return operation;
    }
}
