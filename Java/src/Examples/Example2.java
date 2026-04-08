package Examples;

public class Example2 {
    public static void ABC() {
        Object instances[] = new Object[3];

        instances[0] = "Hi";
        instances[1] = "Bye";
        instances[2] = 12;

        String data;

        for (int i=0; i<instances.length; i++)
        {
            data = (String) instances[i];
            System.out.println("data : " + data.toUpperCase());
        }
    }


}
