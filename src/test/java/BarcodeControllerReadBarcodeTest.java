import com.zone24x7.matrix24x7.BarcodeController;
import org.junit.Test;
import static org.junit.Assert.*;

public class BarcodeControllerReadBarcodeTest {
    @Test
    public void readBarcodeShouldPrintInvertedEPC(){
        //String barcodeType = "Standard";
        String epc = "abcd1234";

        BarcodeController barcodeController = new BarcodeController();
        assertEquals("Should Print 4321dcba", "4321dcba", barcodeController.readBarcode(epc));
    }
}
