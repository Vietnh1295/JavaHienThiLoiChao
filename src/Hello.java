import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.print("Moi nhap ten ");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.print("Hello : " +name);
    }
}
