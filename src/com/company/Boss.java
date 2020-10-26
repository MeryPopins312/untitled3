package com.company;

public class Boss extends GameEntity {
   Weapon knife=new Weapon();

    public Weapon getKnife() {
        return knife;
    }

    public void setKnife(Weapon knife) {
        this.knife = knife;
    }
}
