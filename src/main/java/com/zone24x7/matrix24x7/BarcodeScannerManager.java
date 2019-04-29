package com.zone24x7.matrix24x7;

import com.zone24x7.matrix24x7.barcodescanner.BarcodeScanner;
import com.zone24x7.matrix24x7.exception.InvalidBarcodeScannerException;

public class BarcodeScannerManager {
    private BarcodeScannerFactory barcodeScannerFactory;

    public BarcodeScannerManager() {
        barcodeScannerFactory = new BarcodeScannerFactory();
    }

    /**
     * Restart the given barcode scanner type once command is given
     */
    public boolean restartBarcodeScanner(String scannerType) {
        try {
            BarcodeScanner barcodeScanner = barcodeScannerFactory.getBarcodeScanner(scannerType);

            barcodeScanner.disableBarcodeScanner();
            barcodeScanner.enableBarcodeScanner();
            System.out.println(barcodeScanner.getBarcodeName() + " has been restarted!");

            return true;
        } catch (InvalidBarcodeScannerException e) {
            System.out.println("Invalid barcode scanner type. " + e);
            return false;
        }
    }
}
