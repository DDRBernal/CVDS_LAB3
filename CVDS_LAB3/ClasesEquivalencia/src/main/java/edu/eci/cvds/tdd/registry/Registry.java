package edu.eci.cvds.tdd.registry;


public class Registry {
    private Base_de_Datos base;
    
    public Registry() {
	base = new Base_de_Datos();
    }

    public RegisterResult registerVoter(Person p) {
        
        // TODO Validate person and return real result.
	if (p.getAge()>0 && p.getAge()<18) return RegisterResult.UNDERAGE;
	if (!p.isAlive()) return RegisterResult.DEAD;
	if (p.getAge()<0) return RegisterResult.INVALID_AGE;
	if (base.personaRepetida(p)) return RegisterResult.DUPLICATED;
        else {base.agregarPersona(p);}
	return RegisterResult.VALID;
    } 
}