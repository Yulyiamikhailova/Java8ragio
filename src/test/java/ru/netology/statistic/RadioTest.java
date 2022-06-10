package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void findMax() {
        Radio radio = new Radio();
        radio.setCurrentVolumeMax(0);
        radio.currentVolumeMax();
        int actual = radio.getCurrentVolumeMax();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void findMin() {
        Radio radio = new Radio();
        radio.setCurrentVolumeMin(2);
        radio.currentVolumeMin();
        int actual = radio.getCurrentVolumeMin();
        int expected = 1;

        assertEquals(expected, actual);
    }




    @Test
    void findLessThanMax() {
        Radio radio = new Radio();
        radio.setVolumRange(11);

        int actual = radio.getVolumRange();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void findLessThanMin() {
        Radio radio = new Radio();
        radio.setVolumRange(-1);

        int actual = radio.getVolumRange();
        int expected = 0;

        assertEquals(expected, actual);
    }





    @Test
    void findMinRadio() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);

        int actual = radio.getCurrentNumber();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findMaxRadio() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);

        int actual = radio.getCurrentNumber();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findLessThanMinRadio() {
        Radio radio = new Radio();
        radio.setCurrentNumber(-1);

        int actual = radio.getCurrentNumber();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findLessThanMaxRadio() {
        Radio radio = new Radio();
        radio.setCurrentNumber(11);

        int actual = radio.getCurrentNumber();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(4);

        int actual = radio.getCurrentNumber();
        int expected = 4;

        assertEquals(expected, actual);
    }

}

