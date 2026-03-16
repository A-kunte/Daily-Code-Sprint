public class PathFinder {
    static int N = 4;

    static boolean isSafe(int[][] maze, int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }

    static boolean solveMaze(int[][] maze, int x, int y, int[][] solution) {
        if (x == N - 1 && y == N - 1) {
            solution[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y)) {
            solution[x][y] = 1;

            if (solveMaze(maze, x + 1, y, solution))
                return true;

            if (solveMaze(maze, x, y + 1, solution))
                return true;
            solution[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };

        int[][] solution = new int[N][N];

        System.out.println("--- 🧭 Day 30: Pathfinding Logic ---");
        if (solveMaze(maze, 0, 0, solution)) {
            System.out.println("✅ Path Found:");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(solution[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("❌ No path exists.");
        }
    }
}