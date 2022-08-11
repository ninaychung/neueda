import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestStrings {
    private String string1, string2,string3;
    @Before // runs before each test,
    // (not just once before all b/c one test can cause others to break)
    // watch being smashed example
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
