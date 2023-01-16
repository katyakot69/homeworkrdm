package ru.netology.radio;


public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }


    public void setCurrentStation(int selectStation) {
        if (selectStation < 0 || selectStation > 9) {
            return;
        }
        this.currentStation = selectStation;
    }

    public void setNextStation() {
        if (currentStation == 9) {
            this.currentStation = 0;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void setPrevStation() {
        if (currentStation == 0) {
            this.currentStation = 9;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setVolumeUp() {
        if (currentVolume == 10) {
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public void setVolumeDown() {
        if (currentVolume == 0) {
            return;
        }
        this.currentVolume = currentVolume - 1;
    }

}


