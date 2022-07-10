
package informe_final_win;
    
    /*Clase Hija 2:
      Si tienen atributos propios se inicializan.
      Hacer el codigo de los metodos abstractos heredados de la clase padre.
      Implementar metodos adicionales si se necesitan hacer operaciones (pueden ser del tipo funcion o procedimiento).
      Para usar los atributos de la clase usar el getNombreAtributo() ya que estos son variables privadas.
    */

public class ClienteNuevo extends Cliente{

    public ClienteNuevo(String Nombres, String Apellidos, String dni, String distrito, String direccion, String tipocliente, 
            String tipoPlan) {
        super(Nombres, Apellidos, dni, distrito, direccion, tipocliente, tipoPlan);
    }
    
    //Puse los metodos para que no salga error, tu trabajo es editarlos    
    
    @Override 
    public double CalcularMontoInstalacion(){ 
        return 120;
    }
    
    public double CalcularPlan(){
        if(tipoPlan.equals("100 mbps"))
           return 79;
        if(tipoPlan.equals("200 mbps"))
           return 99;
        if(tipoPlan.equals("600 mbps"))
           return 169;
        if(tipoPlan.equals("600 mbps Plus"))
           return 259;
        if(tipoPlan.equals("1000 mbps"))
           return 459;
        else return 0;
    }
    
    @Override
    public double CalcularMontoTotal(){
        return CalcularMontoInstalacion()+CalcularPlan();
    }
                  
}