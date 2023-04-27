package Company.LeetCode.daily;

import java.util.Arrays;

/**
 * @author Dale
 * @create 2022-11-26 16:50
 * @description
 */
public class Test0882 {
    // ACM中常用的无穷大常量——0x3f3f3f3f
    // 十进制是1061109567，是10^9级别的，而一般场合下的数据都是小于10^9的
    // 所以它可以作为无穷大使用而不致出现数据大于无穷大的情形

    //节点数
    static int N = 3010, INF = 0x3f3f3f3f;
    //图矩阵
    static int[][] g = new int[N][N];
    //距离
    static int[] dist = new int[N];
    //是否访问过
    static boolean[] vis = new boolean[N];

    public static void main(String[] args) {
        int[][] edges = {{0, 1, 10}, {0, 2, 1}, {1, 2, 2}};
        int maxMoves = 6;
        int n = 3;
        int res = reachableNodes(edges, maxMoves, n);
        System.out.println(res);
    }

    public static int reachableNodes(int[][] edges, int maxMoves, int n) {
        // 建图---初始化
        // 1.刚开始所有结点都是互相无法到达
        for (int i = 0; i < n; i++) {
            Arrays.fill(g[i], INF);
        }
        // 2.根据edges数组中找到可以到达的结点，并初始化距离
        for (int[] info : edges) {
            int a = info[0], b = info[1], c = info[2] + 1;
            g[a][b] = g[b][a] = c;
        }
        // 朴素 Dijkstra
        // 初始化距离都是无法达到
        Arrays.fill(dist, INF);
        // 初始化全部节点未访问
        Arrays.fill(vis, false);
        dist[0] = 0;
        for (int i = 0; i < n; i++) {
            // 1.将第 i 个节点添加到最短路径中
            int t = -1;
            // 2.找一个能够访问到的，距离最小的结点
            for (int j = 0; j < n; j++) {
                if (!vis[j] && (t == -1 || dist[j] < dist[t])) t = j;
            }
            // 3.该节点设置为已访问过
            vis[t] = true;
            // 4.更新所有结点的距离
            for (int j = 0; j < n; j++) {
                dist[j] = Math.min(dist[j], dist[t] + g[t][j]);
            }
        }
        // 统计答案
        int ans = 0;
        // 1.统计大节点数
        for (int i = 0; i < n; i++) {
            if (dist[i] <= maxMoves) ans++;
        }
        // 2.统计内部小节点数量，有多少条边就要统计多少次
        for (int[] info : edges) {
            int a = info[0], b = info[1], c = info[2];
            // 统计从 a 结点开始最多能访问多少结点
            // 统计从 b 结点开始最多能访问多少结点
            int c1 = Math.max(0, maxMoves - dist[a]), c2 = Math.max(0, maxMoves - dist[b]);
            // 看两个结果相加是否大于 a b 之间的距离，取其中的较小值
            ans += Math.min(c, c1 + c2);
        }
        return ans;
    }
}
