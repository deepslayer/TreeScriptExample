package lowBranch;

import leaves.AttackCowMeleeLeaf;
import leaves.EatFoodLeaf;
import org.dreambot.api.script.frameworks.treebranch.Branch;

import static org.dreambot.api.utilities.Logger.log;

public class MeleeCowBranch extends Branch {

    public MeleeCowBranch() {
        addLeaves(
                new EatFoodLeaf(),
                new AttackCowMeleeLeaf()
        );
    }

    @Override
    public boolean isValid() {
            //logic for choosing to melee the cow, we have a sword and dont have a bow for example.
        return true;
    }

    @Override
    public int onLoop() {
        //no doing logic since this is a branch
        return super.onLoop();
    }
}
