package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio station = new Radio();
    Radio station1 = new Radio(5, 3);
    Radio station2 = new Radio(5, 4);
    Radio station3 = new Radio(5, 5);
    Radio station4 = new Radio(5, -1);
    Radio station5 = new Radio(5, 0);
    Radio station6 = new Radio(5, 1);
    Radio volume = new Radio();
    Radio volume1 = new Radio(99);
    Radio volume2 = new Radio(100);
    Radio volume3 = new Radio(101);
    Radio volume4 = new Radio(-1);
    Radio volume5 = new Radio(0);
    Radio volume6 = new Radio(1);

    @Test
    public void nextRadioNumber() {

        station.nextRadioNumber();
        int actual = station.getCurrentRadioNumber();
        assertEquals(6, actual);

        station1.nextRadioNumber();
        int actual1 = station1.getCurrentRadioNumber();
        assertEquals(4, actual1);

        station2.nextRadioNumber();
        int actual2 = station2.getCurrentRadioNumber();
        assertEquals(0, actual2);

        station3.nextRadioNumber();
        int actual3 = station3.getCurrentRadioNumber();
        assertEquals(0, actual3);

    }

    @Test
    public void prevRadioNumber() {

        station.prevRadioNumber();
        int actual = station.getCurrentRadioNumber();
        assertEquals(4, actual);

        station4.prevRadioNumber();
        int actual1 = station4.getCurrentRadioNumber();
        assertEquals(4, actual1);

        station5.prevRadioNumber();
        int actual2 = station5.getCurrentRadioNumber();
        assertEquals(4, actual2);

        station6.prevRadioNumber();
        int actual3 = station6.getCurrentRadioNumber();
        assertEquals(0, actual3);
    }

    @Test
    public void increaseVolume() {

        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        assertEquals(78, actual);

        volume1.increaseVolume();
        int actual1 = volume1.getCurrentVolume();
        assertEquals(100, actual1);

        volume2.increaseVolume();
        int actual2 = volume2.getCurrentVolume();
        assertEquals(100, actual2);

        volume3.increaseVolume();
        int actual3 = volume3.getCurrentVolume();
        assertEquals(100, actual3);
    }

    @Test
    public void decreaseVolume() {

        volume.decreaseVolume();
        int actual = volume.getCurrentVolume();
        assertEquals(76, actual);

        volume4.decreaseVolume();
        int actual1 = volume4.getCurrentVolume();
        assertEquals(0, actual1);

        volume5.decreaseVolume();
        int actual2 = volume5.getCurrentVolume();
        assertEquals(0, actual2);

        volume6.decreaseVolume();
        int actual3 = volume6.getCurrentVolume();
        assertEquals(0, actual3);
    }
}