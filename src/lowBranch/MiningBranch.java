package lowBranch;

import leaves.BankInventoryLeaf;

import leaves.MineOreLeaf;
import org.dreambot.api.script.frameworks.treebranch.Branch;

public class MiningBranch extends Branch {

    public MiningBranch() {
        addLeaves(
                new MineOreLeaf(),
                new BankInventoryLeaf()
        );
    }

    @Override
    public boolean isValid() {
        //logic for choosing the mining skills, e.g. we have a pickaxe but dont have an axe
        return true;
    }

    @Override
    public int onLoop() {
        //no doing logic since this is a branch for decision-making
        return super.onLoop();
    }
}
