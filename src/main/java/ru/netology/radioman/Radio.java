package ru.netology.radioman;

public class Radio {

    private int currentVolume;
    private int currentStation;
    private int amountOfStations = 10;
    private int minStation = 0;
    private int maxStation = amountOfStations - 1;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int amountOfStations) {
        this.amountOfStations = amountOfStations;
        this.maxStation = amountOfStations - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < minStation) {
            newStation = minStation;
        }
        if (newStation > maxStation) {
            newStation = maxStation;
        }
        currentStation = newStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else currentStation = minStation;
    }

    public void previousStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else currentStation = maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < minVolume) {
            newVolume = minVolume;
        }
        if (newVolume > maxVolume) {
            newVolume = maxVolume;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else currentVolume = getCurrentVolume();
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else currentVolume = getCurrentVolume();
    }
}