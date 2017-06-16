import static java.lang.Math.pow;
public class Main {
    public static void main(String[] args) {
        int sum = 0;
            for (int h = 0; h <= 9; h++) {
                for (int i = 0; i <= 9; i++) {
                    for (int j = 0; j <= 9; j++) {
                        for (int k = 0; k <= 9; k++) {
                            for (int l = 0; l <= 9; l++) {
                                for (int m = 0; m <= 9; m++) {
                                    int num = 100000*h + 10000 * i + 1000 * j + 100 * k + 10 * l + m;
                                    if (pow(h, 5) + pow(i, 5) + pow(j, 5) + pow(k, 5) + pow(l, 5) + pow(m, 5) == num) {
                                        sum += num;
                                        System.out.print("num: ");
                                        System.out.println(num);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        System.out.println(sum);
    }
}
