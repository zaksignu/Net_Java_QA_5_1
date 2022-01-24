package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource( value = {
            "'maxRange', 100 , 9900, 90",
            "'outOfRange', 10 , 20, 0",
            "'withStraightOrder', 100 , 200, 5",
            "'withReversedOrder', 200 , 100, 5",
            "'githubExample', 200 , 300, 3"})
    void shouldWork(String testName, int aValue, int bValue, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculateSquare(aValue, bValue);
        assertEquals(expected, actual);
    }
}
