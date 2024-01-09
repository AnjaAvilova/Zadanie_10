import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test // проверка значения
    public void ShouldVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test //Проверка верхнего граничного значения
    public void shouldNotSetVolumeAboutMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Проверка нижнего граничного значения
    public void shouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test // Проверка верхнего граничного в пределах увеличения звука
    public void shouldChangeVolumeToIncrease() { //изменение звука в ++
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.changeVolumeIncrease();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //Граничное значение мах
    public void shouldChangeVolumeMax() { //изменение звука в ++
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.changeVolumeIncrease();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test// Проверка нижнего граничного значения при ++
    public void shouldChangeVolumeFromMinIncrease() { //изменение звука из мин в ++
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.changeVolumeIncrease();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test// Проверка нижнего граничного значения при ++
    public void shouldChangeVolumeFromIncrease() { //изменение звука из мин в ++
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.changeVolumeIncrease();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeVolumeFromMinDecrease() { //изменение звука в --
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.changeVolumeDecrease();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeVolumeFromManDecrease() { //изменение звука в --
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.changeVolumeDecrease();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeVolumeMinDecrease() { //изменение звука в --
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.changeVolumeDecrease();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    // Станция
    @Test
    public void shouldStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeStationIncreaseNextMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.changeStationIncrease();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulChangeStationIncreaseNexMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.changeStationIncrease();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeStationDecreasePrevMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.changeStationDecrease();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeStationDecreasePrevMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.changeStationDecrease();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}

