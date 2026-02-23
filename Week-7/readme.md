# 📘 LeetCode Submissions

---
**Problem 1: _[1091. Shortest Path in Binary Matrix]_**
   🔗 Submission Link: https://leetcode.com/problems/shortest-path-in-binary-matrix/submissions/1928379576/

   Shortest Path in Binary Matrix (BFS)

Goal:
Find the minimum number of steps to go from the top-left cell to the bottom-right cell, moving only through cells with value 0 (you can move in 8 directions).

✅ Step-by-step Approach (BFS)

Check the start cell
If grid[0][0] is 1, the start is blocked. Return -1.

Define all possible moves
Prepare the 8 directions (up, down, left, right, and diagonals).

Initialize a queue
Push the starting cell (0, 0) into the queue.

Mark the start as visited
Set grid[0][0] = 1 so you don’t visit it again.

Track distance (steps)
Initialize steps = 1 because the starting cell counts as the first step.

Run BFS level by level
While the queue is not empty:

Process all nodes in the current level.

For each cell, try moving in all 8 directions.

If the next cell is inside the grid and its value is 0, add it to the queue and mark it visited.

Stop when destination is reached
If you reach (m-1, n-1), return steps.
This is the shortest path because BFS explores in increasing distance order.

If the queue becomes empty
That means there is no valid path. Return -1.

**Problem 2: _[1971. Find if Path Exists in Graph]_**  
   🔗 Submission Link: https://leetcode.com/problems/find-if-path-exists-in-graph/submissions/1928397966/
Build the graph
Convert the edge list into an adjacency list so you can quickly find neighbors of each node.

Create a visited array
This prevents revisiting nodes and getting stuck in cycles.

Start DFS from the source node
Call dfs(source).

Base case
If the current node is the destination, return true.

Skip already visited nodes
If the current node is already visited, return false.

Visit neighbors recursively
For each neighbor of the current node, run DFS.
If any recursive call returns true, propagate true upward.

If all neighbors are explored and none reaches destination
Return false.

 **Problem 3: _[733. Flood Fill]_**  
   🔗 Submission Link: https://leetcode.com/problems/flood-fill/submissions/1928406797/
Step 1: Note the starting color

Store oldColor = image[sr][sc].

This is the color you want to replace.

Step 2: Handle the easy exit case

If oldColor == newColor, return the image as it is.

Otherwise, you might loop without changing anything.

 Step 3: Choose traversal method

Use DFS (recursion) or BFS (queue) to visit connected cells.

You can move in 4 directions: up, down, left, right.

 Step 4: Recolor the starting cell

Change image[sr][sc] = newColor.

This also marks it as visited.

Step 5: Visit neighbors

For the current cell:

Check its 4 neighbors.

If a neighbor is inside the grid and has oldColor,
recolor it and continue the traversal from there.

 Step 6: Continue until no more cells match

The process ends when all connected cells with oldColor are recolored.


**Problem 4: _[841. Keys and Rooms]_** 
 🔗 Submission Link:

 
Simple Step-by-step Approach (DFS / BFS)

Create a visited array of size n.

Start DFS/BFS from room 0.

Mark room 0 as visited.

For every key found, go to that room if not visited.

After traversal, check if all rooms are visited.

If yes, return true; otherwise, return false.
---
