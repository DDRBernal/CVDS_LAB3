package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;

public class Base_de_Datos{
	
    private static ArrayList<Person> personas;
    public Base_de_Datos() {
	personas = new ArrayList<>();
    }

    public static void agregarPersona(Person p){
	personas.add(p);
    }

    public static boolean personaRepetida(Person p){
	boolean rta = true;
	if (!personas.contains(p)){
		rta=false;
	}
	return rta;
    }
}