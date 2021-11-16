public class TipoS extends Radio {
    private boolean speaker; 
    public TipoS(){
        String[] contacto1 = {"Javier","46554687"};
        String[] contacto2 = {"Ana","48949878"};
        String[] contacto3 = {"Fabain","89798489"};

        agenda.add(contacto1);
        agenda.add(contacto2);
        agenda.add(contacto3);

        String [] Cancion1 = {"Demons", "Dennis Lloyd","2:57","Hip hop"};
        String [] Cancion2 = {"What we do","Korn","4:07","Nu metal"};
        String [] Cancion3 = {"King Kuta","Kendrick Lamar","3:54","hip hop"};
        playList1.add(Cancion1);
        playList1.add(Cancion2);
        playList1.add(Cancion3);

        String [] Cancion4 = {"Jotaro","Phiso","3:12", "Riddim"};
        String [] Cancion5 = {"Bad Apple","Travis Thompson","3:39","Hip hop"};
        String [] Cancion6 = {"777", "Silk sonic", "2:45", "R&B"};
        playList2.add(Cancion4);
        playList2.add(Cancion5);
        playList2.add(Cancion6);

        String [] Cancion7 = {"January","Verzache","3:16", "Indie"};
        String [] Cancion8 = {"Banana Planet","Midnight Tyrannosaurus","3:13", "Riddim"};
        String [] Cancion9 = {"Lose", "KSI", "3:25", "Hip hop"};
        playList3.add(Cancion7);
        playList3.add(Cancion8);
        playList3.add(Cancion9);

        frecuencia = true;
        speaker = false;
    }


    @Override
    public String especialProd() {
        return "\n*Se estan planificando viajes.*\n";
    }

    @Override
    public String especialTelefono() {
        String esp = "";
        speaker = !speaker;
        if(speaker == false){
            esp = "Se ha cambiado al modo bocinas.";
        }else if(speaker == true){
            esp = "Se ha cambiado al modo auriculares.";
        }
        return esp;
    }
    

    @Override
    public String toString(){
        return "\n4: Planificar viajes";
    }


    @Override
    public String toString2() {
        // TODO Auto-generated method stub
        return "4: Cambiar entre bocinas y auriculares.";
    }
}
