import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("digite seu primeiro nome:");
String nome = sc.next();

System.out.println("digite seu sobre nome");
  String sobrenome = sc.next();

System.out.println(" Seu nome completo é:" + nome +" " + sobrenome);
    
  sc.close();
  }
}