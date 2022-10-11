package MultidimensionalArraysExercise;

import java.util.Scanner;

public class TheHeiganDance_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double hsStartPoints = 3000000.0;
        int playerStartPoints = 18500;

        int playerStartRow = 7;
        int playerStartCol = 7;

        String lastSpell = "";
        boolean activeCloud = false;

        double damage = Double.parseDouble(scanner.nextLine());

        while (playerStartPoints > 0 && hsStartPoints > 0) {
            hsStartPoints -= damage;

            if (activeCloud) {
                playerStartPoints -= 3500;
                activeCloud = false;

                if (playerStartPoints < 0) {
                    break;
                }
            }

            if (hsStartPoints < 0) {
                break;
            }

            String[] tokens = scanner.nextLine().split("\\s+");

            String spell = tokens[0];
            int row = Integer.parseInt(tokens[1]);
            int col = Integer.parseInt(tokens[2]);

            boolean[][] hsChamber = new boolean[15][15];
            for (int i = row - 1; i <= row + 1; i++) {
                if (i >= 0 && i < hsChamber.length) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        if (j >= 0 && j < hsChamber[row].length) {
                            hsChamber[i][j] = true;
                        }
                    }
                }
            }

            if (hsChamber[playerStartRow][playerStartCol]) {
                if (isRowValid(hsChamber, playerStartRow - 1) && !hsChamber[playerStartRow - 1][playerStartCol]) {
                    playerStartRow--; // move up
                } else if (isColValid(hsChamber, playerStartCol + 1) && !hsChamber[playerStartRow][playerStartCol + 1]) {
                    playerStartCol++; // move right
                } else if (isRowValid(hsChamber, playerStartRow + 1) && !hsChamber[playerStartRow + 1][playerStartCol]) {
                    playerStartRow++; // move down
                } else if (isColValid(hsChamber, playerStartCol - 1) && !hsChamber[playerStartRow][playerStartCol - 1]) {
                    playerStartCol--; // move left
                }

                if (hsChamber[playerStartRow][playerStartCol]) {
                    switch (spell) {
                        case "Cloud":
                            playerStartPoints -= 3500;
                            activeCloud = true;
                            lastSpell = "Plague Cloud";
                            break;
                        case "Eruption":
                            playerStartPoints -= 6000;
                            lastSpell = spell;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid spell: " + spell);
                    }
                }
            }
        }

        if (hsStartPoints > 0) {
            System.out.printf("Heigan: %.2f%n", hsStartPoints);
        } else {
            System.out.println("Heigan: Defeated!");
        }
        if (playerStartPoints > 0) {
            System.out.printf("Player: %d%n", playerStartPoints);
        } else {
            System.out.println("Player: Killed by " + lastSpell);
        }

        System.out.println("Final position: " + playerStartRow + ", " + playerStartCol);
    }

    private static boolean isRowValid(boolean[][] hsChamber, int startPlRow) {
        return startPlRow >= 0 && startPlRow < hsChamber[startPlRow].length;
    }

    private static boolean isColValid(boolean[][] hsChamber, int startPlCol) {
        return startPlCol >= 0 && startPlCol < hsChamber.length;
    }
}

