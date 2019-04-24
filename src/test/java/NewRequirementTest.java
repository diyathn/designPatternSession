import com.zone24x7.matrix24x7.AlphaBarcodeScanner;
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
    public void multipleBarcodeScannersTest() {

        List<JsonObject> inputSet = new ArrayList<JsonObject>();
        inputSet.add(getSampleJsonPayload("alpha", "abcd1234"));
        inputSet.add(getSampleJsonPayload("beta", "abcd1234"));
        inputSet.add(getSampleJsonPayload("gamma", "abcd1234"));

        List<String> outputSet = new ArrayList<String>();
        outputSet.add("abcd1234_alpha");
        outputSet.add("abcd1234_beta");
        outputSet.add("abcd1234_gamma");
        AlphaBarcodeScanner alphaBarcodeScanner = new AlphaBarcodeScanner();
        int count = 0;
        for (JsonObject jsonObject : inputSet) {

            assertEquals("Decoded EPC should be 4321cba", outputSet.get(count), alphaBarcodeScanner.decode(inputSet.get(count)));
            count++;
        }
    }


}
