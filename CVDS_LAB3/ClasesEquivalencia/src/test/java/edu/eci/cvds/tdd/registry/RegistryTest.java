package edu.eci.cvds.tdd.registry;

import org.junit.Test;

import org.junit.Assert;

public class RegistryTest { 

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person("Raul",10006,18,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);
	
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    /// TODO Complete with more test cases

    @Test
    public void notValidAge(){
	Person Raul = new Person("Raul",10006154,-1,Gender.MALE,true);

	RegisterResult result = registry.registerVoter(Raul);	
	
	Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void underAge(){	

	Person Jose = new Person("Jose",10006154,12,Gender.MALE,true);

	RegisterResult result = registry.registerVoter(Jose);	
	
	Assert.assertEquals(RegisterResult.UNDERAGE, result);
	
    }

    @Test
    public void notValidateAlive(){	

	Person Fernando = new Person("Fernando",10006154,19,Gender.MALE,false);

	RegisterResult result = registry.registerVoter(Fernando);	
	
	Assert.assertEquals(RegisterResult.DEAD, result);
	
    }

    @Test
    public void validateOfRepetition(){	

	Person Oscar = new Person("Oscar",10006154,19,Gender.MALE,true);

	RegisterResult result = registry.registerVoter(Oscar);	

	RegisterResult result1 = registry.registerVoter(Oscar);
	
	Assert.assertEquals(RegisterResult.DUPLICATED, result1);
	
    }
}