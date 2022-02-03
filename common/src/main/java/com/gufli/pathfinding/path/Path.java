package com.gufli.pathfinding.path;

import com.gufli.pathfinding.astar.AStarGoal;

/**
 * An abstract plan returned by the {@link AStarGoal} that should be run until completion.
 */
public interface Path {

    boolean isFinished();

    void update(Agent agent);

}
