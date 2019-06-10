package com.company;

public class EtcLaptop {
    private String operatingSystem;
    private boolean legalCopyOS;
    private boolean hasMicrosoftOffice;
    private boolean hasWebCam;
    private boolean hasWarranty;


    public EtcLaptop(String operatingSystem, boolean legalCopyOS, boolean hasMicrosoftOffice, boolean hasWebCam, boolean hasWarranty) {
        this.operatingSystem = operatingSystem;
        this.legalCopyOS = legalCopyOS;
        this.hasMicrosoftOffice = hasMicrosoftOffice;
        this.hasWebCam = hasWebCam;
        this.hasWarranty = hasWarranty;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public boolean isLegalCopyOS() {
        return legalCopyOS;
    }

    public void setLegalCopyOS(boolean legalCopyOS) {
        this.legalCopyOS = legalCopyOS;
    }

    public boolean isHasMicrosoftOffice() {
        return hasMicrosoftOffice;
    }

    public void setHasMicrosoftOffice(boolean hasMicrosoftOffice) {
        this.hasMicrosoftOffice = hasMicrosoftOffice;
    }

    public boolean isHasWebCam() {
        return hasWebCam;
    }

    public void setHasWebCam(boolean hasWebCam) {
        this.hasWebCam = hasWebCam;
    }

    public boolean isHasWarranty() {
        return hasWarranty;
    }

    public void setHasWarranty(boolean hasWarranty) {
        this.hasWarranty = hasWarranty;
    }


}
