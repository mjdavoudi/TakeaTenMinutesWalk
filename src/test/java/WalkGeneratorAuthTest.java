import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WalkGeneratorAuthTest {
    @Test
    void take_time_test() {
        char[] walkDirection = {'n', 'w', 's', 'e'};
        WalkGeneratorAuth walkGeneratorAuth = new WalkGeneratorAuth(walkDirection);
        int time = 4;
        Assertions.assertTrue(walkGeneratorAuth.takeTime(time));
    }

    @Test
    void return_to_starting_point() {
        char[] walkDirection = {'n','s','n','s','n','s','n','s','n','s', 's', 'n'};
        WalkGeneratorAuth walkGeneratorAuth = new WalkGeneratorAuth(walkDirection);
        Assertions.assertTrue(walkGeneratorAuth.willReturnToStartingPoint());

    }

    @Test
    void return_to_starting_point_and_take_10_min() {
        char[] walkDirection = {'n','s','n','s','n','s','n','s','n','s'};
        int time = 10;
        WalkGeneratorAuth walkGeneratorAuth = new WalkGeneratorAuth(walkDirection);
        Assertions.assertTrue(walkGeneratorAuth.willReturnToStartingPoint() && walkGeneratorAuth.takeTime(time));

    }
}
