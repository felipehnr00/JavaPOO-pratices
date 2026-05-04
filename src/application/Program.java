package application;
import entities.Aluno;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Insira a primeira nota do aluno: ");
        double nota1 = sc.nextDouble();

        System.out.println("Insira a segunda nota do aluno: ");
        double nota2 = sc.nextDouble();

        System.out.println("Insira a terceira nota do aluno: ");
        double nota3 = sc.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
        System.out.println(aluno);

        sc.close();
    }
}
