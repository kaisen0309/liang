import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag = 1;
        PrintStream out = System.out;
        ArrayList<String> al = new ArrayList<String>();

        try (Scanner input2 = new Scanner(Paths.get("rule.txt"))) {
            while (input2.hasNextLine()) {
                System.out.println(input2.nextLine());
            }
        } catch (IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }

        do {
            System.out.printf("請輸入你要出的拳(1為剪刀 2為石頭 3為布): ");
            int gamer = input.nextInt();
            String gamerFinger = "";
            switch (gamer) {
                case 1:
                    gamerFinger = "剪刀";
                    break;
                case 2:
                    gamerFinger = "石頭";
                    break;
                case 3:
                    gamerFinger = "布";
                    break;
            }
            Random rand = new Random();
            int computer = (int) rand.nextInt(3) + 1;
            String comFinger = "";
            switch (computer) {
                case 1:
                    comFinger = "剪刀";
                    break;
                case 2:
                    comFinger = "石頭";
                    break;
                case 3:
                    comFinger = "布";
                    break;
            }

            System.out.printf("\n您出的是%s，電腦出的是%s\n\n", gamerFinger, comFinger);

            if ((gamer == 1 && computer == 3) || (gamer == 2 && computer == 1) || (gamer == 3 && computer == 2)) {
                System.out.printf("You Win!!\n\n");
                al.add("You Win!!");
            } else if (gamer == computer) {
                System.out.printf("Tie!!\n\n");
                al.add("Tie!!");
            } else {
                System.out.printf("You Lose!!\n\n");
                al.add("You Lose!!");
            }
            System.out.printf("輸入1再玩一次 輸入0結束遊戲: ");
            flag = input.nextInt();

        } while (flag == 1);
        System.out.printf("\nGame Over!\n");
        System.out.printf("---------- Game Result ----------\n");

        try (PrintStream ps = new PrintStream("result.txt");) {
            System.setOut(ps);
            for (int i = 0; i < al.size(); i++)
                System.out.printf("%s\n", al.get(i));
            ps.close();
            System.setOut(out);
        } catch (IOException | NoSuchElementException | IllegalStateException e1) {
            e1.printStackTrace();
        }

        try (Scanner input3 = new Scanner(Paths.get("result.txt"))) {
            while (input3.hasNextLine()) {
                System.out.println(input3.nextLine());
            }
        } catch (IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }

    }
}
