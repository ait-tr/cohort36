package classwork.example01;

public class StudentInfo {
    public static Signer signer;

    static {
        signer = new Signer() {
            @Override
            public void sign() {
                System.out.println("Это работа васи пупкина из группы 55");
            }
        };
    }
}
