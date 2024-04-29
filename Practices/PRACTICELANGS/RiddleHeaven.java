import java.util.Random;
import java.util.Scanner;

public class RiddleHeaven {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            System.out.println("Please enter your name: ");
            String name = sc.nextLine();
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Welcome to heaven " + name + "!");
            System.out.println("Can you tell me what is the cause of your death leading you here?");
            String cause = sc.nextLine();
            System.out.println("------------------------------------------------------------------------");
            System.out.println(cause + ", That is indeed your time.");
            System.out.println("Now I will tell you what is the purpose of why you are here.");
            System.out.println("There are three doors in front of you. One door will get you to the next level.");
            System.out.println("And of you passed all levels, you will have a chance to be reincarnated.");
            System.out.println("a. okay.");
            System.out.println("b. How many levels are there?");
            String ansq1 = sc.nextLine();
            if (ansq1.equalsIgnoreCase("a")) {
                System.out.println("Okay then!");
                MainQuestion1();
            } else if (ansq1.equalsIgnoreCase("b")) {
                System.out.println("There are three doors within each level, and there are a total of 3 levels.");
                System.out.println("a. Okay.");
                String ansq1b = sc.nextLine();
                if (ansq1b.equalsIgnoreCase("a")) {
                    MainQuestion1();
                }
                }
            }
            public static void MainQuestion1() {
                System.out.println("------------------------------------------------------------------------");
                    System.out.println("                                                                        ");
                    System.out.println("Welcome to the first level!");
                    System.out.println("                                                                        ");
                    System.out.println("There are three doors. In each door is a way to die.");
                    System.out.println("The first door has fire and lava.");
                    System.out.println("The second door has lions that haven't eaten in 5 years.");
                    System.out.println("In the third door, there is a 1,000-foot drop into alligators. Which door will you likely survive?");
                    System.out.println("A. First door.");
                    System.out.println("B. Second door.");
                    System.out.println("C. Third door.");
                    Scanner scanner = new Scanner(System.in);
                    String q2ans = scanner.nextLine();
                    if (q2ans.equalsIgnoreCase("b")) {
                        System.out.println("You are right! because the lion who hasn't fed in 5 years would be dead!");
                        MainQuestion2();
                    } else {
                        System.out.println("You are wrong! the right answer is second door because the lion who hasn't fed in 5 years would be dead!");
                        System.out.println("a. Can I get another chance?");
                        System.out.println("b. Just o send me thell.");
                        String ansq1c = scanner.nextLine();
                        if (ansq1c.equalsIgnoreCase("a")) {
                            System.out.println("------------------------------------------------------------------------");
                            System.out.println("Okay, I will give you one last chance to get this right.");
                            LastChance();
                        } else if (ansq1c.equalsIgnoreCase("b")) {
                            System.out.println("As you wish.");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣄");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⢿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡷⣄");
                            System.out.println(" ⠀⠀⠀⠀⠀⠀⠀⢠⡾⠁⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠙⢧⡀");
                            System.out.println("⠀⠀⠀⠀⠀⠀⣰⡟⠀⠀⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡇⠀⠘⢷⡄");
                            System.out.println("⠀⠀⠀⠀⠀⢰⡟⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠘⣷⡀");
                            System.out.println("⠀⠀⠀⠀⢀⣿⠁⠀⠀⠀⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠙⣷⠀⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⣼⡏⠀⠀⠀⠀⣸⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡇⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⣿⠃⠀⠀⠀⠀⠸⡇⠀⠀⠀⠀⠀⠀⢀⣤⣤⣴⣶⡿⠿⠛⠛⠛⠛⠛⠛⠛⠛⠛⠻⠶⣶⣤⣄⡀⠀⠀⠀⠀⠀⠀⣸⠁⠀⠀⠀⠀⢹⣿⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⣿⡄⠀⠀⠀⠀⠀⢹⡄⠀⠀⣠⣴⣿⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣤⡀⠀⠀⣰⠇⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠙⠒⠼⣿⣿⢿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣿⣿⣿⣿⡶⠚⠁⠀⠀⠀⠀⠀⠀⣾⡿⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⢻⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡏⠀⢿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⠃⠀⠀⠀⠀");
                            System.out.println("⣾⠀⠀⠀⠈⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⣾⡿⠀⠀⠀⢀⣴");
                            System.out.println("⣿⣧⠀⠀⠀⠸⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⣿⡄⠸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⠁⠀⠀⢀⣾⡏");
                            System.out.println("⣿⣿⣷⡀⠀⠀⠹⣿⣆⠀⠀⠀⠀⠀⠀⣰⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣤⣤⣤⣶⣿⡿⠟⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⢀⣼⣿⠃⠀⠀⣠⣿⣿⡇");
                            System.out.println("⣿⡙⢿⣿⣦⡀⠀⠸⣿⣷⣄⣀⠀⠀⣴⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣧⡀⠀⠀⠀⣠⣾⡿⠁⠀⢀⣴⣿⡟⢹⡇");
                            System.out.println("⢹⡇⠀⠻⣿⣿⣆⡀⢸⣿⣿⣿⣿⣿⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣄⠀⠀⠀⠀⠈⠛⠿⢿⣿⣶⣶⣾⣿⣿⠁⢀⣴⣿⣿⠋⠀⢸⠁");
                            System.out.println("⠸⣿⠀⠀⠙⢿⣿⣷⣽⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⢀⡼⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣇⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⢹⣿⣿⣴⣾⣿⠟⠁⠀⠀⣾⠀");
                            System.out.println("⠀⣿⡀⠀⠀⠀⠙⢿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⣠⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⡿⠋⠀⠀⠀⠀⣿⠀");
                            System.out.println("⠀⠹⣷⠀⠀⠀⠀⠈⣽⣿⣿⣿⣧⠀⠀⠀⠀⠀⠤⠞⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠲⠦⠀⠀⠀⠀⠀⠀⠀⢻⣿⡏⠀⠀⠀⠀⠀⣰⠃⠀");
                            System.out.println("⠀⠀⢿⣧⡀⠀⠀⠀⣿⣿⣿⣿⣿⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠸⣿⡇⠀⠀⠀⠀⣀⠟⠀⠀");
                            System.out.println("⠀⠀⠀⠙⢿⣦⣀⠀⢹⣿⣿⣿⣿⣿⣿⣶⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡶⠚⠉⠁⠀⠀⠀⣿⡇⠀⠀⢀⡶⠋⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⠀⠙⢿⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡻⢦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⣠⠶⢻⣿⠁⠀⠀⠀⠀⠀⠀⢸⡇⣀⡴⠋⠀⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠉⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠈⠛⢦⣀⣀⣀⣾⠀⠀⠀⠀⣿⣄⣀⣀⡴⠋⠁⢠⣿⠏⠀⠀⠀⠀⠀⠀⠀⣼⡟⠉⠀⠀⠀⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⠟⠋⠉⠉⠛⠿⠶⠶⠛⠉⠉⠻⣿⡄⠀⠀⢰⣿⠏⠉⠉⠛⠶⠶⠟⠉⠀⠀⠀⠀⠀⠀⠀⢰⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣇⠀⠀⣼⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⣠⡤⠀⠀⠻⠀⠀⣿⣿⣷⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣦⣤⣀⣀⣀⣤⡴⢿⣿⡀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⠓⣦⣤⣀⣀⣠⣤⣶⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⣯⡀⠀⠙⠛⢷⡀⠀⠀⠀⢸⣿⠟⠛⠉⠀⢠⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⡙⠿⠿⠋⢻⠙⣆⠀⠀⠀⢷⣄⠀⢀⣨⡟⠀⠀⢀⡼⢋⡏⢻⣿⠟⣡⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⡄⠀⠀⢸⡷⣬⡳⢦⣤⣤⣈⣉⣉⣁⣠⣤⡴⢋⡴⢾⠃⠀⠀⣤⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣄⠀⠀⢧⠘⣷⡖⠦⣤⣤⣀⣀⣤⡤⠴⢧⡼⢀⡎⠀⠀⣰⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⡆⠀⠘⣇⠘⢧⠀⠀⠀⠀⠀⠀⠀⠠⡜⢃⡼⠁⠀⣼⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣿⣿⡇⠀⠀⠈⠙⠛⠓⠒⠒⠒⠒⠒⠒⠛⠛⠉⠀⠀⠀⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣷⡀⠀⠀⠠⠔⠒⠛⠛⠿⠿⠛⠓⠒⠢⠄⠀⠀⢠⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣷⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣾⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠛⠛⠛⠛⠋⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    
    
    
                        }
                    }
            }
            public static void LastChance() { 
                System.out.println("------------------------------------------------------------------------");
                System.out.println("                                                                        ");
                System.out.println("Welcome to the first level!");
                System.out.println("                                                                        ");
                System.out.println("There are three doors. In each door is a way to die.");
                System.out.println("The first door has fire and lava.");
                System.out.println("The second door has lions that haven't eaten in 5 years.");
                System.out.println("In the third door, there is a 1,000-foot drop into alligators. Which door will you likely survive?");
                System.out.println("A. First door.");
                System.out.println("B. Second door.");
                System.out.println("C. Third door.");
                Scanner scanner = new Scanner(System.in);
                String q2ans = scanner.nextLine();
                if (q2ans.equalsIgnoreCase("b")) {
                    System.out.println("You are right! because the lion who hasn't fed in 5 years would be dead!");
                    MainQuestion2();
                } else {
                    System.out.println("You are wrong! the right answer is second door because the lion who hasn't fed in 5 years would be dead!");
                    System.out.println("a. Can I get another chance?");
                    System.out.println("b. Just o send me thell.");
                    String ansq1c = scanner.nextLine();
                    if (ansq1c.equalsIgnoreCase("a")) {
                        System.out.println("Sorry your luck runs out!");
                    } else if (ansq1c.equalsIgnoreCase("b")) {
                        System.out.println("As you wish.");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣄");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⢿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡷⣄");
                        System.out.println(" ⠀⠀⠀⠀⠀⠀⠀⢠⡾⠁⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠙⢧⡀");
                        System.out.println("⠀⠀⠀⠀⠀⠀⣰⡟⠀⠀⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡇⠀⠘⢷⡄");
                        System.out.println("⠀⠀⠀⠀⠀⢰⡟⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠘⣷⡀");
                        System.out.println("⠀⠀⠀⠀⢀⣿⠁⠀⠀⠀⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠙⣷⠀⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⣼⡏⠀⠀⠀⠀⣸⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡇⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⣿⠃⠀⠀⠀⠀⠸⡇⠀⠀⠀⠀⠀⠀⢀⣤⣤⣴⣶⡿⠿⠛⠛⠛⠛⠛⠛⠛⠛⠛⠻⠶⣶⣤⣄⡀⠀⠀⠀⠀⠀⠀⣸⠁⠀⠀⠀⠀⢹⣿⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⣿⡄⠀⠀⠀⠀⠀⢹⡄⠀⠀⣠⣴⣿⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣤⡀⠀⠀⣰⠇⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠙⠒⠼⣿⣿⢿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣿⣿⣿⣿⡶⠚⠁⠀⠀⠀⠀⠀⠀⣾⡿⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⢻⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡏⠀⢿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⠃⠀⠀⠀⠀");
                        System.out.println("⣾⠀⠀⠀⠈⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⣾⡿⠀⠀⠀⢀⣴");
                        System.out.println("⣿⣧⠀⠀⠀⠸⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⣿⡄⠸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⠁⠀⠀⢀⣾⡏");
                        System.out.println("⣿⣿⣷⡀⠀⠀⠹⣿⣆⠀⠀⠀⠀⠀⠀⣰⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣤⣤⣤⣶⣿⡿⠟⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⢀⣼⣿⠃⠀⠀⣠⣿⣿⡇");
                        System.out.println("⣿⡙⢿⣿⣦⡀⠀⠸⣿⣷⣄⣀⠀⠀⣴⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣧⡀⠀⠀⠀⣠⣾⡿⠁⠀⢀⣴⣿⡟⢹⡇");
                        System.out.println("⢹⡇⠀⠻⣿⣿⣆⡀⢸⣿⣿⣿⣿⣿⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣄⠀⠀⠀⠀⠈⠛⠿⢿⣿⣶⣶⣾⣿⣿⠁⢀⣴⣿⣿⠋⠀⢸⠁");
                        System.out.println("⠸⣿⠀⠀⠙⢿⣿⣷⣽⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⢀⡼⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣇⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⢹⣿⣿⣴⣾⣿⠟⠁⠀⠀⣾⠀");
                        System.out.println("⠀⣿⡀⠀⠀⠀⠙⢿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⣠⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⡿⠋⠀⠀⠀⠀⣿⠀");
                        System.out.println("⠀⠹⣷⠀⠀⠀⠀⠈⣽⣿⣿⣿⣧⠀⠀⠀⠀⠀⠤⠞⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠲⠦⠀⠀⠀⠀⠀⠀⠀⢻⣿⡏⠀⠀⠀⠀⠀⣰⠃⠀");
                        System.out.println("⠀⠀⢿⣧⡀⠀⠀⠀⣿⣿⣿⣿⣿⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠸⣿⡇⠀⠀⠀⠀⣀⠟⠀⠀");
                        System.out.println("⠀⠀⠀⠙⢿⣦⣀⠀⢹⣿⣿⣿⣿⣿⣿⣶⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡶⠚⠉⠁⠀⠀⠀⣿⡇⠀⠀⢀⡶⠋⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⠀⠙⢿⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡻⢦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⣠⠶⢻⣿⠁⠀⠀⠀⠀⠀⠀⢸⡇⣀⡴⠋⠀⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠉⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠈⠛⢦⣀⣀⣀⣾⠀⠀⠀⠀⣿⣄⣀⣀⡴⠋⠁⢠⣿⠏⠀⠀⠀⠀⠀⠀⠀⣼⡟⠉⠀⠀⠀⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⠟⠋⠉⠉⠛⠿⠶⠶⠛⠉⠉⠻⣿⡄⠀⠀⢰⣿⠏⠉⠉⠛⠶⠶⠟⠉⠀⠀⠀⠀⠀⠀⠀⢰⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣇⠀⠀⣼⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⣠⡤⠀⠀⠻⠀⠀⣿⣿⣷⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣦⣤⣀⣀⣀⣤⡴⢿⣿⡀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⠓⣦⣤⣀⣀⣠⣤⣶⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⣯⡀⠀⠙⠛⢷⡀⠀⠀⠀⢸⣿⠟⠛⠉⠀⢠⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⡙⠿⠿⠋⢻⠙⣆⠀⠀⠀⢷⣄⠀⢀⣨⡟⠀⠀⢀⡼⢋⡏⢻⣿⠟⣡⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⡄⠀⠀⢸⡷⣬⡳⢦⣤⣤⣈⣉⣉⣁⣠⣤⡴⢋⡴⢾⠃⠀⠀⣤⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣄⠀⠀⢧⠘⣷⡖⠦⣤⣤⣀⣀⣤⡤⠴⢧⡼⢀⡎⠀⠀⣰⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⡆⠀⠘⣇⠘⢧⠀⠀⠀⠀⠀⠀⠀⠠⡜⢃⡼⠁⠀⣼⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣿⣿⡇⠀⠀⠈⠙⠛⠓⠒⠒⠒⠒⠒⠒⠛⠛⠉⠀⠀⠀⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣷⡀⠀⠀⠠⠔⠒⠛⠛⠿⠿⠛⠓⠒⠢⠄⠀⠀⢠⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣷⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣾⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠛⠛⠛⠛⠋⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    }       
            }
            
    
            
    
        } public static void MainQuestion2() {
            System.out.println("------------------------------------------------------------------------");
                System.out.println("                                                                        ");
                System.out.println("Welcome to the second level!");
                System.out.println("                                                                        ");
                System.out.println("There are three doors. In each door is a way to die.");
                System.out.println("The first door has fire and lava.");
                System.out.println("The second door has lions that haven't eaten in 5 years.");
                System.out.println("In the third door, there is a 1,000-foot drop into alligators. Which door will you likely survive?");
                System.out.println("A. First door.");
                System.out.println("B. Second door.");
                System.out.println("C. Third door.");
                Scanner scanner = new Scanner(System.in);
                String q2ans = scanner.nextLine();
                if (q2ans.equalsIgnoreCase("b")) {
                    System.out.println("You are right! because the lion who hasn't fed in 5 years would be dead!");
                } else {
                    System.out.println("You are wrong! the right answer is second door because the lion who hasn't fed in 5 years would be dead!");
                    System.out.println("a. Can I get another chance?");
                    System.out.println("b. Just o send me thell.");
                    String ansq1c = scanner.nextLine();
                }
        }
    }
    
        
    
    

