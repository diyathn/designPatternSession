package com.zone24x7.matrix24x7;

public class BarcodeScannerManager {

    /**
     * Restart the given barcode scanner type once command is given
     */
    public boolean restartBarcodeScanner() {

        AlphaBarcodeScanner alphaBarcodeScanner = new AlphaBarcodeScanner();
        alphaBarcodeScanner.disableBarcodeScanner();
        alphaBarcodeScanner.enableBarcodeScanner();
        System.out.println(AlphaBarcodeScanner.name + " has been restarted!");
        return true;
    }
}
