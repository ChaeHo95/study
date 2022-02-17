package test6_10_12.System;

import java.util.Random;

public class Sysyem {
    public boolean game() {
        Random rd = new Random();
        int count = 0;
        int[] rds = new int[3];
        for (int i = 0; i < 3; i++) {
            rds[i] = rd.nextInt(3)+1;
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d \t",rds[i]);
            if (i < 2 && rds[i + 1] == rds[i]) {
                count++;
            }
        }
        System.out.println();
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}
