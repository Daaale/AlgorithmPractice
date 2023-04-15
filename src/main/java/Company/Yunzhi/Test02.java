package Company.Yunzhi;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Dale
 * @Date 2022/11/22 21:14
 * @Description
 */
public class Test02 {
    //员工信息
    public static class Employee {
        public int happy;

        public int pos;
        List<Employee> nexts;
        public Employee(int happy, int pos) {
            this.happy = happy;
            nexts = new ArrayList<>();
            this.pos = pos;
        }
    }

    public static class Info {
        public int laiMaxHappy;
        public int buMaxHappy;

        public Info(int laiMaxHappy, int buMaxHappy) {
            this.laiMaxHappy = laiMaxHappy;
            this.buMaxHappy = buMaxHappy;
        }
    }

    public static int maxHappy(int[][] paths, int[] happy, int root) {
        Employee boss = new Employee(happy[root], root);
        for (int i = 0; i < paths.length; i++) {
            int a = paths[i][0];
            int b = paths[i][1];
            generateTree(a, b, happy, boss);
        }
        return maxHappy(boss);
    }

    private static void generateTree(int a, int b, int[] happy, Employee boss) {
        //从boss中找到 a 表示的根结点
        Employee root = getRoot(a, boss);
        //在该节点中添加直属下级 b
        Employee employee = new Employee(happy[b], b);
        root.nexts.add(employee);
    }

    private static Employee getRoot(int a, Employee boss) {
        if (boss.pos == a) {
            return boss;
        } else {
            Employee res = null;
            if (boss.nexts.size() != 0) {
                for (int i = 0; i < boss.nexts.size(); i++) {
                    Employee temp = getRoot(a, boss.nexts.get(i));
                    if (temp != null) {
                        res = temp;
                    }
                }
            }
            return res;
        }
    }

    public static int maxHappy(Employee boss) {
        Info headInfo = process(boss);
        return Math.max(headInfo.buMaxHappy, headInfo.laiMaxHappy);
    }
    //返回两个信息：来的最大快乐值和不来的最大快乐值
    public static Info process(Employee x) {
        if (x.nexts.isEmpty()) {
            return new Info(x.happy, 0);
        }
        int lai = x.happy;
        int bu = 0;
        for (Employee next : x.nexts) {
            Info nextInfo = process(next);
            lai += nextInfo.buMaxHappy;
            bu += Math.max(nextInfo.laiMaxHappy, nextInfo.buMaxHappy);
        }
        return new Info(lai, bu);
    }
    //测试
    public static void main(String[] args) {
        int[][] paths = {{1,2},{1,3},{3,4},{1,5}};
        int[] happy = {0,5,1,1,10,70};
        int root = 1;
        int res = maxHappy(paths, happy, root);
        System.out.println(res);
    }
}
