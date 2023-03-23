import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String[]letter=new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "};
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]numbers=new int[n];
        for (int i=0; i<numbers.length; i++){
            numbers[i]=Integer.parseInt(scanner.next());

        }
        int w=0;
        System.out.print(letter[(stepen(numbers[0]))]);
        for (int i=1; i<numbers.length; i++) {
            w=Math.abs(numbers[i]-numbers[i-1]);
            int position=stepen(w);
            System.out.print(letter[position]);
        }

    }
    static int stepen(int a){
        if(a==1){
            return 0;
        }
     int i=0;
        for(; a>1;i++){
            a=a/2;

        }

        return i;
    }
}
