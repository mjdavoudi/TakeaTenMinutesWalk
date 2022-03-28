import java.util.ArrayList;

public class WalkGeneratorAuth {
    char[] walkDirection;

    public WalkGeneratorAuth(char[] walkDirection) {
        this.walkDirection = walkDirection;
    }

    public boolean willReturnToStartingPoint() {
        ArrayList<Character> nDirection = new ArrayList<>();
        ArrayList<Character> sDirection = new ArrayList<>();
        ArrayList<Character> eDirection = new ArrayList<>();
        ArrayList<Character> wDirection = new ArrayList<>();
        for (char direction: this.walkDirection) {
            switch (direction){
                case 'n':
                    nDirection.add(direction);
                    break;
                case 's':
                    sDirection.add(direction);
                    break;
                case 'e':
                    eDirection.add(direction);
                    break;
                case 'w':
                    wDirection.add(direction);
                    break;
            }

        }
        return (nDirection.size() == sDirection.size()) && (eDirection.size() == wDirection.size());
    }

    public boolean takeTime(int time) {
        return this.walkDirection.length == time;
    }
}
