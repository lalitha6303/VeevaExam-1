
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Participant> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String username = sc.next();
            int problemsSolved = sc.nextInt();
            int penaltyTime = sc.nextInt();
            int rating = sc.nextInt();

            list.add(new Participant(
                    username, problemsSolved, penaltyTime, rating
            ));
        }


        list.sort(
                Comparator.comparingInt(Participant::getProblemsSolved)
                        .reversed()

                        .thenComparingInt(Participant::getPenaltyTime)

                        .thenComparing(
                                Comparator.comparingInt(
                                        Participant::getRating
                                ).reversed()
                        )

                        .thenComparing(Participant::getUsername)
        );

        for (Participant p : list) {
            System.out.println(p);
        }

        sc.close();
    }
}
