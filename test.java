public class test {
    public static void main(String[] args) {
        int currentTime = 20;

        if (currentTime < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        String greeting = (currentTime < 18) ? "Good day." : "Good evening.";
        System.out.println(greeting);
    }
}