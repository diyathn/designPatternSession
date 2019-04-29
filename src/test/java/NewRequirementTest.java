
import com.zone24x7.matrix24x7.BarcodeScannerFactory;
import com.zone24x7.matrix24x7.exception.InvalidBarcodeScannerException;
import org.junit.Test;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NewRequirementTest {
    private static final String SCANNER_TYPE = "scannerType";
    private static final String EPC = "EPC";

    private JsonObject getSampleJsonPayload(String scannerType, String epc) {
        JsonObjectBuilder jsonPayloadBuilder = Json.createObjectBuilder();
        jsonPayloadBuilder.add(SCANNER_TYPE, scannerType);
        jsonPayloadBuilder.add(EPC, epc);

        return jsonPayloadBuilder.build();
    }

    @Test
    public void multipleBarcodeScannersTest() throws InvalidBarcodeScannerException {

        List<JsonObject> inputSet = new ArrayList<JsonObject>();
        inputSet.add(getSampleJsonPayload("alpha", "abcd1234"));
        inputSet.add(getSampleJsonPayload("beta", "abcd1234"));
        inputSet.add(getSampleJsonPayload("gamma", "abcd1234"));

        List<String> outputSet = new ArrayList<String>();
        outputSet.add("4321dcba");
        outputSet.add("abcd1234_BETA");
        outputSet.add("abcd1234_GAMMA");

        BarcodeScannerFactory barcodeScannerFactory = new BarcodeScannerFactory();

        int count = 0;
        for (JsonObject jsonObject : inputSet) {
            JsonObject currentInput = inputSet.get(count);
            assertEquals("Decoded EPC should be 4321dcba", outputSet.get(count),
                    barcodeScannerFactory.getBarcodeScanner(currentInput.getString(SCANNER_TYPE))
                            .decode(currentInput.getString(EPC)));
            count++;
        }
    }


}
