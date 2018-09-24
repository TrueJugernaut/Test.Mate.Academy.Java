import java.util.ArrayList;

public class Student {

    String name;
    int intell;
    int social;
    int communic;
    int leader;
    int prSolv;
    int timeM;
    boolean present;


    public Student(String name, int intell, int social, int communic, int leader, int prSolv, int timeM){

        this.name = name;
        this.intell = intell;
        this.social = social;
        this.communic = communic;
        this.leader = leader;
        this.prSolv = prSolv;
        this.timeM = timeM;
        this.setPresent(this.generatePresent());

    }
    public void list() {
            System.out.println("name: " + name + "\nIntelligens: " + intell + "\nsocial: " + social + "\ncommunacation: " + communic +
                    "\nleadership: " +leader + "\nproblem solving skills: " + prSolv + "\ntime managment: " + timeM + "\npresent:" + isPresent() + "\n \n");
        }

    public int calculateSkills(ArrayList<Integer> skills){

        int currentSkill = 0;

        for (Integer skill : skills) {

            switch (skill) {
                case VoteForLife.INTELLIGENCE:
                    currentSkill += intell;
                    break;
                case VoteForLife.SOCIAL:
                    currentSkill += social;
                    break;
                case VoteForLife.COMMUNICATION_SKILLS:
                    currentSkill += communic;
                    break;
                case VoteForLife.LEADERSHIP_SKILLS:
                    currentSkill += leader;
                    break;
                case VoteForLife.PROBLEM_SOLVING:
                    currentSkill += prSolv;
                    break;
                case VoteForLife.TIME_MANAGEMENT_SKILLS:
                    currentSkill += timeM;
                    break;
            }

        }
        return currentSkill;

    }
    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }
    protected boolean generatePresent(){
        return Math.random() < 0.5;
    }

}
