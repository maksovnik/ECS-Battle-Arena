public class CSStudent extends Student{
    public CSStudent(String name){
        super(name,7, 6, 6, 6, 4);
    }

    public void pairWorking(Character friend, Character enemy) throws Exception{
        if(currentKP<maxKP){
            throw new Exception("Exception");
        }
        currentKP=0;
        increaseEP(4);
        if (friend.getHP()!=0){
            enemy.decreaseHP((100 * friend.getAttack()) / (100 + enemy.getDefence()));
        }
        enemy.decreaseHP((100 * getAttack()) / (100 + enemy.getDefence()));
        if(enemy.getHP()==0){
            increaseEP(4);
        }
    }

    public void support(Character friend) throws Exception{
        if(currentKP<maxKP){
            throw new Exception("Exception");
        }
        if (friend.getHP()!=0){
            friend.increaseHP(getDefence());
        }
        currentKP=0;
        increaseEP(4);
    }
}
