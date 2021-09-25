package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;


public class OperationFactoryTest {

    //test cases
    // 1. if the operator is add -> should return an object of addOperation class
    @Test
    public void should_return_AddOperation_object_when_operator_is_add(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("add");

        // verity that the operation object is an instance of AddOperation class
        assertThat(operation, instanceOf(AddOperation.class));

    }

    // 2. if the operator is sub -> should return an object of subOperation class

    @Test
    public void should_return_SubOperation_object_when_operator_is_add(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("sub");

        // verity that the operation object is an instance of SubOperation class
        assertThat(operation, instanceOf(SubOperation.class));

    }
    // 3. if the operator is mal -> should return an object of malOperation class
    // 4. if the operator is div -> should return an object of divOperation class
}