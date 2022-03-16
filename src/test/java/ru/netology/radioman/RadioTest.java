package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentStationBelowLimit() {
        Radio rad = new Radio();
        rad.setCurrentStation(-5);

        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationAboveLimit() {
        Radio rad = new Radio();
        rad.setCurrentStation(12);

        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setNextStationAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setNextStationBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.previousStation();

        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);

        rad.nextStation();

        int expected = 6;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.previousStation();

        int expected = 7;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeBelowLimit() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-100);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolumeAboveLimit() {
        Radio rad = new Radio();
        rad.setCurrentVolume(150);

        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckHigherVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckLowerVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(2);

        rad.increaseVolume();

        int expected = 3;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(6);

        rad.decreaseVolume();

        int expected = 5;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
}