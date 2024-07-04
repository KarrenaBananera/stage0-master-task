package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur)
    {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription()
    {
        String paws = numberOfPaws > 1? "paws" : "paw";
        String ret = String.format("This animal is mostly %s. It has %s %s and ",color,numberOfPaws,paws);
        if (hasFur)
            ret = ret + "a fur.";
        else ret = ret + "no fur.";
        return ret;
    }
}
