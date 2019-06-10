package com.company;

public class Laptop {
    private String processor;
    private String graphicaCard;
    private int harddriveSize;
    private int memorySize;
    private int cores;
    private boolean osx;
    private boolean microsoftWindows;
    private boolean linux;

    public Laptop(String processor, String graphicaCard, int harddriveSize, int memorySize, int cores, boolean osx, boolean microsoftWindows, boolean linux) {
        this.processor = processor;
        this.graphicaCard = graphicaCard;
        this.harddriveSize = harddriveSize;
        this.memorySize = memorySize;
        this.cores = cores;
        this.osx = osx;
        this.microsoftWindows = microsoftWindows;
        this.linux = linux;
    }


    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphicaCard() {
        return graphicaCard;
    }

    public void setGraphicaCard(String graphicaCard) {
        this.graphicaCard = graphicaCard;
    }

    public int getHarddriveSize() {
        return harddriveSize;
    }

    public void setHarddriveSize(int harddriveSize) {
        this.harddriveSize = harddriveSize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public boolean isOsx() {
        return osx;
    }

    public void setOsx(boolean osx) {
        this.osx = osx;
    }

    public boolean isMicrosoftWindows() {
        return microsoftWindows;
    }

    public void setMicrosoftWindows(boolean microsoftWindows) {
        this.microsoftWindows = microsoftWindows;
    }

    public boolean isLinux() {
        return linux;
    }

    public void setLinux(boolean linux) {
        this.linux = linux;
    }



}
