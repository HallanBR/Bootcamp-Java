import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        student.nome = scanner.nextLine();
        student.grade1 = scanner.nextDouble();
        student.grade2 = scanner.nextDouble();
        student.grade3 = scanner.nextDouble();

        System.out.printf("Final grade: %.2f%n" , student.finalGrade());

        if (student.finalGrade() < 60){
            System.out.println("Failed");
            System.out.printf("Missing %.2f points%n" , student.missingPoints());
        }

        scanner.close();
    }
}



