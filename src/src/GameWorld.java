import java.util.ArrayList;
import java.util.Scanner;

public class GameWorld {
    ArrayList<Land> lands = new ArrayList<>();
    Human human;
    Goblin goblin;
    int dimension;

    GameWorld(int dimension) {
        this.dimension = dimension;
        human = new Human(0, dimension-1);
        goblin = new Goblin(dimension-1, 0);
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                lands.add(new Land(j, i));
            }
        }
    }

    @Override
    public String toString() {
        String ret = "";
        for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                if(i == human.getX() && j == human.getY()){
                    ret += human;
                } else if (i == goblin.getX() && j == goblin.getY()) {
                    ret += goblin;
                }
                else
                    ret += lands.get(i * dimension + j);
            }
            ret += "\n";
        }
        return ret;
    }

    public void move() {
        String space = "no";
        String direction;
        while(space.equals("no")) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter direction: ");
            direction = s.nextLine();
            space = checkforspeace(direction);
        }

    }

    public String checkforspeace(String s){
        int x = 0;
        switch(s){
            case "n":
                x = human.getX() - 1;
                if(x<0) {
                    System.out.println("out of dimension");
                    return "no";
                }
                else {
                    human.setX(human.getX() - 1);
                    return "yes";
                }
            case "s":
                x = human.getX() + 1;
                System.out.println("out of dimension");
                if(x>=dimension)
                    return "no";
                else {
                    human.setX(human.getX() + 1);
                    return "yes";
                }
            case "e":
                x = human.getY() + 1;
                System.out.println("out of dimension");
                if(x>=dimension)
                    return "no";
                else {
                    human.setY(human.getY() + 1);
                    return "yes";
                }
            case "w":
                x = human.getY() - 1;
                System.out.println("out of dimension");
                if(x<0)
                    return "no";
                else {
                    human.setY(human.getY() - 1);
                    return "yes";
                }
            }
            return "no";
        }
    }
