import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class DomainClass1Test {
    @Test
//  @Category( MyUnitTest.class)
    public void testUnitTestOne() {
        DomainClass1 domainClass1 = new DomainClass1();
        assertEquals( 15131, domainClass1.convert( 123));
        assertTrue(false); // FAIL
    }
}
