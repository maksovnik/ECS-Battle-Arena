import java.lang.Math; 

public class Character{
    Team team;
    String name;
    int baseHP,currentHP,currentEP=0, baseAtk, baseDef, baseSpd, level=1;
	int currentKP;

    public Character(String name, int baseHP, int baseAtk, int baseDef, int baseSpd){
        this.name=name;
        this.baseHP=baseHP;
        this.baseAtk=baseAtk;
        this.baseDef=baseDef;
        this.baseSpd=baseSpd;
        this.currentHP=getMaxHP();
    }

    public String getName(){
        return name;
    }

    public int getMaxHP(){
        int max = (int) Math.round(baseHP * (Math.pow(level,1.2)));
        return max;
     }

    public int getAttack(){
        return (int) Math.round(baseAtk * (Math.pow(level,1.2)));
    }

    public int getDefence(){
        return (int) Math.round(baseDef * (Math.pow(level,1.2)));
    }

    public int getSpeed(){
        return (int) Math.round(baseSpd * (Math.pow(level,1.2)));
    }

    public int getTargetEP(){
        return (int) Math.round(10 * (Math.pow(level,1.5)));
    }

    public int getHP(){
        return currentHP;
    }

    public int getEP(){
        return currentEP;
    }

    public void increaseHP(int amount){
        int newHP = currentHP+amount;
        if(newHP>=0){
            int maxHP = getMaxHP();
            if(newHP<=maxHP){
                currentHP=newHP;
            }
            else{
                currentHP=maxHP;
            }
        }
        else{
            currentHP=0;
        }
    }

    public void decreaseHP(int amount){
        int newHP = currentHP-amount;
        if(newHP>=0){
            int maxHP = getMaxHP();
            if(newHP<=maxHP){
                currentHP=newHP;
            }
            else{
                currentHP=maxHP;
            }
        }
        else{
            currentHP=0;
        }
    }
        

    public void increaseEP(int amount){
        currentEP=currentEP+amount;
        if (currentEP>=getTargetEP()){
            level++;
            currentEP=0;

            if(currentHP!=0){
                currentHP=getMaxHP();
            }

        }
    }

    public void setTeam(Team team){
        this.team=team;
    }

    public Team getTeam(){
        return team;
    }
}
