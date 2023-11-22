public class Medic extends Hero {

    private int healPoints;

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность Healing");
    }

    public void increaseExperience() {
        healPoints += healPoints * 0.10;
    }
}
