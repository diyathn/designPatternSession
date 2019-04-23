import com.zone24x7.matrix24x7.AlphaBarcodeScanner;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlphaBarcodeScannerDecodeTest {
    @Test
    public void testReadBarcodeShouldGiveInvertedString(){
        String epc = "abcd1234";
        AlphaBarcodeScanner alphaBarcodeScanner = new AlphaBarcodeScanner();
        assertEquals("Decoded EPC should be 4321cba","4321dcba", alphaBarcodeScanner.decode(epc));
    }
}
