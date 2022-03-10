package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Maze maze = new Maze();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Princess Bride: Encounter numerous obstacles, enemies and allies in this quest to be reunited with your true love.");
        do {

            System.out.println("Your are in " + maze.currentRoom.getName() + ". " + maze.getCurrentRoomDescription());
            System.out.println("Room Exits: " + maze.getCurrentExits());
            System.out.println("What do you want to do? N=north, S=South, E=East, W=West, U=Up, D=Down, i=interact, l=loot, x=exit, v=inventory");
            char command = scanner.next().toLowerCase().charAt(0);
            if (command == 'n' || command == 'N'){
                maze.move(command);
            }
            else if (command == 's' || command == 'S'){
                maze.move(command);
            }
            else if (command == 'e' || command == 'E'){
                maze.move(command);
            }
            else if (command == 'w' || command == 'W'){
                maze.move(command);
            }
            else if (command == 'u' || command == 'U'){
                maze.move(command);
            }
            else if (command == 'd' || command == 'D'){
                maze.move(command);
            }
            else if (command == 'i' || command == 'I'){
                System.out.println(maze.interactWithCurrentRoom());
            }
            else if (command == 'l' || command == 'L'){
                System.out.println(maze.lootCurrentRoom());
            }
            else if (command == 'x' || command == 'X'){
                maze.exitCurrentRoom();
            }
            else if (command == 'v' || command == 'V'){
                System.out.println("Inventory: " + maze.getPlayerInventory());
            }
            else {
                System.out.println("Invalid Command");
            }
        }while (!maze.isFinished);
        System.out.println(maze.exitCurrentRoom());
        System.out.println("Final score: " + maze.getPlayerScore());
    }
}
