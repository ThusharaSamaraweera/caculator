package com.kelaniya.uni.v5;

import com.kelaniya.uni.v5.UI.CmdLineUI;
import com.kelaniya.uni.v5.UI.UI;
import com.kelaniya.uni.v5.input.CommandLineInputs;
import com.kelaniya.uni.v5.operation.Operation;
import com.kelaniya.uni.v5.operation.OperationFactory;
import com.kelaniya.uni.v5.repository.NumberRepository;

import java.io.IOException;

public class CalculatorApp {
    private final CommandLineInputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;

    public CalculatorApp(CommandLineInputs inputs, NumberRepository numberRepository,
                         OperationFactory operationFactory, UI ui) {

        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute() throws IOException {
        String operation  = inputs.getOperator();

        Double[] numbers = numberRepository.getNumbers();

        Operation operation1 = operationFactory.getInstance(operation);

        Double result = operation1.execute(numbers);
        ui.showMessage("The result is " + result);
    }
}
