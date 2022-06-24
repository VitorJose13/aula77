import java.util.Scanner;

class Person {

    String name;
    String phoneNumber;
    String email;

    //método construtor de uma classe Java
    public Person(String name, String phoneNumber, String email) {

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        
    }

    //método setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("PhoneNumber: " + phoneNumber);
        System.out.println("Email: " + email);
    }


}

public class ContactList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Person persons[] = new Person[3];

        System.out.println("Preencher lista de contatos");

        for (int i = 0; i < persons.length; i++) {

            System.out.println("Nome da pessoa " + i + ":");
            String name = scanner.nextLine();

            System.out.println("Nnumero da pessoa " + i + ":");
            String phoneNumber = scanner.nextLine();

            System.out.println("Email da pessoa " + i + ":");
            String email = scanner.nextLine();

            //criando um novo objeto de classs Person com os atributos informados 
            persons[i] = new Person(name, phoneNumber, email);
        }

        System.out.println("Lista de contatos");
        for(Person person : persons) {
            person.displayPerson();
            System.out.println();
        }

        System.out.println("Informe o índice da pessoa para mudar o telefone:");
        int index = scanner.nextInt();

        System.out.println("Pessoa a ter o telefone alterado:");

        //buscando um objeto pelo indice no array
        Person person = persons[index];

        person.displayPerson();
        System.out.println();


        //alterando um valor do objeto
        person.setPhoneNumber("498888888888");
        person.displayPerson();

        scanner.close();
        
    }
}
