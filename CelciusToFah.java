public class CelciusToFah {
    public static void main(String[] args) {
        System.out.println("Directions\n[0] to go from Cel to Fah\n[1] for Fah to Cel");
        int mode = Integer.parseInt(args[0]);
        double val = Double.parseDouble(args[1]);

        if (mode==0) {
            double fah = (val * (9.0/5)) + 32;
            System.out.println(val + " deg Cel is " + fah + " Fahrenheit");
        }
        else if(mode==1)
        {
            double cel = (val -32.0) * (5.0/9.0);
            System.out.println(val + " deg Fah is " + cel + " Degrees Celcius");
        }
    }
}
