import com.zone24x7.matrix24x7.BarcodeController;
import com.zone24x7.matrix24x7.StandardBarcodeScanner;
import org.junit.Test;
import static org.junit.Assert.*;

public class StandardStandardBarcodeScannerDecodeTest {
    @Test
    public void testReadBarcodeShouldGiveInvertedString(){
        String epc = "abcd1234";
        StandardBarcodeScanner standardBarcodeScanner = new StandardBarcodeScanner();
        assertEquals("Decoded EPC should be 4321cba","4321dcba", standardBarcodeScanner.decode(epc));
    }
}
