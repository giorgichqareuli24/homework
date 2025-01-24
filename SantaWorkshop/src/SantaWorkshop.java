public class SantaWorkshop {
    public static void main(String[] args) {

        Elf elf1 = new Elf("Buddy", "Elf1", 120, 5, "Toy Maker");
        elf1.makeToy();
        elf1.wrapGifts();


        Reindeer rudolph = new Reindeer("Rudolph", "Red Nose", 5, 60, "Red");
        rudolph.fly();
        System.out.println("Fitness Level: " + rudolph.checkFitnessLevel());


        Child child1 = new Child("Timmy", 7);
        child1.addWish("Toy Car");

        Santa santa = new Santa("Santa Claus", "Big Red", 300);
        santa.deliverGifts();


        Snowman snowman = new Snowman(5, "Blue");
        snowman.decorate("Scarf");
        snowman.melt();
    }
}
