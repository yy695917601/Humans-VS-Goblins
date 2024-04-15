public class Main {
    public static void main(String[] args) {
        GameWorld gameWorld = new GameWorld(3);
        System.out.println(gameWorld);
        while((gameWorld.human.y != gameWorld.goblin.y) || (gameWorld.human.x != gameWorld.goblin.x)){
            gameWorld.move();
            System.out.println(gameWorld);
        }
        double combatOutCome = Math.random()*10;
        if(combatOutCome > 5){
            System.out.println("Goblin win");
        }
        else
            System.out.println("Human win");

    }
}
