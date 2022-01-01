package com.example;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestGetFood {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    private final String animalType;
    private final List<String> foodType;

    public TestGetFood(String animalType, List<String> foodType){
        this.animalType = animalType;
        this.foodType = foodType;
    }
    @Parameterized.Parameters
    public static Object[][] getFoodType(){
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };

    }
    @Test
    public void checkAnimalGetFoodReturnCorrectTypeOfFoodWhenAnimalTypeInput() throws Exception{
        Animal animal = new Animal();
        List<String> actual = animal.getFood(animalType);
        assertEquals(foodType, actual);
    }
    
    @Mock
    Feline feline;

    @Test
    public void checkLionGetFoodReturnPredatorFoodWhenCalled() throws Exception{
        Lion lion = new Lion(feline);
        List<String> expected = List.of("Звери", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Звери", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }

    @Test
    public void checkAlexTheLionGetFoodReturnPredatorFoodWhenCalled() throws Exception{
        AlexTheLion alex = new AlexTheLion(feline);
        List<String> expected = List.of("Звери", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Звери", "Птицы", "Рыба"));
        List<String> actual = alex.getFood();
        assertEquals(expected, actual);
    }

    @Test
    public void checkCatGetFoodReturnPredatorMealsWhenCalled() throws Exception{
        Cat cat = new Cat(feline);
        List<String> expected = List.of("Звери", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Звери", "Птицы", "Рыба"));
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void checkAnimalGetFoodException() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        Animal animal = new Animal();
        List<String> wrongFood = animal.getFood("None");

        thrown = ExpectedException.none();
    }
}
