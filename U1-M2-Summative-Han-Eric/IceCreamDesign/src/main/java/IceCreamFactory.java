public class IceCreamFactory {

    private String flavor;
    private String flavorName;
    private String packaging;
    private String flavorColor;
    private String milkBrand;
    private String sugarBrand;
    private String vanillaExtractBrand;
    private String eggsBrand;
    private int electricalBills;
    private int laborCost;
    private int rentCost;
    private boolean hasSugar;
    private boolean hasNuts;
    private boolean givesTours;

    public IceCreamFactory(String flavor, String flavorName, String packaging, String flavorColor, String milkBrand, String sugarBrand, String vanillaExtractBrand, String eggsBrand, int electricalBills, int laborCost, int rentCost, boolean hasSugar, boolean hasNuts, boolean givesTours) {
        this.flavor = flavor;
        this.flavorName = flavorName;
        this.packaging = packaging;
        this.flavorColor = flavorColor;
        this.milkBrand = milkBrand;
        this.sugarBrand = sugarBrand;
        this.vanillaExtractBrand = vanillaExtractBrand;
        this.eggsBrand = eggsBrand;
        this.electricalBills = electricalBills;
        this.laborCost = laborCost;
        this.rentCost = rentCost;
        this.hasSugar = hasSugar;
        this.hasNuts = hasNuts;
        this.givesTours = givesTours;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public String getFlavorColor() {
        return flavorColor;
    }

    public void setFlavorColor(String flavorColor) {
        this.flavorColor = flavorColor;
    }

    public String getMilkBrand() {
        return milkBrand;
    }

    public void setMilkBrand(String milkBrand) {
        this.milkBrand = milkBrand;
    }

    public String getSugarBrand() {
        return sugarBrand;
    }

    public void setSugarBrand(String sugarBrand) {
        this.sugarBrand = sugarBrand;
    }

    public String getVanillaExtractBrand() {
        return vanillaExtractBrand;
    }

    public void setVanillaExtractBrand(String vanillaExtractBrand) {
        this.vanillaExtractBrand = vanillaExtractBrand;
    }

    public String getEggsBrand() {
        return eggsBrand;
    }

    public void setEggsBrand(String eggsBrand) {
        this.eggsBrand = eggsBrand;
    }

    public int getElectricalBills() {
        return electricalBills;
    }

    public void setElectricalBills(int electricalBills) {
        this.electricalBills = electricalBills;
    }

    public int getLaborCost() {
        return laborCost;
    }

    public void setLaborCost(int laborCost) {
        this.laborCost = laborCost;
    }

    public int getRentCost() {
        return rentCost;
    }

    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }

    public boolean isHasSugar() {
        return hasSugar;
    }

    public void setHasSugar(boolean hasSugar) {
        this.hasSugar = hasSugar;
    }

    public boolean isHasNuts() {
        return hasNuts;
    }

    public void setHasNuts(boolean hasNuts) {
        this.hasNuts = hasNuts;
    }

    public boolean isGivesTours() {
        return givesTours;
    }

    public void setGivesTours(boolean givesTours) {
        this.givesTours = givesTours;
    }
}
