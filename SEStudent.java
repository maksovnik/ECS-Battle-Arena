public class SEStudent extends Student{
    public SEStudent(String name){
        super(name,8, 5, 8, 4, 10);
    }

    public void groupWork(Character enemy) throws Exception{
        if(currentKP<maxKP){
            throw new Exception("Exception");
        }
        Character[] mems=team.getMembers();
        for(int i=0;i<mems.length;i++){
            if(mems[i].getHP()!=0){
                enemy.decreaseHP((100 * mems[i].getAttack()) / (100 + enemy.getDefence()));
                if(enemy.getHP()==0){
                    increaseEP(4);
                    return;
                }
            }
            
        }
        currentKP=0;
        increaseEP(4);
    }

    public void groupDiscussion() throws Exception{

        System.out.println(currentKP+" "+maxKP);
        if(currentKP<maxKP){
            throw new Exception("Exception");
        }

        Character[] mems=team.getMembers();
        for(int i=0;i<mems.length;i++){
            if(mems[i].getHP()!=0){
                mems[i].increaseHP((int) Math.round(getDefence()/2));
            }
        }

    currentKP=0;
    increaseEP(4);
    }
}
