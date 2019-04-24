import com.zone24x7.matrix24x7.BarcodeService;
import org.junit.Test;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import static org.junit.Assert.assertEquals;

public class BarcodeServiceReadBarcodeTest {
    private static final String EPC = "EPC";

    private JsonObject getSampleJsonPayload(String epc) {
        JsonObjectBuilder jsonPayloadBuilder = Json.createObjectBuilder();
        jsonPayloadBuilder.add(EPC, epc);

        return jsonPayloadBuilder.build();
    }

    @Test
    public void readBarcodeShouldPrintInvertedEPC() {

        JsonObject jsonPayload = getSampleJsonPayload("abcd1234");

        BarcodeService barcodeService = new BarcodeService();
        assertEquals("Should Print 4321dcba", "4321dcba", barcodeService.readBarcode(jsonPayload));
    }
}
