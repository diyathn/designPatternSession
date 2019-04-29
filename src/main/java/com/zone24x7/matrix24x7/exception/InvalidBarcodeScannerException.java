package com.zone24x7.matrix24x7.exception;

public class InvalidBarcodeScannerException extends Exception {
    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     */
    public InvalidBarcodeScannerException(String scannerType) {
        super("Barcode scanner: "+ scannerType +" is not available");
    }

    /**
     * Constructs a new exception with the specified detail message and
     * cause.  <p>Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this exception's detail message.
     *
     * @since 1.4
     */
    public InvalidBarcodeScannerException(String scannerType, Throwable cause) {
        super("Barcode scanner: "+ scannerType +" is not available", cause);
    }
}
