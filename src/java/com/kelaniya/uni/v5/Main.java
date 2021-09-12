package com.kelaniya.uni.v5;

import com.kelaniya.uni.v5.UI.CmdLineUI;
import com.kelaniya.uni.v5.UI.UI;
import com.kelaniya.uni.v5.input.CommandLineInputs;
import com.kelaniya.uni.v5.operation.OperationFactory;
import com.kelaniya.uni.v5.repository.FileNumberRepository;
import com.kelaniya.uni.v5.repository.NumberRepository;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs = new CommandLineInputs(args);

        NumberRepository numberRepository = new FileNumberRepository();

        OperationFactory operationFactory = new OperationFactory();

        UI ui = new CmdLineUI();

        CalculatorApp app = new CalculatorApp(inputs, numberRepository, operationFactory, ui);
        app.execute();
    }
}
