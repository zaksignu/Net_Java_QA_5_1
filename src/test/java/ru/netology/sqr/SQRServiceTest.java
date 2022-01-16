package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource( value = {
            "'withStraightOrder', 100 , 200, 4",
            "'withReversedOrder', 200 , 100, 4",
            "'githubExample', 200 , 300, 3"})
    void shouldWork(String testName, int aValue, int bValue, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculateSquare(aValue, bValue);
        assertEquals(expected, actual);
    }
}
