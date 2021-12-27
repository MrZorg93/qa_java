import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Test;

import java.util.List;

public class TestCatGetFood {
    @Test
    public void checkCatGetFoodReturnPredatorMealsWhenCalled() throws Exception{
        Cat cat = new Cat(new Feline());
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = cat.getFood();
    }
}
