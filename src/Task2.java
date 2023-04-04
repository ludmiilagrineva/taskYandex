import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        String[] field = new String[i1];
        for (int i = 0; i < i1; i++) {
            StringBuilder sb = new StringBuilder(scanner.next());
            sb.reverse();
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == '/') {
                    sb.replace(j, j + 1, "\\");
                    continue;
                }
                if (sb.charAt(j) == '\\') {
                    sb.replace(j, j + 1, "/");
                    continue;
                }
            }
            field[i]=sb.toString();

        }
        String str=new String();
        for (int i=0; i<field.length/2; i++){
            str=field[field.length-1-i];
            field[field.length-1-i]=field[i];
            field[i]=str;
        }

for (int i=0; i<field.length;i++){
    System.out.println(field[i]);
}
    }
}

