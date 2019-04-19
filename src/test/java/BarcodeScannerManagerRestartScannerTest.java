import com.zone24x7.matrix24x7.BarcodeScannerManager;
import org.junit.Test;
import static org.junit.Assert.*;

public class BarcodeScannerManagerRestartScannerTest {
    @Test
    public void restartBarcodeScannerShouldSuccessfullyRestartTheScanner(){
        BarcodeScannerManager barcodeScannerManager = new BarcodeScannerManager();

        assertEquals("Barcode should successfully restart", true, barcodeScannerManager.restartBarcodeScanner());
    }
}
