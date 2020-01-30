package edu.eci.cvds.tdd.registry;

public class Registry {
    public RegisterResult registerVoter(Person p) {

        // TODO Validate person and return real result.
	if (p.getAge()>0 && p.getAge()<18) return RegisterResult.UNDERAGE;
	if (!p.isAlive()) return RegistrerResult.DEAD;
	if (p.getAge()<0) return RegisterResult.INVALID_AGE;
	if (p.) return RegisterResult.DUPLICATED;
        return RegisterResult.VALID;
    }
}