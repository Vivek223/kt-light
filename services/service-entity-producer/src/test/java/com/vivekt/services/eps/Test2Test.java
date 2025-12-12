package com.vivekt.services.eps;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test2Test {

    public static void main(String[] args) {
        System.out.println("test coming soon..");
    }

    @Test
    void test1(){
        // Arrange and Act

        //Assert
        Assertions.assertThat(1).isBetween(0,2);
    }
}
