
package informe_final_win;

/*Clase Padre:
  Atributos: Nombres, Apellidos, DNI, Distrito, Direccion y TipoCliente.
  Variables Privadas utilizar getNombreVariable() para usarlas.
  Implementar los 2 métodos de la interface y si se necesita usar otros metodos (de tipo funcion o procedimiennto) para
  realizar operaciones.
  Por ejemplo un metodo para hallar el descuento por el tipo de cliente.
  No te olvides del Metodo Constructor.
  El codigo de los metodos abstractos se hacen en las clases hijas..
  Por cierto ya puse los metodos de la interface para que no salga error xd.
*/
    
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