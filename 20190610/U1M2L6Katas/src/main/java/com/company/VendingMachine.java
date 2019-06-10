package com.company;

public class VendingMachine {

    private String copmanyOfStocker;
    private String color;
    private boolean acceptsCredit;
    private boolean acceptsCash;
    private boolean hasGum;
    private boolean hasChips;
    private boolean hasCandy;

    public VendingMachine(String copmanyOfStocker, String color, boolean acceptsCredit, boolean acceptsCash, boolean hasGum, boolean hasChips, boolean hasCandy) {
        this.copmanyOfStocker = copmanyOfStocker;
        this.color = color;
        this.acceptsCredit = acceptsCredit;
        this.acceptsCash = acceptsCash;
        this.hasGum = hasGum;
        this.hasChips = hasChips;
        this.hasCandy = hasCandy;
    }



    public String getCopmanyOfStocker() {
        return copmanyOfStocker;
    }

    public void setCopmanyOfStocker(String copmanyOfStocker) {
        this.copmanyOfStocker = copmanyOfStocker;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAcceptsCredit() {
        return acceptsCredit;
    }

    public void setAcceptsCredit(boolean acceptsCredit) {
        this.acceptsCredit = acceptsCredit;
    }

    public boolean isAcceptsCash() {
        return acceptsCash;
    }

    public void setAcceptsCash(boolean acceptsCash) {
        this.acceptsCash = acceptsCash;
    }

    public boolean isHasGum() {
        return hasGum;
    }

    public void setHasGum(boolean hasGum) {
        this.hasGum = hasGum;
    }

    public boolean isHasChips() {
        return hasChips;
    }

    public void setHasChips(boolean hasChips) {
        this.hasChips = hasChips;
    }

    public boolean isHasCandy() {
        return hasCandy;
    }

    public void setHasCandy(boolean hasCandy) {
        this.hasCandy = hasCandy;
    }


}
