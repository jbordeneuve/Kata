package com.zenika.kata;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SandPileTest {

    @ParameterizedTest(name = "{index} => source={1}, expected={2}")
    @MethodSource("sandPileParameter")
    void sandPile(int nbIteration, int[][] source, int[][] expected) {

        assertArrayEquals(expected, SandPile.addSand(source, nbIteration));
    }

    private static Stream<Arguments> sandPileParameter() {

        return Stream.of(

                // first sprint
                arguments(1,
                        new int[][]{
                                {1, 0, 2},
                                {2, 3, 1},
                                {1, 2, 1}},
                        new int[][]{
                                {1, 1, 2},
                                {3, 0, 2},
                                {1, 3, 1}}
                ),

                // 2nd sprint
                arguments(5,
                        new int[][]{
                                {1, 0, 2},
                                {2, 3, 1},
                                {1, 2, 1}},
                        new int[][]{
                                {2, 2, 2},
                                {0, 2, 3},
                                {3, 0, 2}}
                ));
    }
}