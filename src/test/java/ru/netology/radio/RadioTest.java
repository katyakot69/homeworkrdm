package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class RadioTest {
        @ParameterizedTest
        @CsvSource({

                "1, -7, 0",
                "2, 15, 0",
                "1, -1, 0",
                "2, 0, 0",
                "3, 1, 1",
                "4, 8, 8",
                "5, 9, 9",
                "6, 10, 0",
        })
      public void setSelectStation(String nameTest, int inputCurrentStation, int expectedStation) {
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
        public void setNextStation(String nameTest, int oldCurrentStation, int expectedStation) {
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
        public void setPrevCurrentStation(String nameTest, int oldCurrentStation, int expectedStation) {
            Radio radio = new Radio();
            radio.setCurrentStation(oldCurrentStation);
            radio.setPrevStation();
            Assertions.assertEquals(radio.getCurrentStation(), expectedStation);
        }

        @ParameterizedTest
        @CsvSource({

                "1, 0, 1",
                "2, 1, 2",
                "3, 9, 10",
                "4, 10, 10",
        })
        public void setVolumeUp(String nameTest, int oldCurrentVolume, int expectedVolume) {
            Radio radio = new Radio();
            radio.setCurrentVolume(oldCurrentVolume);
            radio.setVolumeUp();
            Assertions.assertEquals(radio.getCurrentVolume(), expectedVolume);
        }

        @ParameterizedTest
        @CsvSource({

                "1, 0, 0",
                "2, 1, 0",
                "3, 9, 8",
                "4, 10, 9",
        })
        public void setVolumeDown(String nameTest, int oldCurrentVolume, int expectedVolume) {
            Radio radio = new Radio();
            radio.setCurrentVolume(oldCurrentVolume);
            radio.setVolumeDown();
            Assertions.assertEquals(radio.getCurrentVolume(), expectedVolume);
        }
    }