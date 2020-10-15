package com.school_phonedataplan;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        DataPlan DataPlan = new DataPlan();

        DataPlan.setPower(false);
        DataPlan.setMinutesLeft(0);
        DataPlan.setCredit(0);
        DataPlan.setInternetLeft(0);

        public float TopUp() {
            Scanner sc= new Scanner(System.in);
            System.out.print("How much do you wanna TopUp? --> ");
            float amount = sc.nextInt();
            DataPlan.setCredit(amount);

            return amount;
        }
        }
    }
}
