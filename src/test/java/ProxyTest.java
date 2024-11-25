import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ucu.edu.ua.task3.ProxyImage;
import ucu.edu.ua.task3.RealImage;

class ProxyTest {
    @Test
    void testLazyLoading() {
        ProxyImage proxyImage = new ProxyImage("example.jpg");
        assertNull(getRealImage(proxyImage), "RealImage should not be initialized yet.");
        proxyImage.display();
        assertNotNull(getRealImage(proxyImage), "RealImage should be initialized after display is called.");
    }

    private RealImage getRealImage(ProxyImage proxyImage) {
        try {
            var field = ProxyImage.class.getDeclaredField("realImage");
            field.setAccessible(true);
            return (RealImage) field.get(proxyImage);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Failed to access realImage field", e);
        }
    }
}