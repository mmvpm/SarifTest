import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    @DisplayName("main: -> PrintStreamPrintln")
    public void testMain_PrintStreamPrintln() throws Throwable {
        Main.main(null);
    }
}
