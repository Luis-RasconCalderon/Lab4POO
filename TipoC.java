public class TipoC extends Radio {
    //Atributos
    // Define si el usuario tiene una llamada en espera
    private boolean enEspera;
    //Métodos
    // Constructor de la clase  Tipo C, permite asignarle el valor de sus atributos considerando la herencia de Radio.
    public TipoC(){
        String[] contacto1 = {"Alfredo","56874852"};
        String[] contacto2 = {"Maria","87945654"};
        String[] contacto3 = {"Carlos","78784516"};

        agenda.add(contacto1);
        agenda.add(contacto2);
        agenda.add(contacto3);

        String [] Cancion1 = {"Easy on me", "Adele","2:31","pop"};
        String [] Cancion2 = {"Stay","The Kid LAROI & Justin Bieber","3:43","pop"};
        String [] Cancion3 = {"Industry Baby","Lil Nas x & Jack Harlow","4:45","hip hop"};
        playList1.add(Cancion1);
        playList1.add(Cancion2);
        playList1.add(Cancion3);

        String [] Cancion4 = {"Bad Habits","Ed Sheeran","5:10", "Hip Hop"};
        String [] Cancion5 = {"Fancy Like","Walker Hayes","4:10","Country"};
        String [] Cancion6 = {"Best Be Believing", "AlunaGeorge", "6:10", "House"};
        playList2.add(Cancion4);
        playList2.add(Cancion5);
        playList2.add(Cancion6);

        String [] Cancion7 = {"Overthinker","INZO","4:28", "Electronica"};
        String [] Cancion8 = {"You are gonna go far, kid","The Offspring","2:57", "Rock"};
        String [] Cancion9 = {"Juliet", "Cavetown", "4:39", "Indie"};
        playList3.add(Cancion7);
        playList3.add(Cancion8);
        playList3.add(Cancion9);


        frecuencia = true;
        enEspera = false;
    }


    @Override
    public String especialProd() {
        // TODO Auto-generated method stub
        return "*Muestra el pronóstico del tiempo*";
    }
// Override de la clase Radio, ciclo que determina si una llamada se pondrá en espera, únicamente si está en llamadas y  desea dejarlo en espera. 
    @Override
    public String especialTelefono() {
        String esp = "";
        if(enLlamada == true & enEspera == false){
            esp = "Se ha colocado la llamada en espera";
            enLlamada = false;
            enEspera = true;
        }else if(enEspera == true & enLlamada == false){
            esp = "Se ha reanudado la llamda";
            enLlamada = true;
            enEspera = false;
        }else if(enLlamada == false || enEspera == true){
            esp = "No se puede colocar llamada en espera. No existe llamada activa o ya hay una en espera";
        }
        return esp;
    }
 // mensaje que se le muestra al usuario cuando pone una llamada en espera.
    @Override
    public String toString(){
        return "\n4: Ver pronostico del tiempo.";
    }


    @Override
    public String toString2() {
        // TODO Auto-generated method stub
        return "4. Poner llamada en espera/Reanudar llamada.";
    }
    
}
