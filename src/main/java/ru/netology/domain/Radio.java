package ru.netology.domain;

public class Radio {
    public int currentRadioNumber;
    public int currentVolume;

    public int getCurrentRadioNumber() {
        return currentRadioNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioNumber(int newCurrentRadioNumber) {
        if (newCurrentRadioNumber < 0) {
            return;
        }
        if (newCurrentRadioNumber > 9) {
            return;
        }
        currentRadioNumber = newCurrentRadioNumber;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextRadioNumber() {
        if (currentRadioNumber < 9) {
            currentRadioNumber++;
        } else
            currentRadioNumber = 0;
    }

    public void prevRadioNumber() {
        if (currentRadioNumber > 0) {
            currentRadioNumber--;
        } else
            currentRadioNumber = 9;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
