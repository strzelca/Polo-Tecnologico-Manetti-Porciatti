package com.school_phonedataplan;

public class DataPlan {
    boolean power;
    int minutesLeft;
    float credit;
    int internetLeft;

    DataPlan(){}

    DataPlan(boolean power, int minutesLeft, int credit, int internetLeft) {
        this.power = power;
        this.minutesLeft = minutesLeft;
        this.credit = credit;
        this.internetLeft = internetLeft;
    }

    public boolean getPower() { return power; }
    public int getMinutesLeft() { return minutesLeft; }
    public float getCredit() { return credit; }
    public int getInternetLeft() { return internetLeft; }

    public void setPower(boolean power) { this.power = power; }
    public void setMinutesLeft(int minutesLeft) { this.minutesLeft = minutesLeft; }
    public void setCredit(float credit) { this.credit = credit; }
    public void setInternetLeft(int internetLeft) { this.internetLeft = internetLeft; }

}
