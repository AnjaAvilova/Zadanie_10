public class Radio {
    //звук
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void toMaxVolume() {
        currentVolume = maxVolume;
    }

    public void toMinVolume() {
        currentVolume = minVolume;
    }

    public void riseVolume() {
        if (currentVolume <= maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume >= minVolume) {
            currentVolume--;
        }
    }

//станция

    private int currentStation = 10;
    private int maxStation = 9;
    private int minStation = 0;

    public Radio() {
    }
    public Radio(int quantilyStation){
        this.currentStation = quantilyStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation > maxStation) {
            newStation = minStation;
        }
        if (newStation < minStation) {
            newStation = maxStation;
        }
        currentStation = newStation;
    }

    public void toMaxStation() {
        currentStation = maxStation;
    }

    public void toMinStation() {
        currentStation = minStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation--;
        }
    }
}

