import java.util.Scanner;


public class SmallMonster extends Monster {


    Scanner sc = new Scanner(System.in);

    private String image = "ММ";

    SmallMonster(int sizeBoard) {
        super(sizeBoard);
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    // переопредилим метод:
    @Override
    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу:");
        int trueAnswer;
        String question;

        switch (difficultGame) {
            case 1:
                int variant1 = r.nextInt(2); // 0 или 1
                if (variant1 == 0) {
                    int a = r.nextInt(6);
                    int b = r.nextInt(6);
                    trueAnswer = a + b;
                    question = a + " + " + b + " = ?";
                } else {
                    int c = r.nextInt(6);
                    int d = r.nextInt(6);

                    if (c < d) {
                        int temp = c;
                        c = d;
                        d = temp;
                    }
                    trueAnswer = c - d;
                    question = c + " - " + d + " = ?";
                }
                break;

            case 2:
                int variant2 = r.nextInt(2);
                if (variant2 == 0) {
                    int a = r.nextInt(11);
                    int b = r.nextInt(11);
                    trueAnswer = a + b;
                    question = a + " + " + b + " = ?";
                } else {
                    int c = r.nextInt( 11);
                    int d = r.nextInt(11);

                    if (c < d) {
                        int temp = c;
                        c = d;
                        d = temp;
                    }
                    trueAnswer = c - d;
                    question = c + " - " + d + " = ?";
                }
                break;

            case 3:
                int variant3 = r.nextInt(2);
                if (variant3 == 0) {
                    int a = r.nextInt(21);
                    int b = r.nextInt(21);
                    trueAnswer = a + b;
                    question = a + " + " + b + " = ?";
                } else {
                    int c = r.nextInt( 21);
                    int d = r.nextInt( 21);

                    if (c < d) {
                        int temp = c;
                        c = d;
                        d = temp;
                    }
                    trueAnswer = c - d;
                    question = c + " - " + d + " = ?";
                }
                break;

            case 4:
                int variant4 = r.nextInt(2);
                if (variant4 == 0) {
                    int a = r.nextInt(51);
                    int b = r.nextInt(51);
                    trueAnswer = a + b;
                    question = a + " + " + b + " = ?";
                } else {
                    int c = r.nextInt( 51);
                    int d = r.nextInt( 51);

                    if (c < d) {
                        int temp = c;
                        c = d;
                        d = temp;
                    }
                    trueAnswer = c - d;
                    question = c + " - " + d + " = ?";
                }
                break;

            case 5:
                int variant5 = r.nextInt(2);
                if (variant5 == 0) {
                    int a = r.nextInt(101);
                    int b = r.nextInt(101);
                    trueAnswer = a + b;
                    question = a + " + " + b + " = ?";
                } else {
                    int c = r.nextInt( 101);
                    int d = r.nextInt( 101);

                    if (c < d) {
                        int temp = c;
                        c = d;
                        d = temp;
                    }
                    trueAnswer = c - d;
                    question = c + " - " + d + " = ?";
                }
                break;

            default:
                System.out.println("Неизвестная сложность!");
                return false;
        }

        System.out.print(question);
        int ans = sc.nextInt();

        if (trueAnswer == ans) {
            System.out.println("✅ Верно! Ты победил монстра");
            return true;
        } else {
            System.out.println("❌ Неверно! Правильный ответ: " + trueAnswer);
            System.out.println("Ты проиграл эту битву!");
            return false;
        }
    }
}

