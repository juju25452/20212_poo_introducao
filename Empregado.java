public class Empregado {
    private String nome;
    private int idade;
    private int tipo;
    private double salario;
    private double bonus;

    public void setTipo (int Tipo);{
        this.tipo = tipo;
    }

    public int getTipo(){
        return this.tipo;
    }


    public double calculaSalario(){
        if (tipo ==1 ){
            return salario;
        }
        else if (tipo ==2){
            return salario + salario * comissao;
        }
        else if (tipo ==3){
            return salario + bonus;
        }
        return 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome (){
        return this.nome;
    }
    
    public void  setIdade (int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }
}