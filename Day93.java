public class conoh {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                if (j == n - 1 - i || j == n - 1 + i) {
                    System.out.print("*");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
        }
        }
