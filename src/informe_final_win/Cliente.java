
package informe_final_win;
 
public abstract class Cliente implements Clientela{
    String Nombres;
    String Apellidos;
    String dni;
    String distrito;
    String direccion;
    String tipocliente;
    String tipoPlan;

    public Cliente(String Nombres, String Apellidos, String dni, String distrito, String direccion, String tipocliente, String tipoPlan) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.dni = dni;
        this.distrito = distrito;
        this.direccion = direccion;
        this.tipocliente = tipocliente;
        this.tipoPlan = tipoPlan;
    }
   
    @Override
    public abstract double CalcularMontoInstalacion();
        
    @Override
    public abstract double CalcularMontoTotal();
        
}
