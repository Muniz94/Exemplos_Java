import java.util.Scanner;
public class Fatorial
{
public static int questao(int n) {
if ((n == 0) || (n == 1))
return 1;
else
return n * questao(n - 1);
}
public static void main(String[] args) {
System.out.print("digite um valor: ");
Scanner scan = new Scanner(System.in);
int valor = scan.nextInt();
System.out.println("Resultado: " + valor + " é " +
questao(valor));
scan.close();
}
}
