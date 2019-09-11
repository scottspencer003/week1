import org.junit.*;
import static org.junit.Assert.*;

public class CatFoodTest {
    @Test
    public void testCostPerYear() {
        CatFood Kennedy = new CatFood(1.00,2);
        assertTrue(Kennedy.CostPerYear() == 730.00);
    }

    @Test
    public void testCostPerYear() {
        CatFood Kennedy = new CatFood(1.50,3);
        assertTrue(Kennedy.CostPerYear() == 1642.50);
    }

    @Test
    public void testMealsPerYear() {
        CatFood cans = new CatFood(1.00,3);
        assertTrue(cans.MealsPerYear() == 1095);
    }

    @Test
    public void testMealsPerYear() {
        CatFood cans = new CatFood(1.00,2);
        assertTrue(cans.MealsPerYear() == 730);
    }
}