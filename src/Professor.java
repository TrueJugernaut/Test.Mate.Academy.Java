import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Professor {

    public static int var = 0;

    public void variants() {
            try {
                BufferedReader call = new BufferedReader(new InputStreamReader(System.in));

                var = Integer.parseInt(call.readLine());

                switch (var) {
                    case 1:
                        Group.getInstance().call();
                        break;
                    case 2:
                        System.out.println("Let's go on without rollcall! \n");
                        VoteForLife.vote();
                        break;
                     default:
                         System.out.println("Sorry, you have only 2 ways, enter 1 or 2 to go on!");
                         variants();
                    }

            } catch (Exception e) {
                System.out.println("Please, use only numbers 1 or 2.");
                variants();
            }

        }
    }
