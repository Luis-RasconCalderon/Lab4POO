import java.util.ArrayList;

interface ModoTelefono{
    String especialTelefono();
    String toString();
}

interface ModoProductividad{
    String especialProd();
}

public abstract class Radio implements ModoTelefono, ModoProductividad{
    protected int vol; 
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

    public void setEmisoras(String nuevaEmisora) {
        Emisoras.add(nuevaEmisora);
    }

    public String getFrecuencia(){
        
    }

    public void setFrecuencia() {
        
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

    public void setCancionActual(int nuevaCancion) {
        cancionActual = nuevaCancion;
    }

    public String[] getCancionAhora(){
        return playListActual.get(cancionActual);
    }

    public void setPlayListActual() {
        
    }

    public ArrayList<String[]> getPlayListActual() {
        return playListActual;
    }

    public String getConecTelefono(){
        return "Se ha conectado el telefono.";
    }

    public ArrayList<String[]> getAgenda() {
        return Agenda;
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

    public abstract String especialProd();

    public abstract String especialTelefono();
    
    public ArrayList<String[]> CrearPlayList1 (){
        String [] Cancion1 = {"Easy on me", "Adele","2:31", "Hip Hop"};
        String [] Cancion2 = {"Stay","The Kid LAROI & Justin Bieber","3:43", "Hip Hop"};
        String [] Cancion3 = {"Industry Baby","Lil Nas x & Jack Harlow","4:45", "Rap"};
        String [] Cancion4 = {"Bad Habits","Ed Sheeran","5:10", "Hip Hop"};
        String [] Cancion5 = {"Fancy Like","Walker Hayes","4:10"};
        Stirng [] Cancion6 = {"Best Be Believing", "AlunaGeorge", "6:10", "House"};
        String [] Cancion7 = {"","","",""};
        String [] Cancion8 = {"","","",""};
        String [] Cancion9 = {"","","",""};
        
        playList1.add(Cancion1);
        playList1.add(Cancion2);
        playList1.add(Cancion3);
        playList1.add(Cancion4);
        playList1.add(Cancion5);
        return playList1;
    }
}
