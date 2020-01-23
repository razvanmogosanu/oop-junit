import org.junit.Test;
import units.Ranger;
import units.Warrior;

import static junit.framework.TestCase.fail;

public class Testing {
    @Test
    private void checkConstructors(){
        try{
            Warrior warrior = new Warrior();
        }catch(Exception e){

        }
    }

    @Test
    private void checkAdd() {
        Army army = new Army();

        if (army.getArmy() == null) {
            fail("Maybe you forgot to initialize the army list");
        }

        try {
            army.addUnit(new Warrior());
            if (!(army.getArmy().get(0) instanceof Warrior)) {
                fail("checkAdd is wrong");
                return;
            }

            army.addUnit(new Ranger());
            if (!(army.getArmy().get(1) instanceof Ranger)) {
                fail("checkAdd is wrong");
                return;
            }
        } catch(Exception e){
            fail("checkAdd is wrong");
        }

        System.out.println("Congrats, you're good");
    }

}
