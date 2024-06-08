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

public class AttackCowMeleeLeaf extends Leaf {



    @Override
    public boolean isValid() {
        //e.g. if our hitpoints is above 10 and we have our sword etc etc
        return true;
    }

    @Override
    public int onLoop() {
       //Attack cow melee logic here
        return 600;
    }
}
