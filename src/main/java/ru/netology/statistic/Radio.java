package ru.netology.statistic;

public class Radio {


    public void currentVolumeMax() {
        int newCurrentVolumeMax = currentVolumeMax + 1;
        setCurrentVolumeMax(newCurrentVolumeMax);
    }

    public void currentVolumeMin() {
        int newCurrentVolumeMin = currentVolumeMin - 1;
        setCurrentVolumeMin(newCurrentVolumeMin);
    }

    private int volumRange;

    public void setVolumRange(int volumRange) {

        if (volumRange > 10) {
            volumRange = 10;
        }

        if (volumRange < 0) {
            volumRange = 0;
        }

        this.volumRange = volumRange;
    }

    public int getVolumRange() {
        return volumRange;
    }

    private int currentNumber;

    public void setCurrentNumber(int currentNumber) {

        if (currentNumber > 0) {
            currentNumber = currentNumber + 1;
        }

        if (currentNumber < 9) {
            currentNumber = currentNumber - 1;
        }

        if (currentNumber >= 9) {
            currentNumber = 0;
        }

        if (currentNumber < 0) {
            currentNumber = 9;
        }

        this.currentNumber = currentNumber;
    }


    public int getCurrentNumber() {
        return currentNumber;
    }

    private int chooseANumber;

    public void setChooseANumber(int chooseANumber) {

        if (chooseANumber >= 0) {
            chooseANumber = 9;
        } else {
            chooseANumber = chooseANumber;
        }

        this.chooseANumber = chooseANumber;
    }

    public int getChooseANumber() {
        return chooseANumber;
    }

}