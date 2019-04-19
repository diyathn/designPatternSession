package com.zone24x7.matrix24x7;

public class BarcodeScannerManager {

    /**
     * Restart the given barcode scanner type once command is given
     */
    public boolean restartBarcodeScanner() {

        StandardBarcodeScanner standardBarcodeScanner = new StandardBarcodeScanner();
        standardBarcodeScanner.disableBarcodeScanner();
        standardBarcodeScanner.enableBarcodeScanner();
        System.out.println(StandardBarcodeScanner.name + " has been restarted!");
        return true;
    }
}
