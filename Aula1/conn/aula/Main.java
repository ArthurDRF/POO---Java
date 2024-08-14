package conn.aula;

public class Main {
    public static void main(String[] args) {
        Aluno c = new Aluno();
        c.nome = "Bill";
        c.cpf = "9876543211";
        c.idade = "20";
        c.Mostrar();

        Aluno d = new Aluno();
        d.nome = "Bill";
        d.cpf = "1234567899";
        d.idade = "20";
        d.Mostrar();

        Aluno e = new Aluno();
        e.nome = "Leonardo";
        e.cpf = "5184988787";
        e.idade = "20";
        e.Mostrar();
    }
}
