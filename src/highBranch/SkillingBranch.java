package highBranch;

import lowBranch.MiningBranch;
import lowBranch.WoodcuttingBranch;
import org.dreambot.api.script.frameworks.treebranch.Branch;


public class SkillingBranch extends Branch {

    public SkillingBranch() {
        addLeaves(
                new WoodcuttingBranch(),
                new MiningBranch()
        );
    }

    @Override
    public boolean isValid() {
        //logic for choosing skilling, e,g if my skills are below 30, then do skilling, else return false;
        return true;
    }

    @Override
    public int onLoop() {
        return super.onLoop();
    }
}
