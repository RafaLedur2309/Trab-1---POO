abstract class Cliente{
    private int numero;
    private String nome;
    private String email;

    public Cliente(int numero, String nome, String email){
       this.numero = numero;
       this.nome = nome;
       this.email = email;
    }
    public abstract String descrever(){
        
    }
}

