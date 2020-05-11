package org.codingdojo.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgoTest {
    @Test
    void should_return_Top_k() {
        Algo algo = new Algo();
        assertEquals(5,
                algo.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        assertEquals(5,
                algo.findKthLargestHoare(new int[]{3, 2, 1, 5, 6, 4}, 2));
        assertEquals(4,
                algo.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
        assertEquals(4,
                algo.findKthLargestHoare(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}
