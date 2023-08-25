import java.util.Scanner;
import java.util.Random;
class RockPaperScissor
{
    public static void main(String[] args)
    {
        char[] rps={'r','p','s'};
        char user,computer;
        System.out.println("====================================================");
        System.out.println("\t Rock Paper Scissor Game");
        System.out.println("====================================================");
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            while(true)
            {
                System.out.print("Enter Your Choice (r/p/s):");
                user=sc.next().toLowerCase().charAt(0);
                if(user=='r'|| user=='p' || user=='s')
                    break;
                else
                {
                    System.out.println(user+" is not a Valid Choice");
                    System.out.println("Please Enter A Valid Choice");
                    System.out.println("------------------------------------------");
                    continue;
                }
            }
            computer= rps[new Random().nextInt(rps.length)];
            System.out.println("------------------------------------------");
            System.out.println("Computer Move : "+computer);
            System.out.println("User Move     : "+user);
            System.out.println("------------------------------------------");
            Result(computer,user);
            System.out.println("------------------------------------------");
            System.out.print("Do You Want To Play Again (Y / N) : ");
            char choice=sc.next().toLowerCase().charAt(0);
            System.out.println("------------------------------------------");
            if(choice == 'y')
             continue;
            else
              break;
        }
    }
    public static void Result(char computer,char user)
    {
        if(computer==user)
            System.out.println("Game was Tie....");
              
        else if(computer=='r')
        {
            if(user=='p')
                System.out.println("You Won The Game....");
                
            else if(user=='s')
                System.out.println("Computer Won The Game....");      
        }
        else if(computer=='p')
        {
            if(user=='r')
                System.out.println("Computer Won The Game....");
                
            else if(user=='s')
                System.out.println("You Won The Game....");
        }
        else if(computer=='s')
        {
            if(user=='p')
                System.out.println("Computer Won The Game....");
                 
            else if(user=='r')
                System.out.println("You Won The Game....");
        }
    }
}