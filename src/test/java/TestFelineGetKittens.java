import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class TestFelineGetKittens {

    private final int kittensCount;
    private final int expected;

    public TestFelineGetKittens(int kittensCount, int expected){
        this.kittensCount = kittensCount;
        this.expected = expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getKittensCount() {
        return new Object[][] {
                { 1, 1},
                { 0, 0},
                { 2, 2},
                { 7, 7},
                {-1, -1},
        };
    }

    @Test
    public void CheckFelineGetKittensReturnKittensCountWhenCalled() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        assertEquals(expected, actual);
    }
}
