public class Experiment19 {

    public static void main(String[] args) {
        try {
            String welcomeMessage = welcomeMessage("Prayas");
            System.out.println("The returned welcome message : "
                    + welcomeMessage);
        } catch (NullPointerException npex) {
            System.out.println("Exception handled : "
                    + npex.toString());
        } finally {
            System.out.println("Rest of the clean-up code here");
        }
    }

    private static String welcomeMessage(String name) throws NullPointerException {
        if (name == null) {
            throw new NullPointerException(
                    "Invoke method with VALID name");
        }

        return String.format("Welcome %s", name);
    }
}
