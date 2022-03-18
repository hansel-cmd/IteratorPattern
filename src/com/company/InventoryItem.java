package com.company;

public class InventoryItem {
    
    private String name;
    private String description;
    private RarityLevel rarity;
    private float attackBonus;
    private float defenseBonus;


    public InventoryItem(String name, String description, RarityLevel rarity, float attackBonus, float defenseBonus) {
        this.name = name;
        this.description = description;
        this.rarity = rarity;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RarityLevel getRarity() {
        return rarity;
    }

    public void setRarity(RarityLevel rarity) {
        this.rarity = rarity;
    }

    public float getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(float attackBonus) {
        this.attackBonus = attackBonus;
    }

    public float getDefenseBonus() {
        return defenseBonus;
    }

    public void setDefenseBonus(float defenseBonus) {
        this.defenseBonus = defenseBonus;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", rarity=" + rarity +
                ", attackBonus=" + attackBonus +
                ", defenseBonus=" + defenseBonus +
                '}';
    }
}
