import java.util.ArrayList;
import java.util.List;

public class Snowman {
    private double height;
    private String hatColor;
    private boolean isMagical;
    private List<String> accessories;

    public Snowman(double height, String hatColor) {
        this.height = height;
        this.hatColor = hatColor;
        this.isMagical = false;
        this.accessories = new ArrayList<>();
    }

    public void decorate(String accessory) {
        accessories.add(accessory);
        System.out.println("Added " + accessory + " to the Snowman.");
    }

    public void melt() {
        if (height > 0) {
            height /= 2;
            if (height < 1) height = 0;
        }
    }

    public void makeMagical() {
        isMagical = true;
    }
}

