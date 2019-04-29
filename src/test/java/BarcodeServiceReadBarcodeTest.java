import com.zone24x7.matrix24x7.BarcodeService;
import org.junit.Test;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import static org.junit.Assert.assertEquals;

public class BarcodeServiceReadBarcodeTest {
    private static final String EPC = "EPC";
    private static final String SCANNER_TYPE = "scannerType";

    private JsonObject getSampleJsonPayload(String epc, String scannerType) {
        JsonObjectBuilder jsonPayloadBuilder = Json.createObjectBuilder();
        jsonPayloadBuilder.add(EPC, epc);
        jsonPayloadBuilder.add(SCANNER_TYPE, scannerType);

        return jsonPayloadBuilder.build();
    }

    @Test
    public void readAlphaBarcodeShouldPrintInvertedEPC() {
        String scannerType = "Alpha";
        String epc = "abcd1234";

        JsonObject jsonPayload = getSampleJsonPayload(epc, scannerType);

        BarcodeService barcodeService = new BarcodeService();
        assertEquals("Should Print 4321dcba", "4321dcba", barcodeService.readBarcode(jsonPayload));
    }

    @Test
    public void readBetaBarcodeShouldPrintScannerTypeAppendedToEPC() {
        String scannerType = "Beta";
        String epc = "abcd1234";

        JsonObject jsonPayload = getSampleJsonPayload(epc, scannerType);

        BarcodeService barcodeService = new BarcodeService();
        assertEquals("Should Print abcd1234_BETA", "abcd1234_BETA", barcodeService.readBarcode(jsonPayload));
    }

    @Test
    public void readGammaBarcodeShouldPrintScannerTypeAppendedToEPC() {
        String scannerType = "Gamma";
        String epc = "abcd1234";

        JsonObject jsonPayload = getSampleJsonPayload(epc, scannerType);

        BarcodeService barcodeService = new BarcodeService();
        assertEquals("Should Print abcd1234_GAMMA", "abcd1234_GAMMA", barcodeService.readBarcode(jsonPayload));
    }
}
