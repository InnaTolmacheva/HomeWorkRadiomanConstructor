package ru.netology.domain;

public class Radio {
    private int currentRadioNumber = 5;
    private int maxRadioNumber = 9;
    private int minRadioNumber = 0;
    private int currentVolume = 77;
    private int maxVolume = 100;
    private int minVolume = 0;

    public int getCurrentRadioNumber() {
        return currentRadioNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public Radio() {
    }

    public Radio(int countRadioNumber, int currentRadioNumber) {
        this.currentRadioNumber = currentRadioNumber;
        this.maxRadioNumber = minRadioNumber + countRadioNumber - 1;
    }

    public void nextRadioNumber() {
        if (currentRadioNumber < maxRadioNumber) {
            currentRadioNumber++;
        } else
            currentRadioNumber = minRadioNumber;
    }

    public void prevRadioNumber() {
        if (currentRadioNumber > minRadioNumber) {
            currentRadioNumber--;
        } else
            currentRadioNumber = maxRadioNumber;
    }

    public Radio(int currentVolume) {
        this.currentVolume = currentVolume;
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
