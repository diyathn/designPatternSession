package com.zone24x7.matrix24x7.barcodescanner;

public class BetaBarcodeScanner implements BarcodeScanner {
    public static final String name = "Beta Barcode Decoder";
    public static final String version = "bbs001";

    public void enableBarcodeScanner() {
        System.out.println(name + " turned on!");
    }

    public void disableBarcodeScanner() {
        System.out.println(name + " turned off!");
    }

    public String getBarcodeVersion() {
        return version;
    }

    public String getBarcodeName() {
        return name;
    }

    public String decode(String epc) {
        return epc + "_BETA";
    }
}
