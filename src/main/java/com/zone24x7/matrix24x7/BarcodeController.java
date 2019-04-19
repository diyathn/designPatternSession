package com.zone24x7.matrix24x7;

public class BarcodeController {

    /**
     * This will read the given epc from the given barcode type
     *
     * @param epc Scanned EPC
     * @return Decoded EPC value
     */
    public String readBarcode(String epc) {
        String decodedEpc = null;

        StandardBarcodeScanner standardBarcodeScanner = new StandardBarcodeScanner();
        decodedEpc = standardBarcodeScanner.decode(epc);


        System.out.println("Decoded EPC is: " + decodedEpc);
        return decodedEpc;
    }
}
