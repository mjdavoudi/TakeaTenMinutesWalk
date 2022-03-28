public class WalkGeneratorAuth {
    char[] walkDirection;

    public WalkGeneratorAuth(char[] walkDirection) {
        this.walkDirection = walkDirection;
    }

    public boolean willReturnToStartingPoint() {
        int northDirection = 0;
        int southDirection = 0;
        int eastDirection = 0;
        int westDirection = 0;
        for (char direction : this.walkDirection) {
            switch (direction) {
                case 'n':
                    northDirection++;
                    break;
                case 's':
                    southDirection++;
                    break;
                case 'e':
                    eastDirection++;
                    break;
                case 'w':
                    westDirection++;
                    break;
            }

        }
        return (northDirection == southDirection) && (eastDirection == westDirection);
    }

    public boolean takeTime(int time) {
        return this.walkDirection.length == time;
    }
}
