public class app {
  public static void main(String[] args) {


        character fighter = new character();

 
        fighter.strength = 20;

        fighter.agility = 10;

        fighter.intelligence = 5;

        fighter.name = "alucard";

        character mage = new character();

        mage.strength = 10;

        mage.agility = 5;

        mage.intelligence = 20;

        mage.name = "Lunox";

        character marksman = new character();

        marksman.strength = 20;

        marksman.agility = 15;

        marksman.intelligence = 10;

        marksman.name = "Claude";

        marksman.sayMyName();

        marksman.sayMyStrength();

        marksman.sayMyAgility();

        marksman.sayMyIntelligence();
        
        weapon sword = new weapon();

        sword.name = "My name is batute";

        sword.damage = 200;

        sword.rarity = "Savage";

        sword.statemyName();

        sword.statemyDamage();

        sword.statemyRarity();

        sword.addDamage(150); 

        System.out.println( sword.shownameandrarity());   
        
  }
}
