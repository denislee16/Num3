package Game;

import Unit.Hero;
import Battlefield.Battlefield;
import Game.Bot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PlayGame {
    public static void table(ArrayList<String> info) {
        if (info.isEmpty()) {
            info.add("Имя героя: Мечник\nСимвол: S\t Здоровье: 50\t Атака: 5\t Дальность атаки: 1\t Защита: 8\t Перемещение: 3\t Стоимость: 10 серебра");
            info.add("Имя героя: Копьеносец\nСимвол: L\t Здоровье: 35\t Атака: 3\t Дальность атаки: 1\t Защита: 4\t Перемещение: 6\t Стоимость: 15 серебра");
            info.add("Имя героя: Топорщик\nСимвол: A\t Здоровье: 45\t Атака: 9\t Дальность атаки: 1\t Защита: 3\t Перемещение: 4\t Стоимость: 20 золота");
            info.add("Имя героя: Лучник(дл. лук)\nСимвол: B\t Здоровье: 30\t Атака: 6\t Дальность атаки: 5\t Защита: 8\t Перемещение: 2\t Стоимость: 15 серебра");
            info.add("Имя героя: Лучник\nСимвол: O\t Здоровье: 25\t Атака: 3\t Дальность атаки: 3\t Защита: 4\t Перемещение: 4\t Стоимость: 19 серебра");
            info.add("Имя героя: Арбалетчик\nСимвол: W\t Здоровье: 40\t Атака: 100\t Дальность атаки: 10\t Защита: 3\t Перемещение: 5\t Стоимость: 23 золота");
            info.add("Имя героя: Рыцарь\nСимвол: K\t Здоровье: 30\t Атака: 5\t Дальность атаки: 1\t Защита: 3\t Перемещение: 6\t Стоимость: 20 серебра");
            info.add("Имя героя: Кирасир\nСимвол: C\t Здоровье: 50\t Атака: 2\t Дальность атаки: 1\t Защита: 7\t Перемещение: 5\t Стоимость: 23 серебра");
            info.add("Имя героя: Конный лучник\nСимвол: H\t Здоровье: 25\t Атака: 3\t Дальность атаки: 3\t Защита: 2\t Перемещение: 5\t Стоимость: 25 золота");
        }
        for (int i = 0; i < info.size(); i++) {
            System.out.println(info.get(i));
        }
    }

    /*public static ArrayList<Hero> botChoice(Battlefield battlefield, Money botMoney) {
      // ArrayList<Hero> botList = new ArrayList<>();
        if (botMoney.getMoney() >= 20) {
            int heroName = ThreadLocalRandom.current().nextInt(7, 10);
            int x = 0;
            while (heroName > 0) {
                switch (heroName) {
                    case 1: //s
                        if (botMoney.getMoney() >= 10) {
                            Hero botsunit1 = new Hero('1', 50, 5, 1, 8, 3, 10);
                            botMoney.setMoney(botMoney.getMoney() - botsunit1.getCost());
                            battlefield.addHero(botsunit1, x, 0);
                            botList.add(botsunit1);
                            x++;
                            heroName = 0;
                        } else {
                            heroName = 0;
                        }
                        break;
                    case 2: //b
                        if (botMoney.getMoney() >= 15) {
                            Hero botsunit2 = new Hero('2', 30, 6, 5, 8, 2, 15);
                            botMoney.setMoney(botMoney.getMoney() - botsunit2.getCost());
                            battlefield.addHero(botsunit2, x, 0);
                            botList.add(botsunit2);
                            x++;
                            heroName = 0;
                        } else {
                            heroName = 0;
                        }
                        break;
                    case 3: //k
                        if (botMoney.getMoney() >= 20) {
                            Hero botsunit3 = new Hero('3', 30, 5, 1, 3, 6, 20);
                            botMoney.setMoney(botMoney.getMoney() - botsunit3.getCost());
                            battlefield.addHero(botsunit3, x, 0);
                            botList.add(botsunit3);
                            x++;
                            heroName = 0;
                        } else {
                            heroName = 0;
                        }
                        break;
                    case 4:
                        if (botMoney.getMoney() >= 15) {
                            Hero botsunit4 = new Hero('4', 35, 3, 1, 4, 6, 15);
                            botMoney.setMoney(botMoney.getMoney() - botsunit4.getCost());
                            battlefield.addHero(botsunit4, x, 0);
                            botList.add(botsunit4);
                            x++;
                            heroName = ThreadLocalRandom.current().nextInt(1, 4);
                        } else {
                            heroName = 1;
                        }
                        break;
                    case 5:
                        if (botMoney.getMoney() >= 19) {
                            Hero botsunit5 = new Hero('5', 25, 3, 3, 4, 4, 19);
                            botMoney.setMoney(botMoney.getMoney() - botsunit5.getCost());
                            battlefield.addHero(botsunit5, x, 0);
                            botList.add(botsunit5);
                            x++;
                            heroName = ThreadLocalRandom.current().nextInt(1, 4);
                        } else {
                            heroName = 2;
                        }
                        break;
                    case 6:
                        if (botMoney.getMoney() >= 23) {
                            Hero botsunit6 = new Hero('6', 50, 2, 1, 7, 5, 23);
                            botMoney.setMoney(botMoney.getMoney() - botsunit6.getCost());
                            battlefield.addHero(botsunit6, x, 0);
                            botList.add(botsunit6);
                            x++;
                            heroName = ThreadLocalRandom.current().nextInt(1, 4);
                        } else {
                            heroName = 3;
                        }
                        break;
                    case 7:
                        if (botMoney.getMoney() >= 20) {
                            Hero botsunit7 = new Hero('7', 45, 9, 1, 3, 4, 20);
                            botMoney.setMoney(botMoney.getMoney() - botsunit7.getCost());
                            battlefield.addHero(botsunit7, x, 0);
                            botList.add(botsunit7);
                            x++;
                            heroName = ThreadLocalRandom.current().nextInt(4, 7);
                        } else {
                            heroName = 4;
                        }
                        break;

                    case 8:
                        if (botMoney.getMoney() >= 23) {
                            Hero botsunit8 = new Hero('8', 40, 7, 6, 3, 2, 23);
                            botMoney.setMoney(botMoney.getMoney() - botsunit8.getCost());
                            battlefield.addHero(botsunit8, x, 0);
                            botList.add(botsunit8);
                            x++;
                            heroName = ThreadLocalRandom.current().nextInt(4, 7);
                        } else {
                            heroName = 5;
                        }
                        break;
                    case 9:
                        if (botMoney.getMoney() >= 25) {
                            Hero botsunit9 = new Hero('9', 25, 3, 3, 2, 5, 25);
                            botMoney.setMoney(botMoney.getMoney() - botsunit9.getCost());
                            battlefield.addHero(botsunit9, x, 0);
                            botList.add(botsunit9);
                            x++;
                            heroName = ThreadLocalRandom.current().nextInt(4, 7);
                        } else {
                            heroName = 6;
                        }
                        break;
                }
            }
        }
        System.out.println("\nВ сундуке противника осталось " + botMoney.getMoney() + " золота");
        return botList;
    } */

    /* public static void playerChoice(Battlefield battlefield, ArrayList<Hero> list, Money money) {
        Scanner console = new Scanner(System.in);
        System.out.println("\nВведите количество героев, которых Вы хотите приобрести: ");
        int n = console.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nВведите символ героя, которого хотите приобрести:");
            char symbol = console.next().charAt(0);
            switch (symbol) {
                case 'S':
                    if (money.getMoney() > 10) {
                        Hero unit1 = new Hero('S', 50, 5, 1, 8, 3, 10);
                        money.setMoney(money.getMoney() - unit1.getCost());
                        battlefield.addHero(unit1, i, 9);
                        list.add(unit1);
                    } else {
                        System.out.println("Не хватает золота");
                    }
                    break;
                case 'L':
                    if (money.getMoney() > 15) {
                        Hero unit2 = new Hero('L', 35, 3, 1, 4, 6, 15);
                        money.setMoney(money.getMoney() - unit2.getCost());
                        battlefield.addHero(unit2, i, 9);
                        list.add(unit2);
                    } else {
                        System.out.println("Не хватает золота");
                    }
                    break;
                case 'A':
                    if (money.getMoney() > 20) {
                        Hero unit3 = new Hero('A', 45, 9, 1, 3, 4, 20);
                        money.setMoney(money.getMoney() - unit3.getCost());
                        battlefield.addHero(unit3, i, 9);
                        list.add(unit3);
                    } else {
                        System.out.println("Не хватает золота");
                    }
                    break;
                case 'B':
                    if (money.getMoney() > 15) {
                        Hero unit4 = new Hero('B', 30, 6, 5, 8, 2, 15);
                        money.setMoney(money.getMoney() - unit4.getCost());
                        battlefield.addHero(unit4, i, 9);
                        list.add(unit4);
                    } else {
                        System.out.println("Не хватает золота");
                    }
                    break;
                case 'O':
                    if (money.getMoney() > 19) {
                        Hero unit5 = new Hero('O', 25, 3, 3, 4, 4, 19);
                        money.setMoney(money.getMoney() - unit5.getCost());
                        battlefield.addHero(unit5, i, 9);
                        list.add(unit5);
                    } else {
                        System.out.println("Не хватает золота");
                    }
                    break;
                case 'W':
                    if (money.getMoney() > 23) {
                        Hero unit6 = new Hero('W', 40, 100, 10, 3, 2, 23);
                        money.setMoney(money.getMoney() - unit6.getCost());
                        battlefield.addHero(unit6, i, 9);
                        list.add(unit6);
                    } else {
                        System.out.println("Не хватает золота");
                    }
                    break;
                case 'K':
                    if (money.getMoney() > 20) {
                        Hero unit7 = new Hero('K', 30, 5, 1, 3, 6, 20);
                        money.setMoney(money.getMoney() - unit7.getCost());
                        battlefield.addHero(unit7, i, 9);
                        list.add(unit7);
                    } else {
                        System.out.println("Не хватает золота");
                    }
                    break;
                case 'C':
                    if (money.getMoney() > 23) {
                        Hero unit8 = new Hero('C', 50, 2, 1, 7, 5, 23);
                        money.setMoney(money.getMoney() - unit8.getCost());
                        battlefield.addHero(unit8, i, 9);
                        list.add(unit8);
                    } else {
                        System.out.println("Не хватает золота");
                    }
                    break;
                case 'H':
                    if (money.getMoney() > 25) {
                        Hero unit9 = new Hero('H', 25, 3, 3, 2, 5, 25);
                        money.setMoney(money.getMoney() - unit9.getCost());
                        battlefield.addHero(unit9, i, 9);
                        list.add(unit9);
                    } else {
                        System.out.println("Не хватает золота");
                    }
                    break;
                default:
                    System.out.println("Такого героя нельзя выбрать. Введите заново символ героя");
                    i--;
                    break;
            }
            System.out.println("\nВ Вашем сундуке осталось " + money.getMoney() + " золота");
        }
    } */

    public static void botThinks(ArrayList<Hero> playersList, ArrayList<Hero> botList, Battlefield battlefield, Money botsMoney) {
        int flag = 0;
        for (int i = 0; i < botList.size(); i++) {
            for (int j = 0; j < playersList.size(); j++) {
                if (Math.abs(botList.get(i).getY() - playersList.get(j).getY()) + Math.abs(botList.get(i).getX() - playersList.get(j).getX()) <= botList.get(i).getRange()) {
                    System.out.println("Противник атаковал героя " + playersList.get(j).getName());
                    botList.get(i).decrease_health(playersList, playersList.get(j), battlefield, botsMoney);
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                break;
            }
        }
        if (flag == 0) {
            if (botList.size() > 0) {
                int numOfHero = ThreadLocalRandom.current().nextInt(0, botList.size());
                int a = botList.get(numOfHero).getTravel() / 2;
                int dx = ThreadLocalRandom.current().nextInt(-a, a + 1);
                int dy = ThreadLocalRandom.current().nextInt(-a, a + 1);
                while (botList.get(numOfHero).getX() + dx >= battlefield.getSize() || botList.get(numOfHero).getX() + dx < 0 ||
                        botList.get(numOfHero).getY() + dy < 0 || botList.get(numOfHero).getY() + dy >= battlefield.getSize() ||
                        battlefield.testCoord(botList.get(numOfHero).getX() + dx, botList.get(numOfHero).getY() + dy)
                        || Math.abs(dx) + Math.abs(dy) > battlefield.penalty(botList.get(numOfHero), botList.get(numOfHero).getX() + dx, botList.get(numOfHero).getY() + dy)) {
                    dx = ThreadLocalRandom.current().nextInt(-a, a + 1);
                    dy = ThreadLocalRandom.current().nextInt(-a, a + 1);
                }
                battlefield.removeHero(botList.get(numOfHero).getX(), botList.get(numOfHero).getY());
                battlefield.addHero(botList.get(numOfHero), botList.get(numOfHero).getX() + dx, botList.get(numOfHero).getY() + dy);
                System.out.println("\nПротивник сделал ход");
            }
        }
    }

    public static void aliveUnit(ArrayList<Hero> player, ArrayList<Hero> bot) {
        System.out.println("\nВаши герои:");
        for (int i = 0; i < player.size(); i++) {
            System.out.println(player.get(i));
        }
        System.out.println("Герои противника:");
        for (int i = 0; i < bot.size(); i++) {
            System.out.println(bot.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Money playersMoney = new Money(30, ThreadLocalRandom.current().nextInt(0, 51));
        Money botsMoney = new Money(30, ThreadLocalRandom.current().nextInt(40, 56));
        Battlefield battlefield = new Battlefield();
        Player player = new Player();
        Bot bot = new Bot();
        ArrayList<String> units = new ArrayList<>();
        System.out.println("На Ваш город готовится нападение! В Вашем сундуке " + playersMoney.getMoney() + " золота и " + playersMoney.getSilver() + " серебра." +
                " Покупайте героев и защищайте свой город!\nУ противника есть босс. Его имя - 'Б'. За его смерть Вы получите золото, за остальных - серебро\n");

        table(units);
        player.playerChoice(battlefield, playersMoney);
        bot.botChoice(battlefield, botsMoney);
        battlefield.barrier();
        Scanner in = new Scanner(System.in);
        int n = 1;
        int choice;

        while (!player.getPlayerList().isEmpty() && !bot.getBotList().isEmpty()) {
            if (n % 4 == 0) {
                System.out.println("\nНажмите 0, если хотите приобрести новых героев. Если Вам сейчас не нужны герои, то нажмите на любую другую цифру");
                System.out.println("\nВ Вашем сундуке осталось " + playersMoney.getMoney() + " золота и " + playersMoney.getSilver() + " серебра\n");
                table(units);
                choice = in.nextInt();
                if (choice == 0) {
                    player.playerChoice(battlefield, playersMoney);
                }
                bot.botChoice(battlefield, botsMoney);
            }
            aliveUnit(player.getPlayerList(), bot.getBotList());
            battlefield.draw();
            System.out.println("\nНажмите 0, если хотите переместиться. Нажмите 1, если хотите нанести удар. И любую другую цифру, если хотите пропустить ход\n");
            choice = in.nextInt();
            if (choice == 0) {
                System.out.println("Старайтесь избегать препятствия!\n" +
                        "! – Дерево\n" +
                        "# - Болото\n" +
                        "@ - Холм\n" +
                        "Выберите героя, которым хотите переместиться:"); //or coordinats?
                int flag = 1;
                char symbol = in.next().charAt(0);
                for (int i = 0; i < player.getPlayerList().size(); i++) {
                    if (symbol == player.getPlayerList().get(i).getName()) {
                        player.getPlayerList().get(i).move(battlefield);
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1) {
                    System.out.println("Неправильно выбран герой. Вы пропускаете ход");
                }
                botThinks(player.getPlayerList(), bot.getBotList(), battlefield, botsMoney);
            } else if (choice == 1) {
                System.out.println("Выберите героя, которым хотите атаковать противника:");
                int flag = 1;
                char symbol = in.next().charAt(0);
                for (int i = 0; i < player.getPlayerList().size(); i++) {
                    if (symbol == player.getPlayerList().get(i).getName()) {
                        System.out.println("Кого хотите атаковать?");
                        symbol = in.next().charAt(0);
                        for (int j = 0; j < bot.getBotList().size(); j++) {
                            if (symbol == bot.getBotList().get(j).getName()) {
                                player.getPlayerList().get(i).attack(bot.getBotList(), bot.getBotList().get(j), battlefield, playersMoney);
                                flag = 0;
                                break;
                            }
                        }
                        if (flag == 1) {
                            flag = 2;
                        }
                        break;
                    }
                }
                if (flag == 1) {
                    System.out.println("Неправильно выбран герой. Вы пропускаете ход");
                } else if (flag == 2) {
                    System.out.println("У врага такого героя нет. Вы пропускаете ход");
                }
                botThinks(player.getPlayerList(), bot.getBotList(), battlefield, botsMoney);
            }
            n++;
        }
        if (player.getPlayerList().isEmpty()) {
            System.out.println("Вы проиграли!");
        } else {
            System.out.println("Вы выиграли!");
        }
    }
}
