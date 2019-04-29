import com.zone24x7.matrix24x7.barcodescanner.AlphaBarcodeScanner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlphaBarcodeScannerDecodeTest {
    @Test
    public void testDecodeShouldGiveInvertedString() {
        String epc = "abcd1234";
        AlphaBarcodeScanner alphaBarcodeScanner = new AlphaBarcodeScanner();
        assertEquals("Decoded EPC should be 4321cba", "4321dcba", alphaBarcodeScanner.decode(epc));
    }
}
