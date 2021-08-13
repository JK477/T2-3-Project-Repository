
/**
 * Write a description of class ClassAS91896 here.
 *
 * @author Jordan kelland
 * @version 1, 17/06/21 - 18/06/21
 */

import java.util.Scanner; //Keyboard input.

public class ClassAS91896
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int Roundcont; 
    private int play1score = 0;
    private int play2score = 0;
    

    
    /**
     * Constructor for objects of class ClassAS91896
     */
    public ClassAS91896()
    {
        // initialise instance variables
        Scanner inputboard = new Scanner(System.in);
        
        int P1coopwin = 2;
        int P2coopwin = 2;
        int P1defectwin = 3;
        int P2defectwin = 3;
        int P1defectlos = 0;
        int P2defectlos = 0;
        int P1defectdrw = 1;
        int P2defectdrw = 1;
        
        String P1command;
        String P2command;
        String Outcome;
        
        System.out.println("Prisoners Delimma description");
        
        System.out.println("Player 1 enter your move; Cooperate or Defect");
        P1command = inputboard.nextLine();
        System.out.println("Player 1 your move was "+P1command);
        
        System.out.println("Player 2 enter your move; Cooperate or Defect");
        P2command = inputboard.nextLine();
        System.out.println("Player 2 your move was "+P2command);
        
        Outcome = P1command + P2command;

      
        //Logic :
        //P1coopwin = coop1+coop2;
        //P2coopwin = coop1+coop2;
        //P1defectwin = defect1+coop2
        //P2defectwin = defect2+coop1;
        //P1defectlos = coop1+defect2;
        //P2defectlos = coop2+defect1;
        //P1defectdrw = defect1+defect2;
        //P2defectdrw = defect1+defect2;
        
        
        //start of my two dimesional array, taken from another project of mine
        //int board[][] = new int [10][10];
        //for (int x=0;x<10;x++) 
            //for (int y=0;y<10;y++)
                //board[x][y]=(x+1)*(y+1);
        
                
        //for (int x=0;x<10;x++) {
            //for (int y=0;y<10;y++)        
                //System.out.print(board[x][y]+" ");
            //System.out.println();
            //}
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
