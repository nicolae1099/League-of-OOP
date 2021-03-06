package angels;

public class AngelFactory {

    public final Angel getInstance(final String typeOfAngel) {
        if (typeOfAngel.equals("DamageAngel")) {
            return new DamageAngel();
        } else if (typeOfAngel.equals("DarkAngel")) {
            return new DarkAngel();
        } else if (typeOfAngel.equals("Dracula")) {
            return new Dracula();
        } else if (typeOfAngel.equals("GoodBoy")) {
            return new GoodBoy();
        } else if (typeOfAngel.equals("LevelUpAngel")) {
            return new LevelUpAngel();
        } else if (typeOfAngel.equals("LifeGiver")) {
            return new LifeGiver();
        } else if (typeOfAngel.equals("SmallAngel")) {
            return new SmallAngel();
        } else if (typeOfAngel.equals("Spawner")) {
            return new Spawner();
        } else if (typeOfAngel.equals("TheDoomer")) {
            return new TheDoomer();
        } else if (typeOfAngel.equals("XPAngel")) {
            return new XPAngel();
        } else {
            System.out.println("Unknown type of angel");
        }
        return null;
    }
}
