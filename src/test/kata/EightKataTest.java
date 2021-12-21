package test.kata;

import kata.EightKata;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EightKataTest {

    public static final double EPS = 0.00001;

    @ParameterizedTest
    @MethodSource("provideImpl")
    public void getVolumeOfCuboidTest(EightKata eightKata) {
        double expected = 40.157208;
        double length = 2.34;
        double actual = eightKata.getVolumeOfCuboid(length, 3.78, 4.54);
        assertEquals(expected, actual, EPS, "Wrong result for parameters " + length + ", " + 3 + ", " + 4);
    }

    private static Stream<Arguments> provideImpl() {
        return Stream.of(
                Arguments.of(new kata.impl.VolodimirD.EightKataImpl()),
                Arguments.of(new kata.impl.AnastasiaZadolinna.EightKataImpl()),
                Arguments.of(new kata.impl.DmytroHursrkyi.EightKataImpl())
        );
    }

    @ParameterizedTest
    @MethodSource("dataSourceForTwoDecimalPlaces")
    public void twoDecimalPlacesValidTest(double input, double expected) {
        double actual = new kata.impl.AnastasiaZadolinna.EightKataImpl().twoDecimalPlaces(input);
        assertEquals(expected, actual, "Wrong result for parameters " + input);
    }

    private static Stream<Arguments> dataSourceForTwoDecimalPlaces() {
        return Stream.of(
                Arguments.of(2.5, 2.50),
                Arguments.of(3.67809, 3.68),
                Arguments.of(2.491, 2.49),
                Arguments.of(2.495, 2.50)
        );
    }
}
