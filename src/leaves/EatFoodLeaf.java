package leaves;

import org.dreambot.api.script.frameworks.treebranch.Leaf;

public class EatFoodLeaf extends Leaf {


    @Override
    public boolean isValid() {
        //e.g. if our HP is below 5 etc.
        return true;
    }

    @Override
    public int onLoop() {
        //eating logic here
        return 600;
    }
}
