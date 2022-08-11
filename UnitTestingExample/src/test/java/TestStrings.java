import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestStrings {
    private String string1, string2,string3;
    // @BeforeClass will only run ONCE before all tests
    // @After runs after EACH test
    @Before // runs before EVERY test,
    // why? watch being smashed example
    public void initializeString() {
        string1 = "hello";
        string2 = "hello";
        string3 = new String("hello");
    }
    //@Ignore skip the test
    @Test
    public void testCompareStringDoubleEquals (){
        // arrange / given

        // act / when
        boolean actual = string1 == string2;

        // assert / then
        Assert.assertTrue(actual);
    }

    @Test
    public void testCompareNewStringUsingDoubleEquals() {
        // arrange / given

        // act / when
        boolean actual = string1 == string3;

        // assert / then
        Assert.assertFalse(actual);
    }
}
