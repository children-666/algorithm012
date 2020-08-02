package Week_04;


public class LemonadeChange {
    public static void main(String[] args) {
        int[] bills = new int[]{5,5,5,10,20};
        System.out.println(Solution_lemonadeChange.lemonadeChange(bills));

    }
}

class Solution_lemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int[] money = new int[2];

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                money[0]++;
            } else if (bills[i] == 10) {
                money[0]--;
                money[1]++;
            } else {
                if (money[1] > 0) {
                    money[1]--;
                    money[0]--;
                } else {
                    money[0] -= 3;
                }
            }
            if (money[0] < 0) {
                return false;
            }
        }

        return true;
    }
}

