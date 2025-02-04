import java.util.Scanner;


public class coverwater {
    /**
     * @param args
     */
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); 
        while (t-- > 0) {
            int n = scanner.nextInt();
            scanner.nextLine(); 
            String name = scanner.nextLine();
            int cnt = 0;
            int ans = 0;
            boolean isThree = false;
            for (char ch : name.toCharArray()) {
                if (ch == '.') {
                    cnt++;
                    ans++;
                } else {
                    cnt = 0;
                }
                if (cnt == 3) {
                    isThree = true;
                    break;
                }
            }
            if (isThree) {
                System.out.println(2);
            } else {
                System.out.println(ans);
            }
        }
    }
}