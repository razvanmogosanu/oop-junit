package units;

public class Warrior extends Unit {
    //TODO here, you will need a constructor, matching super(Unit)
    public Warrior(){
        super();    // you're not done, yet, this is an empty constructor that doesnt initialize any parameter
        unitName = "Warrior";
    }
    //use this constructor as an example for the rest units






    /**
     * Here you have to implement your useSkill function.
     * Code freely
     * An idea, might be to check all the enemy units that are in your unit range and do damage to them
     * or to heal all your unit's allies or like, everything you want
     */
    @Override
    public void useSkill() {

    }

    //TODO you might want to write some getters/setter, just in case you need them later, in other classes


}
