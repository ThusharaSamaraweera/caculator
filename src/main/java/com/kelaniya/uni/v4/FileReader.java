package com.kelaniya.uni.v4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    public Double[] getNumber() throws IOException {
        List<String> numbersStrs =  Files.readAllLines(Paths.get("src/numbers.txt"));

        double num1 = Double.parseDouble(numbersStrs.get(0));
        double num2 = Double.parseDouble(numbersStrs.get(1));

        return new Double[]{num1, num2};
    }

}
