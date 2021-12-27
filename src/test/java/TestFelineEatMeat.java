import com.example.Feline;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

//@RunWith(MockitoJUnitRunner.class)
public class TestFelineEatMeat {

//    @Mock
//    Animal animal;

    @Test
    public void CheckFelineEatMeatReturnPredatorMealsWhenCalled() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
  //      Mockito.when(animal.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }
}
