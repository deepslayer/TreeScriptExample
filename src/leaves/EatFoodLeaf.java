package leaves;

import org.dreambot.api.methods.container.impl.Inventory;
import org.dreambot.api.methods.interactive.GameObjects;
import org.dreambot.api.methods.interactive.Players;
import org.dreambot.api.script.frameworks.treebranch.Leaf;
import org.dreambot.api.methods.map.Area;
import org.dreambot.api.wrappers.interactive.GameObject;
import org.dreambot.core.Instance;

import static org.dreambot.api.utilities.Logger.log;
import static org.dreambot.api.utilities.Sleep.sleepUntil;

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
