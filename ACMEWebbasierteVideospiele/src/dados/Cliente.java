abstract class Cliente{
    private int numero;
    private String nome;
    private String email;
    Contrato contrato;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contrato getContrato() {
        return this.contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
    public boolean verify(int num){
        Cliente cliente;
        if(cliente.num = num){
            return false;
        }
        else{
            return true;
        }
    }
    
}

