import java.util.Scanner;

class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "admin";
        String pass = "12345";

        System.out.print("Enter Username: ");
        String u = sc.nextLine();
        System.out.print("Enter Password: ");
        String p = sc.nextLine();

        if (u.equals(user) && p.equals(pass))
            System.out.println("Login Successful");
        else
            System.out.println("Invalid Credentials");
    }
}
