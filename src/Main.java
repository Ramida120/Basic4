public class Main {
    public static boolean testscore (int interviewScore,
                                     int englishScore) {
        boolean isOK;
        if (interviewScore > 70||englishScore > 50){
            isOK = true;
        } else {
            isOK = false;
        }
        return  isOK;
    }
    public static void main(String[] args) {
        System.out.println(testscore(70,50));
        System.out.println(testscore(70,60));



    }
}