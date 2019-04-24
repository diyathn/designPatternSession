package com.zone24x7.matrix24x7;

import javax.json.JsonObject;

public class AlphaBarcodeScanner {

    public static final String name = "Alpha Barcode Scanner";
    public static final String version = "abs001";

    public String getBarcodeVersion(){
        return version;
    }

    public void enableBarcodeScanner(){
        System.out.println( name + " turned on!");
    }

    public void disableBarcodeScanner(){
        System.out.println( name + " turned off!");
    }

    /**
     * Decode the given epc
     * This function will reverse the given epc
     * @param epc
     * @return Decoded epc
     */
    public String decode(JsonObject epc){
        char ch[]=epc.getString("EPC").toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }
}
