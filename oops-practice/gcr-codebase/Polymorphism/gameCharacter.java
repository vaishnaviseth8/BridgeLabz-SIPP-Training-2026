class GameCharacter {
    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    void performAttack() {
        System.out.println(characterName + " attacks.");
    }
}

class Warrior extends GameCharacter {
    Warrior(String characterName) {
        super(characterName);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " swings a sword.");
    }
}

class Mage extends GameCharacter {
    Mage(String characterName) {
        super(characterName);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " casts a spell.");
    }
}

class Archer extends GameCharacter {
    Archer(String characterName) {
        super(characterName);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " shoots an arrow.");
    }
}

public class AdventureGame {
    static void startBattle(GameCharacter[] characters) {
        for (GameCharacter character : characters) {
            character.performAttack();
        }
    }

    public static void main(String[] args) {
        GameCharacter[] characters = {
                new Warrior("Aragorn"),
                new Mage("Gandalf"),
                new Archer("Legolas"),
                new Warrior("Thor"),
                new Mage("Merlin")
        };

        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;

        for (GameCharacter character : characters) {
            if (character instanceof Warrior)
                warriorCount++;
            else if (character instanceof Mage)
                mageCount++;
            else if (character instanceof Archer)
                archerCount++;
        }

        startBattle(characters);

        System.out.println("Warriors: " + warriorCount);
        System.out.println("Mages: " + mageCount);
        System.out.println("Archers: " + archerCount);
    }
}