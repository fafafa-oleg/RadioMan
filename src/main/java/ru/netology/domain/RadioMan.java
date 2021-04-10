package ru.netology.domain;

public class RadioMan {
    private int currentNumberstation;
    private int minNumberstation = 0;
    private int maxNumberstation = 10;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentNumberstation() {
        return currentNumberstation;
    }

    public void next(int currentNumberstation) {
        if (currentNumberstation != maxNumberstation) {
            this.currentNumberstation = currentNumberstation;
            this.currentNumberstation++;
        } else {
            this.currentNumberstation = minNumberstation;
        }
    }

    public void prev(int currentNumberstation) {
        if (currentNumberstation != minNumberstation) {
            this.currentNumberstation = currentNumberstation;
            this.currentNumberstation--;
        } else {
            this.currentNumberstation = maxNumberstation;
        }
    }

    public void EnverRadioStation(int currentNumberstation) {
        if (currentNumberstation != minNumberstation & currentNumberstation != maxNumberstation) {
            this.currentNumberstation = currentNumberstation;
        } else if (currentNumberstation == maxNumberstation) {
            this.currentNumberstation = minNumberstation;
        } else {
            this.currentNumberstation = maxNumberstation;
        }
    }


    public void setMaxNumberstation(int maxNumberstation) {
        this.maxNumberstation = maxNumberstation;
    }

    public void nextVolume(int currentVolume) {
        if (currentVolume != maxVolume) {
            this.currentVolume = currentVolume;
            this.currentVolume++;
        } else {
            this.currentVolume = maxVolume;
        }
    }

    public void prevVolume(int currentVolume) {
        if (currentVolume != minVolume) {
            this.currentVolume = currentVolume;
            this.currentVolume--;
        } else {
            this.currentVolume = minVolume;
        }
    }

}
