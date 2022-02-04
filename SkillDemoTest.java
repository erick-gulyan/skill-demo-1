import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiply(){
        assertEquals(25,SkillDemo.multiply(5,5)); //this should fail since 5*5=25
    }
}
