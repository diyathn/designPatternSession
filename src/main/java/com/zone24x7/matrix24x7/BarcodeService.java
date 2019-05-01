package com.zone24x7.matrix24x7;

import javax.json.JsonObject;

public class BarcodeService {

    /**
     * This will read the given epc from the given barcode type
     *
     * @param payload Scanned EPC & Scanner type as JSON object
     * @return Decoded EPC value
     */
    public String readBarcode(JsonObject payload) {
        String decodedEpc = null;
        String epc = payload.getString("EPC");

        AlphaBarcodeScanner alphaBarcodeScanner = new AlphaBarcodeScanner();
        decodedEpc = alphaBarcodeScanner.decode(epc);


        System.out.println("Decoded EPC is: " + decodedEpc);
        return decodedEpc;
    }
}
