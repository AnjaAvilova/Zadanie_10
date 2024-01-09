public class Radio {

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {

        currentStation = newStation;
    }


    public void changeVolumeIncrease() { //изменение звука++
        if (currentVolume == 100) {
            currentVolume = 100;
        }
        if (currentVolume < 100 && currentVolume >= 0) {
            currentVolume++;
        }
    }


    public void changeVolumeDecrease() { //изменение звука --
        if (currentVolume == 0) {
            currentVolume = 0;
        }
        if (currentVolume > 0 && currentVolume <= 100) {
            currentVolume--;
        }
    }


//  Station

    public void changeStationIncrease() {// изменение станций в ++
        if (currentStation >= 0 && currentStation <9) {
            currentStation++;
        }
        if (currentStation >= 9) {
            currentStation = 0;
        }
    }

    public void changeStationDecrease() {
        if (currentStation <= 9 && currentStation > 0) {
            currentStation--;
        }
        if (currentStation <= 0) {
            currentStation = 9;
        }
    }
}