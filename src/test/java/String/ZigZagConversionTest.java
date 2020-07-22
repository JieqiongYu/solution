package String;

import org.junit.*;
import org.mockito.Mock;

import static junit.framework.TestCase.assertEquals;

public class ZigZagConversionTest {
    @Mock
    private ZigZagConversion solution;

    public ZigZagConversionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        solution = new ZigZagConversion();
    }

    @After
    public void tearDown() {
    }

    /**
     * Example 1.
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     */
    @Test
    public void testcase1() {
        String input = "PAYPALISHIRING";
        int row = 3;
        String expected = "PAHNAPLSIIGYIR";
        assertEquals(expected, solution.convert(input, row));
    }

    /**
     * Example 2.
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     */
    @Test
    public void testcase2() {
        String input = "PAYPALISHIRING";
        int row = 4;
        String expected = "PINALSIGYAHRPI";
        assertEquals(expected, solution.convert(input, row));
    }
}
