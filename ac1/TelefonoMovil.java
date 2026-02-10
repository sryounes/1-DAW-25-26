package ac1;

import java.util.ArrayList;

public class TelefonoMovil {
    private String myNumber;
    private ArrayList<Contacto> myContacts;

    public TelefonoMovil(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contacto contacto){
        for (Contacto c : myContacts){
            if (c.getName().equals(contacto.getName())){
                return false;
            }
        }

        myContacts.add(contacto);
        return true;
    }

    public boolean removeContact(Contacto contacto){
        for(Contacto c : myContacts){
            if(c.getName().equals(contacto.getName())){
                myContacts.remove(contacto);
                return true;
            }
        }
        return false;
    }

    private int findContact(Contacto contacto){
        for (int i = 0; i < myContacts.size(); i++) {
            if(myContacts.get(i).getName().equals(contacto.getName())){
                return i;
            }
        }
        return -1;
    }

    private int findContact(String name){
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact(Contacto oldcontact, Contacto newcontact){
        int oldIndex = findContact(oldcontact);

        if (oldIndex <0){
            return false;
        }

        int newIndex = findContact(newcontact.getName());
        if (newIndex >= 0 && newIndex != oldIndex){
            return false;
        }

        myContacts.set(oldIndex, newcontact);
        return true;
    }

    public Contacto queryContact(String name){
        int index = findContact(name);
        if (index >= 0){
            return myContacts.get(index);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Lista de contactos: ");

        for (int i = 0; i < myContacts.size(); i++) {
            Contacto c = myContacts.get(i);
            System.out.println((i+1) + ". " + c.getName() + "->" + c.getPhoneNumber());
        }
    }
}
