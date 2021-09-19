package com.kelaniya.uni.v3;

import com.kelaniya.uni.v3.operation.AddOperation;
import com.kelaniya.uni.v3.operation.MulOperation;
import com.kelaniya.uni.v3.operation.SubOperation;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operation  = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumber();
        Double num1 = numbers[0];
        Double num2 = numbers[1];

        double result = 0;

        if(operation.equals("add")){
            AddOperation addOperation = new AddOperation();
            result = addOperation.execute(numbers);
        }else if (operation.equals("sub")){
            SubOperation subOperation = new SubOperation();
            result = subOperation.execute(numbers);
        }else if (operation.equals("mul")){
            MulOperation mulOperation = new MulOperation();
            result = mulOperation.execute(numbers);
        }else if (operation.equals("div")){
            DivOperation divOperation = new DivOperation();
            result = divOperation.execute(numbers);
        }

        System.out.println("The result is " + result);
    }
}
