package lowBranch;
import leaves.BankInventoryLeaf;
import leaves.ChopTreeLeaf;
import org.dreambot.api.script.frameworks.treebranch.Branch;

public class WoodcuttingBranch extends Branch {

    public WoodcuttingBranch() {
        addLeaves(
                new BankInventoryLeaf(),
                new ChopTreeLeaf()
        );
    }

    @Override
    public boolean isValid() {
        //logic for choosing to train woodcutting, e.g we have an axe in the bank and dont have a pickaxe.
        return true;
    }

    @Override
    public int onLoop() {
        //no logic as this is a decision-making branch
        return super.onLoop();
    }
}
