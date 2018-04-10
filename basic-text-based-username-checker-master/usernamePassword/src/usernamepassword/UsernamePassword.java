package usernamepassword;
import java.io.*;
import java.util.Scanner;
public class UsernamePassword {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(System.in);
        String answer;
        boolean correct = false;
        
        System.out.println("type 'new' for new username and password");
        System.out.println("Otherwise enter your username");
        answer = reader.nextLine();
        if (answer.equals("new")){
            System.out.println("Enter your new username");
            answer = reader.nextLine();
            try {
                FileWriter fw = new FileWriter("username.txt", true);
                BufferedWriter out;
                out = new BufferedWriter(fw);
                out.append(answer);
                out.newLine();
            
                out.close();
            } catch (IOException e) {}
            System.out.println("Enter your new password");
            answer = reader.nextLine();
            try {
                FileWriter fw = new FileWriter("password.txt", true);
                BufferedWriter out;
                out = new BufferedWriter(fw);
                out.append(answer);
                out.newLine();
            
                out.close();
            } catch (IOException e) {}
        } else {
            System.out.println("Checking");
            try{
                String line;
                FileReader passReader = new FileReader("username.txt");
                BufferedReader bufferedReader = new BufferedReader(passReader);
                FileReader passwReader = new FileReader("password.txt");
                BufferedReader bufferedReaderp = new BufferedReader(passwReader);
                int i = 0;
                   while(true) {
                    i++;
                    line = bufferedReader.readLine();
                    if(answer.equals(line)){
                        correct = true;
                        System.out.println("Username found");
                        return;
                    } else if (line == null){
                        correct = false;
                        System.out.println("There is no username called " + answer);
                        return;
                    }
                   }
                    
                    if(correct == true){
                        System.out.println("Please enter the password for user "+ answer);
                        answer = reader.nextLine();
                        int n = 0;
                        while (true){
                            n++;
                            line = bufferedReaderp.readLine();
                            if (answer.equals(line) && n == i){
                                System.out.println("You are now logged in");
                                return;
                            } else if (line == null){
                                System.out.println("That is not the correct password");
                                return;
                            }
                        }
                    }
                    }catch (IOException e) { System.out.println(e.getMessage());}
                } 
                   
            } 
        }
    

