package ru.netology.domain;


public class Radio {
    private int count = 10;
    private int currentRadioNumber;
    private int maxRadioNumber = 9;
    private int minRadioNumber = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public int getCurrentRadioNumber() {
        return currentRadioNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioNumber(int newCurrentRadioNumber) {
        if (newCurrentRadioNumber < minRadioNumber) {
            return;
        }
        if (newCurrentRadioNumber > maxRadioNumber) {
            return;
        }
        currentRadioNumber = newCurrentRadioNumber;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public Radio() {
    }

    public Radio(int count) {
        this.count = count;
        this.maxRadioNumber = minRadioNumber + count - 1;

    }

    public void nextRadioNumber() {
        if (currentRadioNumber < maxRadioNumber) {
            currentRadioNumber++;
        } else
            currentRadioNumber = minRadioNumber;
    }

    public int prevRadioNumber() {
        if (currentRadioNumber > minRadioNumber) {
            return currentRadioNumber--;

        } else
            return currentRadioNumber = maxRadioNumber;

    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else
            currentVolume = maxVolume;
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else
            currentVolume = minVolume;
    }
}
