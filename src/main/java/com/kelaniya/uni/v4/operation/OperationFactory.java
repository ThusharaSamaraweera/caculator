package com.kelaniya.uni.v4.operation;

// Factory design pattern
public class OperationFactory {
    public Operation getInstance(String operation){
        Operation operation1 = null;
        if(operation.equals("add")){
            operation1 = new AddOperation();
        }else if (operation.equals("sub")){
            operation1 = new SubOperation();
        }else if (operation.equals("mul")){
            operation1 = new MulOperation();
        }else if (operation.equals("div")){
            operation1 = new DivOperation();
        }

        return operation1;
    }
}
