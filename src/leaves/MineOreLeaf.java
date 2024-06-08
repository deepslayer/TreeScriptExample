package leaves;

import org.dreambot.api.script.frameworks.treebranch.Leaf;


public class MineOreLeaf extends Leaf {


    @Override
    public boolean isValid() {
       //e.ge if we are at the mining spot && has a pickaxe
        return true;
    }

    @Override
    public int onLoop() {
        //mining logic here
        return 600;
    }
}
