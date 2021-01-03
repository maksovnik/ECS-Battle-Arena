public class Minion extends Character implements Monster{
    public Minion(String name){
        super(name,5,5,5,5);
    }

    public void strike(Character enemy){
        double num=Math.random();
        if((num>0) & (num<0.75)){
            SyntaxError(enemy);
        }
        else if ((num>0.75) & (num<0.9)){
            NullPointerException();
        }
        else{
            ArrayIndexOutOfBoundException(enemy);
        }

        increaseEP(3);
        if(enemy.currentHP==0){
            increaseEP(3);
        }
        if(enemy instanceof Student){
            Student sEnemy = (Student) enemy;
            sEnemy.increaseKP(3);
        }
        
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
        
    }

    
    public void ConcurrentModificationException() {

    }

}
