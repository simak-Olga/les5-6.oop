package sem5.java;

import java.util.Scanner;

public class main{
    public static Scanner sc = new Scanner(System.in);

    public static int getNum(){
        
    System.out.println("Enter number: ");
    int num;
    if(sc.hasNextIn()){
        num = sc.NextIn();
    }   
        else
    System.out.println(x:"Error! ");
      num = sc.NextIn();
} 
    return num;
}

public static char getOperation(){
   
    System.out.println("Enter operation: ");
    char operation;
    if(sc.hasNextInt()){
     operation = sc.next().charAt(index: 0);
     else 
     System.out.println(x:"Error operation! ");
     sc.next();
     operation = getOperation();
    }
    return operation

public static int getCalc(int number1, int number2, char operation){
    int result;
    switch (operation){
        case '+'':{
            result = number1 + number2;
            break;
        }
        case '-'':{
            result = number1 - number2;
            break;
        }
        case '*':{
            result = number1 * number2;
            break;
        }
        case '/':{
            result = number1 / number2;
            break;     
        }
        default:{
           System.out.println("Операция не распознана.");
           result = getCalc(number1, number2, getOperation());
} 

}  
         return result;
}
  

    public static void main(String[] args){
        int number1 = getNum();
        int number2 = getNum();
        char operation = getOperation();
        int result = getCalc(number1, number2, operation);
        System.out.println("Результат операции:" + result);
    }
}