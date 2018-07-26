import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CuttingTreesWithWrongArgsTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void negativeArgs() {
        expectedException.expect(IllegalArgumentException.class);
        King.cutTrees(-4, -10);
    }

    @Test
    public void negativeM() {
        expectedException.expect(IllegalArgumentException.class);
        King.cutTrees(5, -4);
    }

    @Test
    public void mBiggerThenN() {
        expectedException.expect(IllegalArgumentException.class);
        King.cutTrees(5, 10);
    }

    @Test
    public void nBiggerThen1000() {
        expectedException.expect(IllegalArgumentException.class);
        King.cutTrees(1005, 10);
    }

    @Test
    public void nEqualsM() {
        expectedException.expect(IllegalArgumentException.class);
        King.cutTrees(10, 10);
    }
}
