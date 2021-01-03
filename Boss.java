public class Boss extends Character implements Monster{
    public Boss(String name){
        super(name,8,7,8,7);
    }

    public void strike(Character enemy){
        double num=Math.random();
        if((num>0) & (num<=0.50)){
            SyntaxError(enemy);
        }
        else if ((num>0.5) & (num<0.65)){
            NullPointerException();
        }
        else if ((num>=0.65) & (num<0.8)){
            ArrayIndexOutOfBoundException(enemy);
        }
        else if ((num>=0.8) & (num<0.9)){
            NoneTermination();
        }
        else{
            ConcurrentModificationException();
        }

        increaseEP(3);
        if(enemy.currentHP==0){
            increaseEP(4);
        }
        if(enemy instanceof Student){
            Student sEnemy = (Student) enemy;
            sEnemy.increaseKP(3);
        }
    }

    void SyntaxError() {

    }

    
    
    public void SyntaxError(Character enemy) {
        enemy.decreaseHP(100 * getAttack()/ (100 + enemy.getDefence()));
    }

    
    public void NullPointerException() {
        increaseHP(getDefence());
    }

    
    public void ArrayIndexOutOfBoundException(Character enemy) {
        enemy.decreaseHP(2*(100 * getAttack()/ (100 + enemy.getDefence())));
    }

    
    public void NoneTermination() {
        Character[] mems=team.getMembers();
        for(int i=0;i<mems.length;i++){
            if(mems[i].getHP()==0){
                int maxHP=mems[i].getMaxHP();
                mems[i].increaseHP(maxHP);
            }
        }
    }

    
    public void ConcurrentModificationException() {

    }

}
