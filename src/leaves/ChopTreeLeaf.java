package leaves;

import org.dreambot.api.script.frameworks.treebranch.Leaf;

public class ChopTreeLeaf extends Leaf {


    @Override
    public boolean isValid() {
        //e.g. if we are at the tree area and have an axe etc
        return true;
    }

    @Override
    public int onLoop() {
        //chopping logic here
        return 600;
    }
}
