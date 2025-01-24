public class Reindeer extends WorkshopMember {
    private int flyingSpeed;
    private String noseColor;

    public Reindeer(String name, String nickName, int age, int flyingSpeed, String noseColor) {
        super(name, nickName, age);
        this.flyingSpeed = flyingSpeed;
        this.noseColor = noseColor;
    }

    public void fly() {
        System.out.println(getNickName() + " is flying at " + flyingSpeed + " speed!");
    }

    public void trainForChristmas() {
        System.out.println(getNickName() + " is training for Christmas.");
    }

    public char checkFitnessLevel() {
        if (flyingSpeed > 50 && getAge() < 10) {
            return 'A';
        } else if (flyingSpeed > 40) {
            return 'B';
        } else if (flyingSpeed > 30) {
            return 'C';
        } else {
            return 'D';
        }
    }
}

