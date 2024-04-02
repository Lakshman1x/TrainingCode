public class Main {
    public static void main(String[] args) {
        DBConnect connection= DBConnect.getConnection();
        System.out.println(connection.getMessage());
    }
}