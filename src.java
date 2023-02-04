import java.util.Scanner;
public class Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por Favor, insira seu nome");
        String name = sc.nextLine();
        System.out.println("Seu nome não consta em nossos arquivos, " + name);
    }
}
