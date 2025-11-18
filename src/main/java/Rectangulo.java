public class Rectangulo {
    public int longitud;
    public int ancho;

    public Rectangulo(){
        longitud =1;
        ancho=1;

    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        if  (longitud>0&&longitud<20){
            this.longitud = longitud;
        }

    }


    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if (longitud>0&&longitud<20){
        this.ancho = ancho;
    }
    }
}
