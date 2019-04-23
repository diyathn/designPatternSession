import com.zone24x7.matrix24x7.BarcodeService;
import org.junit.Test;
import static org.junit.Assert.*;

public class BarcodeServiceReadBarcodeTest {
    @Test
    public void readBarcodeShouldPrintInvertedEPC(){
        //String barcodeType = "Standard";
        String epc = "abcd1234";

        BarcodeService barcodeService = new BarcodeService();
        assertEquals("Should Print 4321dcba", "4321dcba", barcodeService.readBarcode(epc));
    }
}
