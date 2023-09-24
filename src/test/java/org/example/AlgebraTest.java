package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgebraTest {

    @Test
    public void testSquareFormula(){
        Algebra alg = new Algebra();

        int square_of_sum = alg.square_of_sum(4, 5);
        assertEquals(81, square_of_sum, "(4+5)^2 should be 81.");
    }
}
