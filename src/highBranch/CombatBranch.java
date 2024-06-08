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
        //logic here for choosing to do combat related task, for example if my combat is below 30, return true
        return true;
    }

    @Override
    public int onLoop() {
        return super.onLoop();
    }
}
