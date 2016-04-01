package com.udelphi;

public class Main {

    public static void main(String[] args) {
	    Bird[] birds = new Bird[]{new CrowBird(3), new ChickenBird(-1)};
        for(Bird bird : birds)
        {
            bird.flyAndCry();
        }
    }
}
