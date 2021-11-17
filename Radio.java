import java.util.ArrayList;
//Interfeces 
// En función de los tipos de radio (A,C y S) desarrolla su función específica para el tipo de radio.
interface ModoTelefono{
    String especialTelefono();
    String toString();
    String toString2();
}
// En función de los tipos de radio (A, C yS) desarrolla su función específica para el tipo de radio.
interface ModoProductividad{
    String especialProd();
}

//Atributos
public abstract class Radio implements ModoTelefono, ModoProductividad{
    protected int vol; 
    protected final int cambioVol =1;
    protected boolean frecuencia;
    protected ArrayList<String> Emisoras = new ArrayList<String>();
    protected ArrayList<String[]> playList1 = new ArrayList<String[]>();
    protected ArrayList<String[]> playList2 = new ArrayList<String[]>();
    protected ArrayList<String[]> playList3 = new ArrayList<String[]>();
    protected String[] cancionActual;
    protected ArrayList<String[]> playListActual = new ArrayList<String[]>();
    //Almacena si el telefono está conectado o no
    protected boolean conecTelefono;
    // Arreglo que contiene la lista de contactos de cada radio.
    protected ArrayList<String[]> agenda = new ArrayList<String[]>();
    // Determina si hay una llamada en curso o no
    protected boolean enLlamada;
     //  Almacena al último contacto que se llamó
    protected String[] UltimoContacto = new String[2];



    
//Métodos
// Almacena todas las emisoras que se vayan a guardar
    public ArrayList<String> getEmisoras() {
        return Emisoras;
    }
//Permite guardar una nueva emisora
    public void setEmisora(String nuevaEmisora) {
        Emisoras.add(nuevaEmisora);
    }
//Devuelve si la frecuencia es AM o FM
    public String getFrecuencia(){
        String frec = "";
        if(frecuencia == true){
            frec = "FM";
        }else if(frecuencia == false){
            frec = "AM";
        }

        return frec;
    }
//Cambia el valor de la frecuencia de AM a FM o viceversa. 
    public void setFrecuencia() {
        if(frecuencia == true){
            frecuencia = false;
        }else if(frecuencia == false){
            frecuencia = true;
        }
    }
// Almacena las canciones para la playlist 1
    public ArrayList<String[]> getPlayList1() {
        return playList1;
    }
// Almacena las canciones para la playlist 2
    public ArrayList<String[]> getPlayList2() {
        return playList2;
    }
// Almacena las canciones para la playlist 3
    public ArrayList<String[]> getPlayList3() {
        return playList3;
    }
//Permite cambiar la canción que se está reproduciendo
    public void setCancionActual(String[] nuevaCancion) {
        cancionActual = nuevaCancion;
    }
//Permite accedera la canción que se está reproduciendo
    public String getCancionActual(){
        String canc ="";
        if(cancionActual != null){
        canc = " Titulo de la canción: "+ cancionActual[0] + " //// Nombre del artista: " +cancionActual[1] + " /// Duración: "+ cancionActual[2] + " //// genero: " + cancionActual[3];
        }else if(cancionActual==null){
            canc = "\nActualmenteno se está reproduciendo ninguna cantión.";
        }

    return canc;
    }

    
//Permite acceder a si el teléfono está conectado o no.
    public String getConecTelefono(){
        return "Se ha conectado el telefono.";
    }
//Permite acceder a la agenda de contactos
    public ArrayList<String[]> getAgenda() {
        return agenda;
    }
//Permite realizar una llamada. 
    public int getVol() {
        return vol;
    }
//Permite saber si  se está en llamada o no
    public boolean getEnLlamada(){
        return enLlamada;
    }
//Permite colgar una llamada. Modifica el atributo de “enLlamada”
    public void setEnLlamada() {
        if(this.enLlamada == false){
            this.enLlamada = true;
        }else if(this.enLlamada == true){
            this.enLlamada = false;
        }
    }
//Permite cambiar al último contacto que se llamó.
    public void setUltimoContacto(String[] ultimoContacto) {
        UltimoContacto = ultimoContacto;
    }
//Permite bajar el volumen de la radio
    public void bajarVol(){
        vol = vol - cambioVol;
    }
//Permite subir el volumen de la radio
    public void subirVol(){
        vol = vol + cambioVol;
    }

    public abstract String especialProd();

    public abstract String especialTelefono();
    
}