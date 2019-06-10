package com.company;

public class Mints {

    private String type;
    private String packingDesign;
    private int quantityPerPack;
    private boolean sweet;
    private boolean noSugar;
    private String manufacturer;

    public Mints(String type, String packingDesign, int quantityPerPack, boolean sweet, boolean noSugar, String manufacturer) {
        this.type = type;
        this.packingDesign = packingDesign;
        this.quantityPerPack = quantityPerPack;
        this.sweet = sweet;
        this.noSugar = noSugar;
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPackingDesign() {
        return packingDesign;
    }

    public void setPackingDesign(String packingDesign) {
        this.packingDesign = packingDesign;
    }

    public int getQuantityPerPack() {
        return quantityPerPack;
    }

    public void setQuantityPerPack(int quantityPerPack) {
        this.quantityPerPack = quantityPerPack;
    }

    public boolean isSweet() {
        return sweet;
    }

    public void setSweet(boolean sweet) {
        this.sweet = sweet;
    }

    public boolean isNoSugar() {
        return noSugar;
    }

    public void setNoSugar(boolean noSugar) {
        this.noSugar = noSugar;
    }

}
