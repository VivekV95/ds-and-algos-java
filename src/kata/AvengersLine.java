package kata;

import java.util.ArrayList;
import java.util.List;
//The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line. Each of them has a single 100, 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.
//
//Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.
//
//Can Vasya sell a ticket to every person and give change if he initially has no money and sells the tickets strictly in the order people queue?
//
//Return YES, if Vasya can sell a ticket to every person and give change with the bills he has at hand at that moment. Otherwise return NO.
public class AvengersLine {
    public static String Tickets(int[] peopleInLine) {
        return solution2(peopleInLine);
    }

    public static String solution1(int[] peopleInLine) {
        List<Integer> soldTickets = new ArrayList<>(peopleInLine.length);
        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] == 25) {
                soldTickets.add(25);
            } else {
                if (peopleInLine[i] == 50) {
                    int num25s = 0;
                    for (int j = 0; j < soldTickets.size(); j++) {
                        if (soldTickets.get(j) == 25) {
                            num25s++;
                            soldTickets.set(j, 0);
                            break;
                        }
                    }
                    if (num25s == 0)
                        return "NO";
                    soldTickets.add(50);
                } else {
                    int num25s = 0;
                    List<Integer> indicesOf25 = new ArrayList<>(3);
                    for (int j = 0; j < soldTickets.size(); j++) {
                        if (soldTickets.get(j) == 25) {
                            num25s++;
                            indicesOf25.add(j);
                            if (num25s == 3) {
                                break;
                            }
                        }
                    }
                    int indexOf50 = -1;
                    for (int j = 0; j < soldTickets.size(); j++) {
                        if (soldTickets.get(j) == 50) {
                            indexOf50 = j;
                            break;
                        }
                    }
                    if (num25s >= 1 && indexOf50 != -1) {
                        soldTickets.set((indicesOf25.get(0)), 0);
                        soldTickets.set(indexOf50, 0);
                    } else if (num25s >= 3) {
                        for (int index = 0; index <= 2; index++) {
                            soldTickets.set(indicesOf25.get(index), 0);
                        }
                    } else
                        return "NO";
                    soldTickets.add(100);
                }
            }
        }
        return "YES";
    }

    public static String solution2(int[] peopleInLine) {
        int bill25 = 0;
        int bill50 = 0;
        for (int person : peopleInLine) {
            switch (person) {
                case 25:
                    bill25++;
                    break;
                case 50:
                    bill25--;
                    bill50++;
                    break;
                case 100:
                    if (bill50 >= 1) {
                        bill50--;
                        bill25--;
                    } else {
                        bill25 -= 3;
                    }
                    break;
            }
            if (bill25 < 0 || bill50 < 0)
                return "NO";
        }
        return "YES";
    }

}
