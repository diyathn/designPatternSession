package com.zone24x7.matrix24x7.barcodescanner;

public class GammaBarcodeScanner implements BarcodeScanner {
    public static final String name = "Gamma Barcode Decoder";
    public static final String version = "gbs001";

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
        return epc + "_GAMMA";
    }
}
