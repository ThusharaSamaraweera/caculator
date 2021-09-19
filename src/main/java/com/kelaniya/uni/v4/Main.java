package com.kelaniya.uni.v4;

import com.kelaniya.uni.v4.operation.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operation  = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumber();

        OperationFactory operationFactory = new OperationFactory();
        Operation operation1 = operationFactory.getInstance(operation);

        Double result = operation1.execute(numbers);

        UI ui = new UI();
        ui.showMessage("The result is " + result);
    }
}
