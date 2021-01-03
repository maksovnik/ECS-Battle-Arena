
public class Student extends Character{

    int maxKP,currentKP;
    public Student(String name, int baseHP, int baseAtk, int baseDef, int baseSpd, int maxKP){
        super(name, baseHP, baseAtk, baseDef, baseSpd);
        this.maxKP=maxKP;
    }


	public void increaseKP(int amount){
        if (currentKP<maxKP){
            currentKP=currentKP+amount;
        }
    }

    public void javaProgramming(Character enemy){
        increaseEP(3);
        increaseKP(1);
        enemy.decreaseHP((100 * baseAtk) / (100 + enemy.baseAtk));
        enemy.increaseEP(2);
        if(enemy instanceof Student){
            Student sEnemy = (Student) enemy;
            sEnemy.increaseKP(3);
        }
        if(enemy.currentHP==0){
            increaseEP(4);
        }
    }

    public void selfStudy(){
        increaseEP(6);
        increaseHP(2);
        increaseKP(2);
    }

}