import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class CuttingTreesTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void negativesArgs() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Wrong args! n: -4 < 0, and m: -10< 0");
        King.cutTrees(-4, -10);
    }

    @Test
    public void mBiggerThenM() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Wrong args! m: 10>= n: 5, OR n: 5 >= 1000");
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

    @Test
    public void cuttingZeroTrees() {
        int expected = 1;

        int actual = King.cutTrees(5, 0);

        assertEquals(expected, actual);
    }

    @Test
    public void cuttingOneTree() {
        int expected = 5;

        int actual = King.cutTrees(5, 1);

        assertEquals(expected, actual);
    }

    @Test
    public void cuttingFewTrees() {
        int expected = 4;

        int actual = King.cutTrees(5, 3);

        assertEquals(expected, actual);
    }
}
