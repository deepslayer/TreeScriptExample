# TreeScriptExample


This repository demonstrates a hierarchical tree structure for scripting in DreamBot, an Old School RuneScape botting framework. The project showcases a Tree Branch Leaf framework that organizes bot tasks into a tree structure for better modularity and scalability.

## Project Structure

The project is divided into packages that represent different levels of the tree hierarchy: high-level branches, low-level branches, and leaves.


### Packages and Classes

#### `highBranch`

- **CombatBranch.java**: This class represents a high-level branch in the tree structure. It contains logic for combat-related tasks and aggregates lower-level branches like `MeleeCowBranch` and `RangeCowBranch`.

#### `leaves`

- **AttackCowMeleeLeaf.java**: This leaf class handles the logic for attacking cows using melee combat.
- **AttackCowRangeLeaf.java**: This leaf class handles the logic for attacking cows using ranged combat.
- **EatFoodLeaf.java**: This leaf class handles the logic for eating food when the player's health is low.

#### `lowBranch`

- **MeleeCowBranch.java**: This branch class checks if the player has a sword equipped and contains leaves that handle eating food and attacking cows with melee.
- **RangeCowBranch.java**: This branch class checks if the player has a bow equipped and contains leaves that handle eating food and attacking cows with ranged weapons.

#### `myscript`

- **MyTreeScript.java**: The main script class that initializes the tree structure and starts the script. It contains the root node and adds the top-level branches to it.

## Framework Overview

The DreamBot Tree Branch Leaf framework is a hierarchical system where tasks are organized into a tree structure with a root node, branches, and leaves. Here's how the framework works:

1. **TreeScript**: The main class that initializes the tree structure and starts the script. It contains the root node.
2. **Root**: The top-level node that contains branches.
3. **Branches**: Intermediate nodes that contain other branches or leaves.
4. **Leaves**: The executable actions or tasks.

### Execution Flow

1. The `TreeScript` class initializes the root node and adds top-level branches.
2. Each branch's `isValid()` method determines if it should be executed.
3. If a branch is valid, it iterates through its leaves to find a valid leaf.
4. The first valid leaf's `onLoop()` method is executed.

### Example Usage

The following example demonstrates how to set up and start the script:

```java
package myscript;

import com.example.myscript.highbranch.CombatBranch;
import org.dreambot.api.script.frameworks.treebranch.TreeScript;

public class MyTreeScript extends TreeScript {

    @Override
    public void onStart() {
        // Initialize the root and add branches to it
        getRoot().addBranches(
            new CombatBranch()
            // Add other branches here
        );
    }
    
    @Override
    public int onLoop() {
        return getRoot().onLoop();
    }
}
