/**
 * 
 */
package characters;

/**
 * 
 */
public class Knight extends PlayerCharacter {
    public Knight(String name) {
        super(name, 60, 15, 100, 15); // name, health, damage, energy, crit
        
        // knigh abilities
        PlayerAbilities.Dash dash = new PlayerAbilities.Dash();
        dash.setDescription("Quick movement that avoids enemy attacks and repositions the Knight");
        addAbility(dash);
    }
    
    /**
     * Knights have a passive ability to reduce damage taken
     */
  
    
    @Override
    public void takeDamage(int damage) {
        int reducedDamage = (int) Math.ceil(damage * (1.0 - damageReduction));
        System.out.println(getName() + " has passive damage reduction. Damage reduced from "
                + damage + " to " + reducedDamage + ".");

        // Calls with reduced damage
        super.takeDamage(reducedDamage);
    }

    public double getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(double damageReduction) {
        this.damageReduction = damageReduction;
    }

}