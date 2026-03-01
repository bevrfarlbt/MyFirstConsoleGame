import java.util.Random;
import java.util.Scanner;

public class BigMonster extends Monster {

    private String image = "МБ";

    BigMonster(int sizeBoard) {
        super(sizeBoard);
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean taskMonster(int difficultGame) {
        Scanner sc = new Scanner(System.in);

        // 0 - камень
        // 1 - ножницы
        // 2 - бумага

        int monster = r.nextInt(3);


        System.out.println("Камень-ножницы-бумага! Твой ход (0 - камень, 1 - ножницы, 2 - бумага): ");
        int player = sc.nextInt();

        // проверка
        switch (player) {
            case 0:
                if (monster == 1) {
                    System.out.println("Ты выиграл!");
                    return true;
                } else if (monster == 2) {
                    System.out.println("Ты проиграл!");
                    return false;
                } else {
                    System.out.println("Ничья! Переигрываем...");
                    return taskMonster(difficultGame);
                }
            case 1:
                if (monster == 2) {
                    System.out.println("Ты выиграл!");
                    return true;
                } else if (monster == 0) {
                    System.out.println("Ты проиграл!");
                    return false;
                } else {
                    System.out.println("Ничья! Переигрываем...");
                    return taskMonster(difficultGame);
                }
            case 2:
                if (monster == 0) {
                    System.out.println("Ты выиграл!");
                    return true;
                } else if (monster == 1) {
                    System.out.println("Ты проиграл!");
                    return false;
                } else {
                    System.out.println("Ничья! Переигрываем...");
                    return taskMonster(difficultGame);
                }
            default:
                System.out.println("Неверный ввод! Попробуй еще раз:");
                return taskMonster(difficultGame);
        }
    }
}