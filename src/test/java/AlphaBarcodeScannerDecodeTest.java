import com.zone24x7.matrix24x7.AlphaBarcodeScanner;
import org.junit.Test;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import static org.junit.Assert.assertEquals;

public class AlphaBarcodeScannerDecodeTest {

    @Test
    public void testReadBarcodeShouldGiveInvertedString() {

        String input = "abcd1234";

        AlphaBarcodeScanner alphaBarcodeScanner = new AlphaBarcodeScanner();
        assertEquals("Decoded EPC should be 4321dcba", "4321dcba", alphaBarcodeScanner.decode(input));
    }
}
