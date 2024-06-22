package Seminar01.src.impl;

import java.time.LocalDate;
import Seminar01.src.Product;

public class CupOfHotDrink extends Product{
    private float volume;
    private String typeOfDrink;


    public CupOfHotDrink(String name, double price, LocalDate releaseDate, String typeOfDrink, float volume) {
        super(name, price, releaseDate);
        this.typeOfDrink = typeOfDrink; //например тип кофе: латте, американо итд
        this.volume = volume;

    }

    public float getVolume() {
        return volume;
    }
    public String getTypeOfDrink() {
        return typeOfDrink;
    }
    @Override
    public String toString() {
        return "CupOfHotDrink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "volume=" + volume +
                ", typeOfDrink='" + typeOfDrink +
                '}';
    }

}
