package units;

public abstract class Unit {
    protected Integer hitPoints;
    protected Integer armorValue;
    protected Integer manaPoints;
    protected Integer strengthPoints;
    protected String unitName;
    protected String range;
    protected boolean side;     //enemy or ally

    //TODO write a constructor for every variable


    /**
     * This abstract function will help us forcing the child classes to have it.
     * We want every Unit to have a skill.
     */
    public abstract void useSkill();
    //TODO this function will be implemented in the child classes(abstract function)


    @Override
    public String toString() {
        return unitName;
    }
}
