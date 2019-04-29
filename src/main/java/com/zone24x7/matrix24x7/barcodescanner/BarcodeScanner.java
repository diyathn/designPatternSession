package com.zone24x7.matrix24x7.barcodescanner;

public interface BarcodeScanner {
    void enableBarcodeScanner();
    void disableBarcodeScanner();
    String getBarcodeVersion();
    String getBarcodeName();
    String decode(String epc);
}
