import java.util.Scanner;

class Candidate {
    int candidateId;
    String name;
    int aptitude;
    int technical;
    int communication;

    Candidate(int candidateId, String name, int aptitude,
              int technical, int communication) {

        this.candidateId = candidateId;
        this.name = name;
        this.aptitude = aptitude;
        this.technical = technical;
        this.communication = communication;
    }

    int getTotalScore() {
        return aptitude + technical + communication;
    }
}

public class TopCandidates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Candidate[] c = new Candidate[n];

        for(int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();

            int aptitude = sc.nextInt();
            int technical = sc.nextInt();
            int communication = sc.nextInt();

            c[i] = new Candidate(id, name, aptitude,
                                 technical, communication);
        }

        // Sort candidates
        for(int i = 0; i < n - 1; i++) {

            for(int j = 0; j < n - i - 1; j++) {

                if(c[j].getTotalScore() < c[j + 1].getTotalScore() ||
                  (c[j].getTotalScore() == c[j + 1].getTotalScore()
                   && c[j].candidateId > c[j + 1].candidateId)) {

                    Candidate temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }

        // Display Top K
        for(int i = 0; i < k; i++) {
            System.out.println(c[i].candidateId + " "
                    + c[i].name + " "
                    + c[i].getTotalScore());
        }
    }
}