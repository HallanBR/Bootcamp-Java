package entities;

public class Alugado {
    
    private String nome;
    private String email;

    public Alugado(){   
    }

    public Alugado(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public void setName(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nome + ", " + email;
    }


    
}
