package highBranch;

import lowBranch.MeleeCowBranch;
import lowBranch.RangeCowBranch;
import org.dreambot.api.script.frameworks.treebranch.Branch;

import static org.dreambot.api.utilities.Logger.log;

public class CombatBranch extends Branch {

    public CombatBranch() {
        addLeaves(
                new MeleeCowBranch(),
                new RangeCowBranch()
        );
    }

    @Override
    public boolean isValid() {
        //always returns true since it is the only and highest level branch
        return true;
    }

    @Override
    public int onLoop() {
        return super.onLoop();
    }
}
