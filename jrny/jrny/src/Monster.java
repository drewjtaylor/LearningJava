import java.util.HashMap;

public class Monster {
    private String name;
    private HashMap<String, Double> statBlock;

    public Monster(String name, Double hp, Double attack, Double defense) {
        this.name = name;
        statBlock = new HashMap<>();
        statBlock.put("HP", hp);
        statBlock.put("Attack", attack);
        statBlock.put("Defense", defense);
    }

    public void printStats() {
        System.out.printf("The %s's HP is %.0f, Attack is %.0f, and Defense is %.0f%n",
                          this.name,
                          statBlock.get("HP"), 
                          statBlock.get("Attack"), 
                          statBlock.get("Defense"));
    }

    public void changeHealth(Double hpChange) {
        statBlock.put("HP", statBlock.get("HP")-hpChange);
        System.out.printf("The %s took %.0f damage. It is now at %.0f health",
            this.name,
            hpChange,
            statBlock.get("HP")
        );
    }

    // public static void main(String[] args) {
    //     Monster monster = new Monster("Goblin", 50.0, 8.0, 1.0);
    //     monster.printStats();
    // }
}