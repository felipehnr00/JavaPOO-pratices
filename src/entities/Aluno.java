package entities;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public boolean passou() {
        return notaFinal() >= 60;
    }

    public double pontosFaltantes() {
        if (passou()) {
            return 0;
        }
        else {
            return 60 - notaFinal();
        }
    }

    public String toString() {
        String msg = "FINAL GRADE = " + notaFinal() + "\n";

        if (passou()) {
            msg += "PASS";
        } else {
            msg += "FAILED\n";
            msg += "MISSING " + pontosFaltantes() + " POINTS";
        }
        return msg;
    }
}
