
    package informe_final_win;

    /*Clase Hija 1:
      Si tienen atributos propios se inicializan.
      Hacer el codigo de los metodos abstractos heredados de la clase padre.
      Implementar metodos adicionales si se necesitan hacer operaciones (pueden ser del tipo funcion o procedimiento).
      Para usar los atributos de la clase usar el getNombreAtributo() ya que estos son variables privadas.
    */
    
    public class ClienteFiel extends Cliente{

        
        
    //Puse los metodos para que no salga error, tu trabajo es editarlos    
    @Override
    public double CalcularMontoInstalacion() {
       return 1.0;
    }

    @Override
    public double CalcularMontoTotal() {
       return 2.0;
    }
            
    }
