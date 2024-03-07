public class Lab_0_4_UnitConversion {
    public static void main(String[] args) {
        System.out.println("Directions\n[0] to go from km to m\n[1] for m to km\n[1] for m to km\\n" + //
                "");
        int mode = Integer.parseInt(args[0]);
        double val = Double.parseDouble(args[1]);

        if (mode == 0) {
            double m = val * 1000;
            System.out.println(val + " deg km is " + m + " meters");
        } else if (mode == 1) {
            double km = val / 1000.0;
            System.out.println(val + " deg s is " + km + " Degrees Celsius");
        }
    }
}
