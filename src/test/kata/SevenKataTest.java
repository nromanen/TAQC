package test.kata;

import kata.SevenKata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SevenKataTest {

    public static final double EPS = 0.001;

    // @ParameterizedTest

    //@MethodSource("newAvg") //до чого прив'язувати ім'я
    @Test

    public void lookingForABenefactorTest() {
        double array1[] = new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0};
        int int1 = 90;
        long actual = new kata.impl.SerhiiZdoima.SevenKataImpl().newAvg(array1, int1);
        long expected = 628;
        assertEquals(expected, actual);

        array1[6] = 15.0;
        int1 = 30;
        expected = 149;
        actual = new kata.impl.SerhiiZdoima.SevenKataImpl().newAvg(array1, int1); //newAv from array1 and int1 then the result == 628
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("newAvgData")
    public void newAvgTest(double[] arrData, int intData, long expected, SevenKata sevenKata) {
        long actual = sevenKata.newAvg(arrData, intData); //newAv from array1 and int1 then the result == 628
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> newAvgData() {
        double[] arr1 = new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0};
        int val1Data1 = 90;
        int val2Data1 = 628;
        double[] arr2 = new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 15.0};
        int val1Data2 = 30;
        int val2Data2 = 149;
        return Stream.of(
                // Arguments.of(new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90, 628), // the test with parameters from the task
                // Arguments.of(new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 15.0}, 30, 149),
                Arguments.of(arr1, val1Data1, val2Data1,new kata.impl.SerhiiZdoima.SevenKataImpl()),
                Arguments.of(arr1, val1Data1, val2Data1,new kata.impl.AnastasiaZadolinna.SevenKataImpl()),
                Arguments.of(arr1, val1Data1, val2Data1,new kata.impl.YuriyShymkov.SevenKataImpl()),
                Arguments.of(arr1, val1Data1, val2Data1,new kata.impl.VolodimirD.SevenKataImpl()),
                Arguments.of(arr1, val1Data1, val2Data1,new kata.impl.NataliaZagoruiko.SevenKataImpl()),

                Arguments.of(arr2, val1Data2, val2Data2,new kata.impl.SerhiiZdoima.SevenKataImpl()),
                Arguments.of(arr2, val1Data2, val2Data2,new kata.impl.AnastasiaZadolinna.SevenKataImpl()),
                Arguments.of(arr2, val1Data2, val2Data2,new kata.impl.YuriyShymkov.SevenKataImpl()),
                Arguments.of(arr2, val1Data2, val2Data2,new kata.impl.VolodimirD.SevenKataImpl()),
                Arguments.of(arr2, val1Data2, val2Data2,new kata.impl.NataliaZagoruiko.SevenKataImpl())

        );
    }

    @Test
    void testExpectedException() {

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new kata.impl.SerhiiZdoima.SevenKataImpl().newAvg (new double[]{2, -5}, 2);
        });

        Assertions.assertEquals("some message", exception.getMessage());
    }
}
