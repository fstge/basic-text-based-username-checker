package usernamepassword;
import java.io.*;
import java.util.Scanner;
public class UsernamePassword {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(System.in);
        String answer;
        /*
        File user = new File("username.txt");
        Scanner usernameFile = new Scanner(user);
        File pass = new File("password.txt");
        Scanner passwordFile = new Scanner(pass);
        String[] listuser = "1","2","3";
        String[] listpass;
        int i = 0;
        while (usernameFile.hasNextLine()) {
            listuser[i] = usernameFile.nextLine();
            i++;
        }
        i = 0;
        while (passwordFile.hasNextLine()) {
            listpass[i] = passwordFile.nextLine();
            i++;
        }
        i=0;
        /*
        while (i <= listpass.length ){
            System.out.println(listuser[i]);
            System.out.println(listpass[i]);
            i++;
            
        }
*/
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
            
        }
    }
}
