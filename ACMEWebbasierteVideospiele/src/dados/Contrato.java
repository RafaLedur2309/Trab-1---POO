public class Contrato{
    private int id;
    private int periodo;
    private Cliente cliente;


    public Contrato(int id, int periodo, Cliente cliente) {
        this.id = id;
        this.periodo = periodo;
        this.cliente = cliente;
    }
    
}