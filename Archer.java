package characters;

public class Archer extends PlayerCharacter {

	
	 public Archer(String name) {
	        super(name, 50, 20, 80, 25); // name, health, damage, energy, crit

	        // Archer abilities 
	        PlayerAbilities.TripleShot tripleShot = new PlayerAbilities.TripleShot();
	        tripleShot.setDescription("Fires three arrows in rapid succession, dealing damage to the target.");
	        addAbility(tripleShot);
	
}

	 
	 public void shootArrowAtAngle(int baseAngle, int angleVariation) {
	        // baseAngle is the main shooting direction 
	        // angleVariation is how much the angle can deviate from the base angle

	        // Shoots threee arrows at base angle +/- 10 degrees variation
	        for (int i = -angleVariation; i <= angleVariation; i += 20) {
	            int shotAngle = baseAngle + i; // Calculate angle for the shot
	            fireArrow(shotAngle); // shoots the arrow at calculated angle
	        }
	    }

	    private void fireArrow(int angle) {
	        // prints angle arrow is shot
	        System.out.println("Arrow fired at angle: " + angle + " degrees");

	        
	    }
	}



