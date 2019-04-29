package com.zone24x7.matrix24x7;

import com.zone24x7.matrix24x7.barcodescanner.BarcodeScanner;
import com.zone24x7.matrix24x7.exception.InvalidBarcodeScannerException;

import javax.json.JsonObject;

public class BarcodeService {

    private BarcodeScannerFactory barcodeScannerFactory;

    public BarcodeService() {
        barcodeScannerFactory = new BarcodeScannerFactory();
    }

    /**
     * This will read the given epc from the given barcode type
     *
     * @param payload Json node sent through API
     * @return Decoded EPC value
     */
    public String readBarcode(JsonObject payload) {
        String decodedEpc = null;

        try {
            String scannerType = payload.getString("scannerType");
            String epc = payload.getString("EPC");

            BarcodeScanner barcodeScanner = barcodeScannerFactory.getBarcodeScanner(scannerType);
            decodedEpc = barcodeScanner.decode(epc);
            System.out.println("Decoded EPC is: " + decodedEpc);

        } catch (InvalidBarcodeScannerException e) {
            //Used sout for demonstration
            // Should use a logger instead of the sout.
            System.out.println("Invalid barcode scanner type provided. " + e);
        }
        return decodedEpc;
    }
}
