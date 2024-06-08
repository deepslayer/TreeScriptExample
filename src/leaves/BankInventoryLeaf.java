package leaves;

import org.dreambot.api.script.frameworks.treebranch.Leaf;


public class BankInventoryLeaf extends Leaf {


    @Override
    public boolean isValid() {
        //e.g. if our inventory is full
        return true;
    }

    @Override
    public int onLoop() {
        //Banking logic here
        return 600;
    }
}
