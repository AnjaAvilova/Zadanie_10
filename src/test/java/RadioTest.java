import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    //звук

        @Test
        public void ShouldVolume() {
            Radio raid = new Radio();

            raid.setCurrentVolume(9);

            int expected = 9;
            int actual = raid.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldSetToMaxVolume() {
            Radio raid = new Radio();

            raid.toMaxVolume();

            int expected = 100;
            int actual = raid.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNotSetVolumeAboutMax() {
            Radio raid = new Radio();

            raid.setCurrentVolume(110);

            int expected = 0;
            int actual = raid.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNotSetVolumeBelowMin() {
            Radio raid = new Radio();

            raid.setCurrentVolume(-1);

            int expected = 0;
            int actual = raid.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldSetToMinVolume() {
            Radio raid = new Radio();
            raid.toMinVolume();

            int expected = 0;
            int actual = raid.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldRiseVolume() {
            Radio raid = new Radio();

            raid.setCurrentVolume(79);
            raid.riseVolume();

            int expected = 80;
            int actual = raid.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldDecreaseVolume() {
            Radio raid = new Radio();

            raid.setCurrentVolume(80);
            raid.decreaseVolume();

            int expected = 79;
            int actual = raid.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

//Станция

        @Test
        public void shouldQuantilyStation(){
            Radio raid = new Radio(15);
            Assertions.assertEquals(15, raid.getCurrentStation());
        }


        @Test
        public void shouldStation() {
            Radio raid = new Radio();

            raid.setCurrentStation(2);

            int expected = 2;
            int actual = raid.getCurrentStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldToMaxStation() {
            Radio raid = new Radio();

            raid.setCurrentStation(9);
            raid.toMaxStation();

            int expected = 9;
            int actual = raid.getCurrentStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldToMinStation() {
            Radio raid = new Radio();

            raid.setCurrentStation(0);
            raid.toMinStation();

            int expected = 0;
            int actual = raid.getCurrentStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldStationAboutMax() {
            Radio raid = new Radio();

            raid.setCurrentStation(10);

            int expected = 0;
            int actual = raid.getCurrentStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldStationBelowMin() {
            Radio raid = new Radio();

            raid.setCurrentStation(-1);


            int expected = 9;
            int actual = raid.getCurrentStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNextStation() {
            Radio raid = new Radio();

            raid.setCurrentStation(2);
            raid.nextStation();

            int expected = 3;
            int actual = raid.getCurrentStation();

            Assertions.assertEquals(expected,actual);
        }

        @Test
        public void shouldPrevStation() {
            Radio raid = new Radio();

            raid.setCurrentStation(5);
            raid.prevStation();

            int expected = 4;
            int actual = raid.getCurrentStation();

            Assertions.assertEquals(expected,actual);
        }
    }
