import java.util.*;

public class modernArt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt(), N = input.nextInt(), K = input.nextInt();
        int[] list = new int[M * N];
        for (int i = 0; i < M * N; i++) list[i] = 0;
        input.nextLine();
        String[] effects = new String[K];
        for (int i = 0; i < K; i++)
            effects[i] = input.nextLine();
        int numOfGs = 0;
        for (String k : effects) {
            int number = Integer.parseInt(k.substring(2)) - 1;
            if (k.charAt(0) == 'R') {
                for (int i = 0; i < N; i++) {
                    if (list[(number * N) + i] == 1) {
                        list[(number * N) + i] = 0; numOfGs--;
                    } else {
                        list[(number * N) + i] = 1; numOfGs++;
                    }
                }
            } else {
                for (int i = 0; i < M; i++) {
                    if (list[(N * i) + number] == 1) {
                        list[(N * i) + number] = 0; numOfGs--;
                    } else {
                        list[(N * i) + number] = 1; numOfGs++;
                    }
                }
            }
        }
        System.out.println(numOfGs);
        input.close();
    }
}