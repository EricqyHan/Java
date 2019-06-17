public class IceCreamPointOfSale {

    private String flavor;
    private String flavorColor;
    private int scoopCost;
    private int coneCost;
    private int topingsCost;
    private double totalweight;
    private boolean hasNuts;


    public IceCreamPointOfSale(String flavor, String flavorColor, int scoopCost, int coneCost, int topingsCost, double totalweight, boolean hasNuts) {
        this.flavor = flavor;
        this.flavorColor = flavorColor;
        this.scoopCost = scoopCost;
        this.coneCost = coneCost;
        this.topingsCost = topingsCost;
        this.totalweight = totalweight;
        this.hasNuts = hasNuts;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavorColor() {
        return flavorColor;
    }

    public void setFlavorColor(String flavorColor) {
        this.flavorColor = flavorColor;
    }

    public int getScoopCost() {
        return scoopCost;
    }

    public void setScoopCost(int scoopCost) {
        this.scoopCost = scoopCost;
    }

    public int getConeCost() {
        return coneCost;
    }

    public void setConeCost(int coneCost) {
        this.coneCost = coneCost;
    }

    public int getTopingsCost() {
        return topingsCost;
    }

    public void setTopingsCost(int topingsCost) {
        this.topingsCost = topingsCost;
    }

    public double getTotalweight() {
        return totalweight;
    }

    public void setTotalweight(double totalweight) {
        this.totalweight = totalweight;
    }

    public boolean isHasNuts() {
        return hasNuts;
    }

    public void setHasNuts(boolean hasNuts) {
        this.hasNuts = hasNuts;
    }
}
