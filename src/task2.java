public class task2 {

    public static void main(String[] args) {

        //2) Create a String and print it in reverse order (Sunday → yadnuS).

        String day = "Sunday";
        String reversedDay = "";

        for (int i = day.length() - 1; i >= 0; i--) {
            reversedDay = reversedDay + day.charAt(i);
        }
        System.out.println(reversedDay);


    }
}
