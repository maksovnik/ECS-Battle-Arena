import java.util.ArrayList;

public class Team{
    String name;
    ArrayList<Character> members = new ArrayList<Character>();

    public Team(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public Character[] getMembers(){
        Character[] memberArray = members.toArray(new Character[members.size()]);
        return memberArray;
    }
    public int addMember(Character member){
        if(members.contains(member)){
            return -1;
        }
        if(members.size()==5){
            return -2;
        }
        members.add(member);
        return members.size();

    }

}