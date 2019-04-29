import com.zone24x7.matrix24x7.BarcodeScannerManager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarcodeScannerManagerRestartScannerTest {
    @Test
    public void restartBarcodeScannerShouldSuccessfullyRestartTheScanner() {
        String scannerType = "Alpha";
        BarcodeScannerManager barcodeScannerManager = new BarcodeScannerManager();

        assertEquals("Barcode should successfully restart", true,
                barcodeScannerManager.restartBarcodeScanner(scannerType));
    }
}
