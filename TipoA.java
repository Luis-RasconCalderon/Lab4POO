//Atributos: Los mismo del Radio por herencia
public class TipoA extends Radio {
// Constructor de la clase TipoA que determina los contactos y las playLists definidas.
    public TipoA(){
        String[] contacto1 = {"Luis","49874565"};
        String[] contacto2 = {"Nirvana","78986523"};
        String[] contacto3 = {"Kevin","42515623"};

        agenda.add(contacto1);
        agenda.add(contacto2);
        agenda.add(contacto3);

        String [] Cancion1 = {"Sinner", "Ric Wilson","4:31","Hip hop"};
        String [] Cancion2 = {"Dance, dance","Fall Out Boy","3:00","punk rock"};
        String [] Cancion3 = {"Condenado para el millon","Paulo Londra","3:42","hip hop"};
        playList1.add(Cancion1);
        playList1.add(Cancion2);
        playList1.add(Cancion3);

        String [] Cancion4 = {"Vete","Bad Bunny","3:12", "Reggaeton"};
        String [] Cancion5 = {"Supersonic","Skrillex","2:47","Electronica"};
        String [] Cancion6 = {"Paralyzed", "Sueco", "2:42", "Metal"};
        playList2.add(Cancion4);
        playList2.add(Cancion5);
        playList2.add(Cancion6);

        String [] Cancion7 = {"SAD!","XXXTENTACION","2:46", "Hip hop"};
        String [] Cancion8 = {"Asylum","Vended","2:52", "Metal"};
        String [] Cancion9 = {"Wishing Well", "Juice WRLD", "3:14", "Hip hop"};
        playList3.add(Cancion7);
        playList3.add(Cancion8);
        playList3.add(Cancion9);

        frecuencia = true;

    }
// Override de la clase especialTelefono de Radio.
    @Override
    public String especialProd() {
        // TODO Auto-generated method stub
        return "*Se muestran tarjetas de presentacion*";
    }
// Le muestra al usuario el último contacto que llamó con su nombre y número telefónico.
    @Override
    public String especialTelefono() {
        // TODO Auto-generated method stub
        return "Se esta llamando nuevamente al contacto: "+ UltimoContacto[0] + " con el numero: " + UltimoContacto[1];
    }
// Se le muestra al usuario el mensaje que esta llamando a su útlimo contacto.
    @Override
    public String toString(){
        return "\n4: Ver tarjetas de presentación";
    }

    @Override
    public String toString2(){
        return "4: Llamar al último contacto llamado";
    }



}
