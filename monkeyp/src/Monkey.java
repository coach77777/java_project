
public class Monkey extends RescueAnimal {

// Encapsulate and Create Instance of variables used in this class
    // private String taillength;
    //private String height;
    //private String torsolength;
    private String species;
    
 // Constructor
    public Monkey (String name, String species, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
    	
    	//Setting variables for Rescue Animal and the new monkey vars introduced.
    	setName(name);
    	setSpecies(species);
        //setTaillength(taillength);
        //setHeight(height);
        //setTorsolength(torsolength);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        }
    // Getters and Setters for new variables used for Monkey class
    // Accessor Methods (getters)
    public String getSpecies() {
        return species;
    }

    // Mutator Methods (setters)
    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }
}
    
 /* Accessor Methods (getters)
    public String getTaillength() {
        return taillength;
    }

    // Mutator Methods (setters)
    public void setTaillength(String monkeyTaillength) {
    	taillength = monkeyTaillength;
    }
 // Accessor Methods (getters)
    public String getHeight() {
        return height;
    }

    // Mutator Methods (setters)
    public void setHeight(String monkeyHeight) {
    	height = monkeyHeight;
    }
 // Accessor Methods (getters)
    public String getTorsolength() {
        return height;
    }

    // Mutator Methods (setters)
    public void setTorsolength(String monkeyTorsolength) {
    	torsolength = monkeyTorsolength;
    }      
}
   
*/


//*****************************************For Students Reference******************************************



/*public class Monkey extends RescueAnimal {

public Monkey(String name, String animalType, String gender, String age, String weight, String acquisitionDate, 
		String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry) {
super(name, animalType, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
}


// There are important data elements for monkeys in addition to what they use for dogs. These
// include tail length, height, body length, and species.


public Monkey(){

}
}
*/