package chainOfResponsebility;

public class Main {

    public static void main(String[] args) {
        Support s1 = new NoSupport("no");
        Support s2 = new LimitedSupport("limited", 2);
        Support s3 = new OddSupport("odd");
        Support s4 = new SpecialSupport("special", 4);
        s1.setNext(s2);
        s2.setNext(s3);
        s3.setNext(s4);
        for (int i = 0; i < 7; i++) {
            s1.support(new Trouble(i));
        }
    }

}
