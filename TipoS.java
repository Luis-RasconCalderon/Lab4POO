import java.util.ArrayList;

public class TipoS extends Radio {
    private boolean speaker; 
    public TipoS(){
        String[] contacto1 = {"Alfredo","56874852"};
        String[] contacto2 = {"Maria","87945654"};
        String[] contacto3 = {"Carlos","78784516"};

        agenda.add(contacto1);
        agenda.add(contacto2);
        agenda.add(contacto3);

        speaker = false;
    }


    @Override
    public String especialProd() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String especialTelefono() {
        String esp = "";
        if(speaker == false){
            esp = "Se ha cambiado al modo bocinas.";
        }else if(speaker == true){
            esp = "Se ha cambiado al modo auriculares.";
        }
        return null;
    }
    

    @Override
    public String toString(){
        return "\n4: Cambiar entre bocinas y auriculares";
    }
}
