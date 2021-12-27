import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFelineGetFamily {

    @Test
    public void CheckFelineGetFamilyReturnFelineWhenCalled(){
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }
}
