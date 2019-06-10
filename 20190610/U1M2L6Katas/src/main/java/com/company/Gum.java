package com.company;

public class Gum {
    private String brand;
    private String packingDesign;
    private String flavor;
    private int piecesInPack;
    private boolean lowSugar;
    private boolean hasSugar;


    public Gum(String brand, String packingDesign, String flavor, int piecesInPack, boolean lowSugar, boolean hasSugar) {
        this.brand = brand;
        this.packingDesign = packingDesign;
        this.flavor = flavor;
        this.piecesInPack = piecesInPack;
        this.lowSugar = lowSugar;
        this.hasSugar = hasSugar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPackingDesign() {
        return packingDesign;
    }

    public void setPackingDesign(String packingDesign) {
        this.packingDesign = packingDesign;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getPiecesInPack() {
        return piecesInPack;
    }

    public void setPiecesInPack(int piecesInPack) {
        this.piecesInPack = piecesInPack;
    }

    public boolean isLowSugar() {
        return lowSugar;
    }

    public void setLowSugar(boolean lowSugar) {
        this.lowSugar = lowSugar;
    }

    public boolean isHasSugar() {
        return hasSugar;
    }

    public void setHasSugar(boolean hasSugar) {
        this.hasSugar = hasSugar;
    }




}
