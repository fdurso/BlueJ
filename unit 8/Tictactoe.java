import java.util.*;
/**
 * Write a description of class Tictactoe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tictactoe
{
    private char boardState[][];
    public Tictactoe()
    {
        char boardState[][] = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    }
    
    public void main()
    {
        System.out.printf("Game is Tic-Tac-Toe.\nYou're playing against the computer.\nDon't get too exicited, this isn't some Wargames experience. The computer is choosing with RNG.\nYou're X, computer is O.\nEnter your positions as coordinates as the board suggests. (Eg. A3, B1...)\n");
        Scanner myObj = new Scanner(System.in);
        //main control loop
        while (1)
        {
            user_input();
            printBoard();
            winCheck('X');

            cpu_input();
            printBoard();
            winCheck('O');
        }
    }
    
    public void printBoard()
    {
        System.out.printf("\n    1   2   3 \n\nA   %c | %c | %c \n   -----------\nB   %c | %c | %c \n   -----------\nC   %c | %c | %c \n", boardState[0][0], boardState[0][1], boardState[0][2], boardState[1][0], boardState[1][1], boardState[1][2], boardState[2][0], boardState[2][1], boardState[2][2]);
    }
    
    public void user_input()
    {
        boolean validInput = false;
        String input;
        while (!validInput)
        {
            int rowIndex = 0;
            int colIndex = 0;
            System.out.print("> ");
            input = myObj.nextLine();
            switch(input.substring(0, 1))
            {
                case 'A':
                case 'a':
                    switch(input.substring(1, 2))
                    {
                        case '1':
                            if (boardState[rowIndex][colIndex] != ' ')
                            {
                                spaceOccupied();
                                break;
                            }
                            boardState[rowIndex][colIndex] = 'X';
                            validInput = true;
                            break;
                        case '2':
                            rowIndex++;
                            if (boardState[rowIndex][colIndex] != ' ')
                            {
                                spaceOccupied();
                                break;
                            }
                            boardState[rowIndex][colIndex] = 'X';
                            validInput = true;
                            break;
                        case '3':
                            rowIndex += 2;
                            if (boardState[rowIndex][colIndex] != ' ')
                            {
                                spaceOccupied();
                                break;
                            }
                            boardState[rowIndex][colIndex] = 'X';
                            validInput = true;
                            break;
                            default:
                            format_remind();
                    }
                    break;
                case 'B':
                case 'b':
                    colIndex ++;
                    switch(input.substring(1, 2))
                    {
                    case '1':
                        if (boardState[rowIndex][colIndex] != ' ')
                        {
                            spaceOccupied();
                            break;
                        }
                        boardState[rowIndex][colIndex] = 'X';
                        validInput = true;
                        break;
                    case '2':
                        rowIndex++;
                        if (boardState[rowIndex][colIndex] != ' ')
                        {
                            spaceOccupied();
                            break;
                        }
                        boardState[rowIndex][colIndex] = 'X';
                        validInput = true;
                        break;
                    case '3':
                        rowIndex += 2;
                        if (boardState[rowIndex][colIndex] != ' ')
                        {
                            spaceOccupied();
                            break;
                        }
                        boardState[rowIndex][colIndex] = 'X';
                        validInput = true;
                        break;
                    default:
                        format_remind();
                    }
                break;
                case 'C':
                case 'c':
                    colIndex += 2;
                    switch(input.substring(1, 2))
                    {
                        case '1':
                        if (boardState[rowIndex][colIndex] != ' ')
                        {
                            spaceOccupied();
                            break;
                        }
                        boardState[rowIndex][colIndex] = 'X';
                        validInput = true;
                        break;
                    case '2':
                        rowIndex++;
                        if (boardState[rowIndex][colIndex] != ' ')
                        {
                            spaceOccupied();
                            break;
                        }
                        boardState[rowIndex][colIndex] = 'X';
                        validInput = true;
                        break;
                case '3':
                        rowIndex += 2;
                        if (boardState[rowIndex][colIndex] != ' ')
                        {
                            spaceOccupied();
                            break;
                        }
                        boardState[rowIndex][colIndex] = 'X';
                        validInput = true;
                        break;
                default:
                        format_remind();
                }
                break;
                default:
                    format_remind();
            }
        }
    }
}
