public class Radio {

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <0) {
            return;
        }
        if (newCurrentVolume >100) {
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
        if (currentVolume < 100) {
            currentVolume++;
        }
       else{
            currentVolume = 100;
        }
    }


    public void changeVolumeDecrease() { //изменение звука --
        if (currentVolume > 0) {
            currentVolume--;
        }
        else{
            currentVolume = 0;
        }
    }


//  Station

    public void changeStationIncrease() {// изменение станций в ++
        if (currentStation <9) {
            currentStation++;
        }
        if (currentStation >= 9) {
            currentStation = 0;
        }
    }

    public void changeStationDecrease() {
        if (currentStation > 0) {
            currentStation--;
        }
        if (currentStation <= 0) {
            currentStation = 9;
        }
    }
}