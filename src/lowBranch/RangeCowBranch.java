package lowBranch;
import leaves.AttackCowRangeLeaf;
import leaves.EatFoodLeaf;

import org.dreambot.api.script.frameworks.treebranch.Branch;

import static org.dreambot.api.utilities.Logger.log;

public class RangeCowBranch extends Branch {

    public RangeCowBranch() {
        addLeaves(
                new EatFoodLeaf(),
                new AttackCowRangeLeaf()
        );
    }

    @Override
    public boolean isValid() {
        //logic for choosing to range the cow, e.g. we have a bow and ammo, but no sword etc.
        return true;
    }

    @Override
    public int onLoop() {
        //no logic as this is a decision making branch
        return super.onLoop();
    }
}
