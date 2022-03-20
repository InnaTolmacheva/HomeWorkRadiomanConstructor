package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void nextRadioNumber() {
        Radio station0 = new Radio();
        station0.setCurrentRadioNumber(3);
        station0.nextRadioNumber();
        int actual0 = station0.getCurrentRadioNumber();
        assertEquals(4, actual0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/nextRadioNumber.csv")
    public void nextRadioNumber(int count, int current, int expected) {
        Radio station = new Radio(count);
        station.setCurrentRadioNumber(current);
        station.nextRadioNumber();
        int actual = station.getCurrentRadioNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioNumber() {
        Radio station0 = new Radio();
        station0.setCurrentRadioNumber(3);
        station0.prevRadioNumber();
        int actual0 = station0.getCurrentRadioNumber();
        assertEquals(2, actual0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/prevRadioNumber.csv")
    public void prevRadioNumber(int count, int current, int expected) {

        Radio station = new Radio(count);
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