package Seminar01.src;

import Seminar01.src.impl.BottleOfWater;
import Seminar01.src.impl.CupOfHotDrink;
import Seminar01.src.impl.EPackage;
import Seminar01.src.impl.HotDrinkVM;
import Seminar01.src.impl.WaterVendingMachine;

import java.time.LocalDate;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F);

        Product cup1 = new CupOfHotDrink("Кофе Американо", 100, LocalDate.of(2024, 5, 1), "Американо/200 гр.", 0.2F);

        Product cup2 = new CupOfHotDrink("Кофе Латте", 100, LocalDate.of(2024, 5, 1), "Латте/200 гр.", 0.2F);

        VendingMachine vm = new WaterVendingMachine();

        VendingMachine vm1 = new HotDrinkVM(80);

//        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        vm1.addProducts(List.of(cup1, cup2));

//        System.out.println(vm.getProducts());

        vm1.getProduct("Кофе Латте", 0.2f, 80);
        vm1.deleteProduct("Кофе Латте");

        System.out.println(vm1.getProducts());
    }
}

