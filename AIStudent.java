
public class AIStudent extends Student{
    public AIStudent(String name){
        super(name,6, 7, 7, 5, 3);
    }

    public void machineLearning(Character enemy) throws Exception{
        if(currentKP<maxKP){
            throw new Exception("Exception");
        }
        else{
        int damage=(2 * (100 * getAttack()) / (100 + enemy.getDefence()));
        enemy.decreaseHP(damage);

        if(enemy.getHP()==0){
            increaseEP(4);
        }
        
        currentKP=0;
        increaseEP(4);
    }
    }
    public void naturalLanguageProcessing() throws Exception{
        if(currentKP<maxKP){
            throw new Exception("Exception");
        }
        increaseHP(getDefence());
        currentKP=0;
        increaseEP(4);
    }
}
