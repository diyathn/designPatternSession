package com.zone24x7.matrix24x7;

public class StandardBarcodeScanner {

    public static final String name = "Standard Barcode Decoder";
    public static final String version = "sbs001";

    public String getBarcodeVersion(){
        return version;
    }

    public void enableBarcodeScanner(){
        System.out.println("Barcode scanner turned on!");
    }

    public void disableBarcodeScanner(){
        System.out.println("Barcode scanner turned off!");
    }

    /**
     * Decode the given epc
     * This function will reverse the given epc
     * @param epc
     * @return Decoded epc
     */
    public String decode(String epc){
        char ch[]=epc.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }
}
