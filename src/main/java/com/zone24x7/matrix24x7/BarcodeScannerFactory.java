package com.zone24x7.matrix24x7;

import com.zone24x7.matrix24x7.barcodescanner.AlphaBarcodeScanner;
import com.zone24x7.matrix24x7.barcodescanner.BarcodeScanner;
import com.zone24x7.matrix24x7.barcodescanner.BetaBarcodeScanner;
import com.zone24x7.matrix24x7.barcodescanner.GammaBarcodeScanner;
import com.zone24x7.matrix24x7.exception.InvalidBarcodeScannerException;

public class BarcodeScannerFactory {
    /**
     * Instantiate and returns new BarcodeScanner instance according to the
     * requested scanner type
     * @param scannerType Barcode scanner type
     * @return BarcodeScanner instance
     * @throws InvalidBarcodeScannerException If requested BarcodeScanner type is NA
     */
    public BarcodeScanner getBarcodeScanner(String scannerType) throws InvalidBarcodeScannerException {
        switch (scannerType.toLowerCase()) {
            case "alpha":
                return new AlphaBarcodeScanner();
            case "beta":
                return new BetaBarcodeScanner();
            case "gamma":
                return new GammaBarcodeScanner();
            default:
                throw new InvalidBarcodeScannerException(scannerType);
        }
    }
}
