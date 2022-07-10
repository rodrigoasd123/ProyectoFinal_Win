
package informe_final_win;

/*Clase Hija 1:
  Si tienen atributos propios se inicializan.
  Hacer el codigo de los metodos abstractos heredados de la clase padre.
  Implementar metodos adicionales si se necesitan hacer operaciones (pueden ser del tipo funcion o procedimiento).
  Para usar los atributos de la clase usar el getNombreAtributo() ya que estos son variables privadas.
*/
    
public class ClienteFiel extends Cliente{

    public ClienteFiel(String Nombres, String Apellidos, String dni, String distrito, String direccion, String tipocliente, 
            String tipoPlan) {
        super(Nombres, Apellidos, dni, distrito, direccion, tipocliente, tipoPlan);
    }

    public double CalcularDescuentoInstalacion(){
        return 120*0.3;
    }

    @Override 
    public double CalcularMontoInstalacion(){ 
        return 120-CalcularDescuentoInstalacion();
    }

    public double CalcularDescuentoPlan(){
        if(tipoPlan.equals("100 mbps"))
           return 79*0.95;
        if(tipoPlan.equals("200 mbps"))
           return 99*0.9;
        if(tipoPlan.equals("600 mbps"))
           return 169*0.85;
        if(tipoPlan.equals("600 mbps Plus"))
           return 259*0.80;
        if(tipoPlan.equals("1000 mbps"))
           return 459*0.75;
        return 0;
    }

    @Override
    public double CalcularMontoTotal(){
        return CalcularMontoInstalacion()+CalcularDescuentoPlan();
    }
            
}
