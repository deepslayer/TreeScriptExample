package leaves;

import org.dreambot.api.methods.interactive.NPCs;
import org.dreambot.api.methods.interactive.Players;
import org.dreambot.api.methods.skills.Skills;
import org.dreambot.api.script.frameworks.treebranch.Leaf;
import org.dreambot.api.methods.map.Area;
import org.dreambot.api.methods.skills.Skill;
import org.dreambot.api.wrappers.interactive.NPC;

import static org.dreambot.api.utilities.Logger.log;
import static org.dreambot.api.utilities.Sleep.sleepUntil;

public class AttackCowRangeLeaf extends Leaf {


    @Override
    public boolean isValid() {
        //e.g. if we have 10 or more hp and we have our bow etc.
        return true;
    }

    @Override
    public int onLoop() {
        //Attack with range logic here
        return 600;
    }
}
