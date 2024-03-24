package Battlefield;

import Unit.Hero;

import java.util.concurrent.ThreadLocalRandom;

public class Battlefield {

    private char[][] field;
    private int size = 10;

    public Battlefield() {
        field = new char[size][size];
        CreateField();
    }

    private void CreateField() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = '*';
            }
        }
    }

    public void barrier() {
        int x;
        int y;
        int chance;
        int n = ThreadLocalRandom.current().nextInt(1, 8);
        for (int i = 0; i < n; i++) {
            chance = ThreadLocalRandom.current().nextInt(1, 4);
            x = ThreadLocalRandom.current().nextInt(0, 10);
            y = ThreadLocalRandom.current().nextInt(1, 9);
            if (chance == 1) {
                field[y][x] = '!'; //Дерево
            } else if (chance == 2) {
                field[y][x] = '#';  //Болото
            } else {
                field[y][x] = '@'; // Холм
            }
        }
    }

    public int penalty(Hero unit, int x, int y) {
        double unitTravel = unit.getTravel();
        int j = unit.getY();
        int i = unit.getX();
        while ((j != y) || (i != x)) {
            if (field[j][i] == '!') {
                unitTravel -= unit.getTreePenalty();
            } else if (field[j][i] == '#') {
                unitTravel -= unit.getSwampPenalty();
            } else if (field[j][i] == '@') {
                unitTravel -= unit.getHillPenalty();
            }
            if ((i == x) && (j != y)) {
                if (j > y) {
                    j--;
                } else {
                    j++;
                }
            }
            if (i != x) {
                if (i > x) {
                    i--;
                } else {
                    i++;
                }
            }
        }
        int rez = (int) Math.floor(unitTravel);
        return rez;
    }

    public void addHero(Hero player, int x, int y) {
        field[y][x] = player.getName();
        player.setXY(x, y);
    }

    public void removeHero(int x, int y) {
        if (x >= 0 && x < size && y >= 0 && y < size) {
            field[y][x] = '*';
        }
    }

    public boolean testCoord(int x, int y) {
        return field[y][x] != '*';
    }

    public void draw() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }
}