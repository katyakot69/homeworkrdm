package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    @ParameterizedTest
    @CsvSource({
            "1, -9, 0",
            "2, 25, 0",
            "32, 11, 0",
            "1, -1, 0",
            "2, 0, 0",
            "3, 1, 1",
            "4, 8, 8",
            "5, 9, 9",
            "6, 10, 0",
    })
    void setCurrentStation(String nameTest, int inputCurrentStation, int expectedStation) {
        Radio radio = new Radio();

        radio.setCurrentStation(inputCurrentStation);
        Assertions.assertEquals(radio.getCurrentStation(), expectedStation);
    }

    @ParameterizedTest
    @CsvSource({

            "1, 0, 1",
            "2, 1, 2",
            "3, 8, 9",
            "4, 9, 0",
    })
    void setNextStation(String nameTest, int oldCurrentStation, int expectedStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(oldCurrentStation);
        radio.setNextStation();
        Assertions.assertEquals(radio.getCurrentStation(), expectedStation);
    }

    @ParameterizedTest
    @CsvSource({

            "1, 0, 9",
            "2, 1, 0",
            "3, 8, 7",
            "4, 9, 8",
    })
    void setPrevCurrentStation(String nameTest, int oldCurrentStation, int expectedStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(oldCurrentStation);
        radio.setPrevStation();
        Assertions.assertEquals(radio.getCurrentStation(), expectedStation);
    }


    @ParameterizedTest
    @CsvSource({

            "1, 0, 1",
            "2, 1, 2",
            "3, 99, 100",
            "4, 100, 100",
    })
    void setVolumeUp(String nameTest, int oldCurrentVolume, int expectedVolume) {
        Radio radio = new Radio();
        radio.setCurrentVolume(oldCurrentVolume);
        radio.setVolumeUp();
        Assertions.assertEquals(radio.getCurrentVolume(), expectedVolume);
    }

    @ParameterizedTest
    @CsvSource({

            "1, 0, 0",
            "2, 1, 0",
            "3, 99, 98",
            "4, 100, 99",
    })
    void setVolumeDown(String nameTest, int oldCurrentVolume, int expectedVolume) {
        Radio radio = new Radio();
        radio.setCurrentVolume(oldCurrentVolume);
        radio.setVolumeDown();
        Assertions.assertEquals(radio.getCurrentVolume(), expectedVolume);
    }

}
