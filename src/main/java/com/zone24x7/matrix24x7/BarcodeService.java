package com.zone24x7.matrix24x7;

import javax.json.JsonObject;

public class BarcodeService {

    /**
     * This will read the given epc from the given barcode type
     *
     * @param epc Scanned EPC
     * @return Decoded EPC value
     */
    public String readBarcode(JsonObject epc) {
        String decodedEpc = null;

        AlphaBarcodeScanner alphaBarcodeScanner = new AlphaBarcodeScanner();
        decodedEpc = alphaBarcodeScanner.decode(epc);


        System.out.println("Decoded EPC is: " + decodedEpc);
        return decodedEpc;
    }
}
