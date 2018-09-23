import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VoteForLife {

    static ArrayList<Integer> skills = new ArrayList<>();

    public static int values = 0;
    public final static int INTELLIGENCE = 1;
    public final static int SOCIAL = 2;
    public final static int COMMUNICATION_SKILLS = 3;
    public final static int LEADERSHIP_SKILLS = 4;
    public final static int PROBLEM_SOLVING = 5;
    public final static int TIME_MANAGEMENT_SKILLS = 6;

    public static void vote() {
        System.out.println("Hey students, let's choose the captain!\n");
        System.out.println("*Enter 3 qualities, to chose captain of the group: \n \n" +
                "press 1 to chose intelligence; \n" +
                "press 2 to chose social; \n" +
                "press 3 to chose communication skills; \n" +
                "press 4 to chose leadership skills; \n" +
                "press 5 to chose problem solving skills; \n" +
                "press 6 to chose time management skills;");
        for (int i = 0; i < 3; i++) {
            try {
                BufferedReader vote = new BufferedReader(new InputStreamReader(System.in));
                values = Integer.parseInt(vote.readLine());
                VoteForLife voteCap = new VoteForLife();
                int a = voteCap.values;
                switch (a) {
                    case 1:
                        skills.add(INTELLIGENCE);
                        break;
                    case 2:
                        skills.add(SOCIAL);
                        break;
                    case 3:
                        skills.add(COMMUNICATION_SKILLS);
                        break;
                    case 4:
                        skills.add(LEADERSHIP_SKILLS);
                        break;
                    case 5:
                        skills.add(PROBLEM_SOLVING);
                        break;
                    case 6:
                        skills.add(TIME_MANAGEMENT_SKILLS);
                        break;
                    default:
                        System.out.println("Enter 3 options, use numbers from 1 to 6. Thank you!\n");
                        vote();
                }
            } catch (Exception e1) {
                System.out.println("Use only numbers from 1 to 6, please!");
                vote();
            }
        }
        Student winner = Group.getInstance().getStudentList().get(0);

        for (int i = 0; i < Group.getInstance().getStudentList().size(); i++) {
            if (winner.calculateSkills(skills ) < Group.getInstance().getStudentList().get(i).calculateSkills(skills)){

                winner = Group.getInstance().getStudentList().get(i);
            }
        }
        System.out.println("The winner is: " + winner.name);
        System.exit(0);


    }
}
