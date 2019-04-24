import com.zone24x7.matrix24x7.AlphaBarcodeScanner;
import org.junit.Test;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import static org.junit.Assert.assertEquals;

public class AlphaBarcodeScannerDecodeTest {

    private static final String EPC = "EPC";

    private JsonObject getSampleJsonPayload(String epc) {
        JsonObjectBuilder jsonPayloadBuilder = Json.createObjectBuilder();
        jsonPayloadBuilder.add(EPC, epc);

        return jsonPayloadBuilder.build();
    }

    @Test
    public void testReadBarcodeShouldGiveInvertedString() {

        JsonObject samplePayload = getSampleJsonPayload("abcd1234");

        AlphaBarcodeScanner alphaBarcodeScanner = new AlphaBarcodeScanner();
        assertEquals("Decoded EPC should be 4321cba", "4321dcba", alphaBarcodeScanner.decode(samplePayload));
    }
}
