package Seminar01.src.impl;

public enum EPackage {
    PLASTIC("Пластик"), GLASS("Стекло"), POLYETILEN("Полиэтилен");

    private final String material;
    EPackage(String material){
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
