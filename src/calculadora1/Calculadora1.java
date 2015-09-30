package calculadora1;

import javax.swing.JOptionPane;

public class Calculadora1 {

    public static void main(String[] args) {
        Seleccion();
    }

    public static int Menu() {
        int Eleccion = 0;
        Boolean Cierre = true;
        do {
            try {
                Eleccion = Integer.parseInt(JOptionPane.showInputDialog("Calculadora :D"
                        + "\nIngrese una de las opciones"
                        + "\n 1- Sumar"
                        + "\n 2- Restar"
                        + "\n 3- Multiplicacion"
                        + "\n 4- Divicion"
                        + "\n 5- Salir"));
                Cierre = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
            }
        } while (Cierre == true);
        return Eleccion;
    }

    public static double Dato1() {
        Boolean Cierre = true;
        double Eleccion = 0;
        do {
            try {
                Eleccion = Double.parseDouble(JOptionPane.showInputDialog("Calculadora :D"
                        + "\n Ingrese el primer numero "));
                Cierre = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
            }
        } while (Cierre == true);
        return Eleccion;
    }

    public static double Dato2() {
        Boolean Cierre = true;
        double Eleccion = 0;
        do {
            try {
                Eleccion = Double.parseDouble(JOptionPane.showInputDialog("Calculadora :D"
                        + "\n Ingrese el segundo numero "));
                Cierre = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
            }
        } while (Cierre == true);
        return Eleccion;
    }

    public static double Dato3() {
        Boolean Cierre = true;
        double Eleccion = 0;
        do {
            try {
                Eleccion = Double.parseDouble(JOptionPane.showInputDialog("Calculadora :D"
                        + "\n Ingrese el segundo numero "));
                Cierre = false;
                if (Eleccion == 0) {
                    JOptionPane.showMessageDialog(null, "El numero deve ser distinto de 0");
                    Cierre = true;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
            }
        } while (Cierre == true);
        return Eleccion;
    }

    public static void Seleccion() {
        switch (Menu()) {
            case 1:
                Suma();
                break;
            case 2:
                Resta();
                break;
            case 3:
                Multiplicacion();
                break;
            case 4:
                Divicion();
                break;
            case 5:
                Salir();
                break;
            default:
                JOptionPane.showMessageDialog(null, "ingrese solo opciones validas");
                Seleccion();
                break;
        }
    }

    public static void Suma() {
        double Resultado = Dato1() + Dato2();
        JOptionPane.showMessageDialog(null, "El resultado es :" + Resultado);
        Seleccion();
    }

    public static void Resta() {
        double Resultado = Dato1() - Dato2();
        JOptionPane.showMessageDialog(null, "El resultado es :" + Resultado);
        Seleccion();
    }

    public static void Multiplicacion() {
        double Resultado = Dato1() * Dato2();
        JOptionPane.showMessageDialog(null, "El resultado es :" + Resultado);
        Seleccion();
    }

    public static void Divicion() {
        double Resultado = Dato1() / Dato3();
        JOptionPane.showMessageDialog(null, "El resultado es :" + Resultado);
        Seleccion();
    }

    public static void Salir() {
        JOptionPane.showMessageDialog(null, "gracias por usar mi calculadora"
                + "\n si quiere mas opciones en la calculadora"
                + "\n por favor done :D");
        System.exit(0);
    }
}
