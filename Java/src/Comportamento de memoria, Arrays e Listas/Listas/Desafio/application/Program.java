package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>(); 

        System.out.println("How many employees will be registered? ");
        int N = sc.nextInt();

        for (int i=0; i<N; i++){
            System.out.println("");
            System.out.println("Employee #" + (i+1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println(" This Id already token! Try again");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
                sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

// Procura o ID
System.out.println();
        System.out.println("Enter the employee id that have salary increase: ");
        int idSalary = sc.nextInt();
// Verifica se o ID existe, caso nao exista imprime uma mensagem

        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        if (emp == null){
            System.out.println("This ID does not exist!");
        }else{
// Caso o ID exista, incrementa uma porcentagem no salario do mesmo
            System.out.println("Enter the percentage");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee>list, int id){
            Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
