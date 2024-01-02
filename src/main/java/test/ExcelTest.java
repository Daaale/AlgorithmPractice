package test;

import com.sun.jdi.PathSearchingVirtualMachine;

public class ExcelTest {
    public static void main(String[] args) {
        String file1 = ExcelTest.class.getResource("").getFile();
        System.out.println(file1);
    }
}
