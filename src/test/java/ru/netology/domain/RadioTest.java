package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/nextRadioNumber.csv")
    public void nextRadioNumber(int current, int expected) {
        Radio station = new Radio();
        station.setCurrentRadioNumber(current);
        station.nextRadioNumber();
        int actual = station.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/prevRadioNumber.csv")
    public void prevRadioNumber(int current, int expected) {
        Radio station = new Radio();
        station.setCurrentRadioNumber(current);
        station.prevRadioNumber();
        int actual = station.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/increaseVolume.csv")
    public void increaseVolume(int current, int expected) {
        Radio volume = new Radio();
        volume.setCurrentVolume(current);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/decreaseVolume.csv")
    public void decreaseVolume(int current, int expected) {
        Radio volume = new Radio();
        volume.setCurrentVolume(current);
        volume.decreaseVolume();
        int actual = volume.getCurrentVolume();
        assertEquals(expected, actual);
    }

}