public class Elf extends WorkshopMember implements ChristmasCelebrator {
    private int skillLevel;
    private String elfType;

    public Elf(String name, String nickName, int age, int skillLevel, String elfType) {
        super(name, nickName, age);
        this.skillLevel = skillLevel;
        this.elfType = elfType;
    }

    public void makeToy() {
        System.out.println(getNickName() + " is making a toy.");
        increaseExperience();
    }

    public void wrapGifts() {
        System.out.println(getNickName() + " is wrapping gifts.");
        increaseExperience();
    }

    private void increaseExperience() {
        skillLevel++;
    }

    @Override
    public void celebrateChristmas() {
        System.out.println(getNickName() + " is celebrating Christmas!");
    }

    @Override
    public void hostChristmasParty() {
        System.out.println(getNickName() + " is hosting a Christmas party!");
    }
}
