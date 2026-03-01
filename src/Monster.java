import java.util.Random;
import java.util.Scanner;
public class Monster {
    Scanner sc = new Scanner(System.in);
    private String image = "МО";
    public String getImage() {
        return image;
    }
    private final int x, y;
    Random r = new Random();

    Monster(int sizeBoard) {
        this.y = r.nextInt(sizeBoard - 1);
        this.x = r.nextInt(sizeBoard);
    }

    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }

    public boolean conflictPerson(int perX, int perY) {
        return perY - 1 == this.y && perX - 1 == this.x;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу:");
        int trueAnswer;
        String question;

        switch (difficultGame) {
            case 1:
                int variant1 = r.nextInt(2);
                if (variant1 == 0) {
                    int a = r.nextInt(6);
                    int b = r.nextInt(6);
                    trueAnswer = a * b;
                    question = a + " * " + b + " = ?";
                } else {
                    int c = r.nextInt(6);
                    int d = r.nextInt(6);
                    int e = r.nextInt(6);
                    trueAnswer = c + d + e;
                    question = c + " + " + d + " + " + e + " = ?";
                }
                break;

            case 2:
                int variant2 = r.nextInt(2);
                if (variant2 == 0) {
                    int a = r.nextInt(10);
                    int b = r.nextInt(10);
                    trueAnswer = a * b;
                    question = a + " * " + b + " = ?";
                } else {
                    int c = r.nextInt(10);
                    int d = r.nextInt(10);
                    int e = r.nextInt(10);
                    trueAnswer = c + d + e;
                    question = c + " + " + d + " + " + e + " = ?";
                }
                break;
            case 3:
                int variant3 = r.nextInt(2);
                if (variant3 == 0) {
                    int a = r.nextInt(12);
                    int b = r.nextInt(12);
                    trueAnswer = a * b;
                    question = a + " * " + b + " = ?";
                } else {
                    int c = r.nextInt(15);
                    int d = r.nextInt(15);
                    int e = r.nextInt(15);
                    trueAnswer = c + d + e;
                    question = c + " + " + d + " + " + e + " = ?";
                }
                break;
            case 4:
                int variant4 = r.nextInt(2);
                if (variant4 == 0) {
                    int a = r.nextInt(15);
                    int b = r.nextInt(15);
                    trueAnswer = a * b;
                    question = a + " * " + b + " = ?";
                } else {
                    int c = r.nextInt(50);
                    int d = r.nextInt(50);
                    int e = r.nextInt(50);
                    trueAnswer = c + d + e;
                    question = c + " + " + d + " + " + e + " = ?";
                }
                break;
            case 5:
                int variant5 = r.nextInt(2);
                if (variant5 == 0) {
                    int a = r.nextInt(20);
                    int b = r.nextInt(20);
                    trueAnswer = a * b;
                    question = a + " * " + b + " = ?";
                } else {
                    int c = r.nextInt(100);
                    int d = r.nextInt(100);
                    int e = r.nextInt(100);
                    trueAnswer = c + d + e;
                    question = c + " + " + d + " + " + e + " = ?";
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