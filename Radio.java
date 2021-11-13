import java.util.ArrayList;

interface ModoTelefono{
    String especialTelefono();
    String toString();
}

interface ModoProductividad{
    String especialProd();
}

public abstract class Radio implements ModoTelefono, ModoProductividad{
    private boolean encendido;
    private boolean apagado;
    private int vol; 
    private boolean frecuencia;
    private ArrayList<String> Emisoras = new ArrayList<String>();
    private ArrayList<String[]> playList1 = new ArrayList<String[]>();
    private ArrayList<String[]> playList2 = new ArrayList<String[]>();
    private ArrayList<String[]> playList3 = new ArrayList<String[]>();
    private int cancionActual;
    private ArrayList<String[]> playListActual = new ArrayList<String[]>();
    private boolean conecTelefono;
    private ArrayList<String[]> Agenda = new ArrayList<String[]>();
    private boolean enLlamada;
    private String[] UltimoContacto = new String[2];





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

    }

    public ArrayList<String[]> getAgenda() {
        return Agenda;
    }

    public int getVol() {
        return vol;
    }

    public abstract String especialProd();

    public abstract String especialTelefono();
}
