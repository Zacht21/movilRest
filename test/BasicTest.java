import models.Usuario;
import org.junit.Test;
import play.test.UnitTest;

public class BasicTest extends UnitTest {

    @Test
    public void aVeryImportantThingToTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void test(){
        Usuario usuario = new Usuario("jorge", "jorge","qwe@qwe.com", "qwe");

    }
}
