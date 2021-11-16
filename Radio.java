import java.util.ArrayList;

interface ModoTelefono{
    String especialTelefono();
    String toString();
    String toString2();
}

interface ModoProductividad{
    String especialProd();
}


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
    protected boolean conecTelefono;
    protected ArrayList<String[]> agenda = new ArrayList<String[]>();
    protected boolean enLlamada;
    protected String[] UltimoContacto = new String[2];



    

    public ArrayList<String> getEmisoras() {
        return Emisoras;
    }

    public void setEmisora(String nuevaEmisora) {
        Emisoras.add(nuevaEmisora);
    }

    public String getFrecuencia(){
        String frec = "";
        if(frecuencia == true){
            frec = "FM";
        }else if(frecuencia == false){
            frec = "AM";
        }

        return frec;
    }

    public void setFrecuencia() {
        if(frecuencia == true){
            frecuencia = false;
        }else if(frecuencia == false){
            frecuencia = true;
        }
    }

    public ArrayList<String[]> getPlayList1() {
        return playList1;
    }

    public ArrayList<String[]> getPlayList2() {
        return playList2;
    }

    public ArrayList<String[]> getPlayList3() {
        return playList3;
    }

    public void setCancionActual(String[] nuevaCancion) {
        cancionActual = nuevaCancion;
    }

    public String getCancionActual(){
        String canc ="";
        if(cancionActual != null){
        canc = " Titulo de la canción: "+ cancionActual[0] + " //// Nombre del artista: " +cancionActual[1] + " /// Duración: "+ cancionActual[2] + " //// genero: " + cancionActual[3];
        }else if(cancionActual==null){
            canc = "\nActualmenteno se está reproduciendo ninguna cantión.";
        }

    return canc;
    }

    

    public String getConecTelefono(){
        return "Se ha conectado el telefono.";
    }

    public ArrayList<String[]> getAgenda() {
        return agenda;
    }

    public int getVol() {
        return vol;
    }

    public boolean getEnLlamada(){
        return enLlamada;
    }

    public void setEnLlamada() {
        if(this.enLlamada == false){
            this.enLlamada = true;
        }else if(this.enLlamada == true){
            this.enLlamada = false;
        }
    }

    public void setUltimoContacto(String[] ultimoContacto) {
        UltimoContacto = ultimoContacto;
    }

    public void bajarVol(){
        vol = vol - cambioVol;
    }

    public void subirVol(){
        vol = vol + cambioVol;
    }

    public abstract String especialProd();

    public abstract String especialTelefono();
    
}