package com.company;

public class GameEntity {
    private int bossHealth;
    private int bossDamage;
    private int heroHealth;
    private int heroDamage;
    private String bossDefenceType;
    private String heroDefenceType;

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public String getBossDefenceType() {
        return bossDefenceType;
    }

    public void setBossDefenceType(String bossDefenceType) {
        this.bossDefenceType = bossDefenceType;
    }

    public String getHeroDefenceType() {
        return heroDefenceType;
    }

    public void setHeroDefenceType(String heroDefenceType) {
        this.heroDefenceType = heroDefenceType;
    }
}
