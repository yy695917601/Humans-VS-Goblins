public class Goblin {
    int x,y;
    Goblin(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "\uD83D\uDC35";
    }
}
