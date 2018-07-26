import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CuttingTreesTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5, 3, 4}, {5, 0, 1}, {5, 1, 5}, {6, 4, 3}
        });
    }

    private int n;

    private int m;

    private int expected;

    public CuttingTreesTest(int n, int m, int expected) {
        this.n = n;
        this.m = m;
        this.expected = expected;
    }

    @Test
    public void cuttingTrees() {
        assertEquals(expected, King.cutTrees(n, m));
    }

}
