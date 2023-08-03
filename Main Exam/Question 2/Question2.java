import java.io.*;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        BufferedWriter name = new BufferedWriter(new FileWriter("C:\\Users\\Exam\\Desktop\\main\\name.txt"));
        BufferedWriter address = new BufferedWriter(new FileWriter("C:\\Users\\Exam\\Desktop\\main\\address.txt"));
        int n = sc.nextInt();
        BufferedReader nameRead = new BufferedReader(new FileReader("C:\\Users\\Exam\\Desktop\\main\\name.txt"));
        BufferedReader addressRead = new BufferedReader(new FileReader("C:\\Users\\Exam\\Desktop\\main\\address.txt"));
        for(int i=0; i<n; i++){
            System.out.println("Enter the student "+(i+1)+" name");
            name.write(sc.next());
            name.newLine();
            System.out.println("Enter the student "+(i+1)+" address");
            address.write(sc.next());
            address.newLine();
        }
        name.close();
        address.close();
        String nameLine, addressLine;
        for (int i=0;i<2;i++){
            System.out.println("Student "+(i+1)+" details:");
            while((nameLine=nameRead.readLine())!=null){
                System.out.println("Name: "+nameLine);
//                j=j+1;
                break;
            }
            while((addressLine=addressRead.readLine())!=null){
                System.out.println("Address: "+addressLine);
//                k=k+1;
                break;
            }
        }

    }
}
