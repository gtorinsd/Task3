package com.udelphi;

/**
 * Created by ODiomin on 01.04.2016.
 */
public class CrowBird extends FlyingBird {
    CrowBird(int averageFlightHeight) {
        this.averageFlightHeight = averageFlightHeight;
        this.cryString = "CrowBird cries";
    }

    @Override
    public void flyAndCry() {
        System.out.println(String.format(this.strFormat, this, averageFlightHeight, cryString));
    }

    @Override
    public void cry() {
        System.out.println(cryString);
    }
}
