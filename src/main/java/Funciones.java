public class Funciones {

    public String getNombre(String nombre){
        String result = "";
        if (nombre.equals("")){
            result = null;
        }else{
            result = nombre;
        }
        return result;
   }

    public boolean anioValido(int anio){
        if (anio>0 && anio<=2021)
            return true;
        else
            return false;
    }

    public int convertirFloatAEntero(float numero){

        return Math.round(numero);

    }
}