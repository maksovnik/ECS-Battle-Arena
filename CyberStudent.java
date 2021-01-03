public class CyberStudent extends Student{
    public CyberStudent(String name){
        super(name,7, 7, 5, 6, 6);
    }

    public void cyberAttack(Team enemyTeam) throws Exception{
        if(currentKP<maxKP){
            throw new Exception("Exception");
        }

        Character[] mems=enemyTeam.getMembers();
        for(int i=0;i<mems.length;i++){
            if(mems[i].getHP()!=0){
                mems[i].decreaseHP((100 * getAttack()) / (100 + mems[i].getDefence()));
                if(mems[i].getHP()==0){
                    increaseEP(4);
                }
            }
            
        }
        
        currentKP=0;
        increaseEP(4);
    }

}
