package myscript;

import highBranch.CombatBranch;
import highBranch.SkillingBranch;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.script.frameworks.treebranch.TreeScript;
import org.dreambot.api.script.frameworks.treebranch.Root;

@ScriptManifest(category = Category.UTILITY, name = "TreebranchMotherFucker", author = "", version = 0.0)
public class MyTreeScript extends TreeScript {

    @Override
    public void onStart() {
        Root root = getRoot();
        root.addBranches(new CombatBranch(), new SkillingBranch());
    }

    @Override
    public int onLoop() {
        return getRoot().onLoop();
    }
}
