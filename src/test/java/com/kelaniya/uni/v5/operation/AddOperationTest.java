package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AddOperationTest {

    // test cases
    // positive number + positive number => positive answer
    // Negative number + positive number => negative answer
    // positive number + Negative number => correct answer

    @Test
    public void should_add_positive_values(){
        AddOperation addOperation = new AddOperation();
        Double  result = addOperation.execute(new Double[]{5.0, 6.0});

        assertThat(result, is(11.0));
    }

    @Test
    public void should_add_zero_values(){
        AddOperation addOperation = new AddOperation();
        Double  result = addOperation.execute(new Double[]{0.0, 0.0});

        assertThat(result, is(0.0));
    }

    @Test
    public void should_add_negative_values(){
        AddOperation addOperation = new AddOperation();
        Double  result = addOperation.execute(new Double[]{-4.0, -5.0});

        assertThat(result, is(-9.0));
    }
}