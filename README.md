# DOCUMENTATION
## Find the number is a game made by Jaime Martínez. You have to guess what number have been generated in three attempts. If you fail, you can request another three attempts.
### In this code there are 6 methods:
1. Main method.<br />
This is the main function.

```
public static void main(String[] args)
{
    int i = 0;
    System.out.println("What number is it?. Try to guess it. You have got 3 attempts.");
    double rnumber = randomgen();
    while (i<3)
    {  
        int number = scannumber();
        i = compnumber (rnumber, number, i);
    }
} 
```

2. Scannumber method.<br />
This method scans the keyboard and returns the number that the user has inserted.
```
public static int scannumber()
{
    Scanner inpnumber = new Scanner (System.in); 
    System.out.println("Give me a integer number between 0 and 10");
    int number = inpnumber.nextByte();
    return number;
}
```

3. Compnumber method.<br />
This method test if your number is the same than the ramdon number.
```
public static int compnumber (double rnumber, int number, int i)
{
    if (rnumber == number)
    {
        printyw();
        i = 4;
    }
    else
    {
        System.out.println("No it is not. You have got " + (2-i) + " attempts.");
        i++;
            
    }
    if (i == 3)
    {
        System.out.println("Game Over.");
        i = Annother_class.pa();           
    }
    return i;
}
```
4. Printyw method.<br />
This method only print ***you win***.
```
public static void printyw()
{
    System.out.println("You win");
}
```

5. Randomgen method.<br />
With this method we generated a random number.
```
public static double randomgen()
{ 
    double number =  10*Math.random();
    number = Math.round(number);
    return number;
}
```
6. Pa method.<br />
This method alow you obtain more attempts.
```
public static int pa ()
{
    Scanner answer = new Scanner (System.in); 
    System.out.println("Do you want to play again?/n Set 1  to 1 and 0 to No! ");
    int answern = answer.nextByte();
    if (answern == 1)
    {
        return 0;
    }
    else
    {
        return 4;
    }        
}
```
Pa method is the only one which is in other class.<br /><br />

I have also added a JTest file. If you want to download this proyect you can do it in the next link:<br />
[Link to GitHUB Proyect.Click here!](https://github.com/Jaime18001/ST.git)
