
import java.util.Scanner;
public class chatBot1_0 {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("""
                Bienvenido al chat bot alpha 1.0\s
                
                Quieres saber como me llamo ?""");
        String pregunta = scanner.nextLine();
        if(pregunta.toString().contains("si")){
            System.out.println("Mi nombre es chat bot 1.0 , continuemos");
        } else if (pregunta.toString().contains("no")) {
            System.out.println("Bueno yo pense que querias saberlo, continuemos entonces ");
        }
        System.out.println("como te llamas?");
        String nombre = scanner.nextLine();
        saludar(nombre);
        System.out.println("\nQuieres saber que opciones tengo?" );
        String pregunta2 = scanner.nextLine();
        if(pregunta.toString().contains("si")){
            System.out.println("Desplegando menu de opciones");
        } else if (pregunta2.toString().contains("no")) {
            System.out.println("Bueno nos despedimos gracias por iniciarme");
            System.exit(0);
        }
        int eleccion=0;
        do {
            opciones();
            eleccion = scanner.nextInt();
            switch (eleccion) {
                case 1:
                    factura();
                    break;
                case 2:
                    codi();
                    break;
                case 3:
                    pyn();
                    break;
                case 4:
                    area();
                    break;
                case 5:
                    adivinador();
                    break;
                case 6:
                    salir();
                    break;
            }
        }while (eleccion!=6);
    }
    static void saludar(String nombreUsario){
        System.out.println("\nEs un gusto "+ nombreUsario);
    }
    static  void opciones (){
        System.out.println("Bueno este es mi menu de opciones ");
        System.out.println("1.-Ayuda a hacer una factura");
        System.out.println("2.-Codificar el nombre de  familiares");
        System.out.println("3.-Saber si un numero es positivo o negativo");
        System.out.println("4.-Area de un triangulo");
        System.out.println("5.-Adivinar la  cuantos años tiene el usuario");
        System.out.println("6.-Salir");
        System.out.println("Escoge una opcion :");
    }
    static  void  salir(){
        System.exit(0);
    }
    static  void factura(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del que estara la factura ");
        String nombreFactura = scanner.nextLine();

        System.out.println("Ingrese el apellido paterno del que esta la factura ");
        String apellidoPFactura = scanner.nextLine();

        System.out.println("Ingrese el apellido materno del que esta la factura ");
        String apellidoMFactura = scanner.nextLine();

        String nombreCFactura = nombreFactura +"\t" +apellidoPFactura+ "\t"+apellidoMFactura+"\t";
        System.out.println("Ingrese el monto del costo del primer producto");
        double precio1 = scanner.nextDouble();

        System.out.println("Ingrese el precio del segundo producto");
        double precio2 = scanner.nextDouble();

        double precioTotal = precio1 + precio2 ;

        double impuesto = precioTotal * 0.19;

        double precioImpuesto = precioTotal + impuesto;
        String factura = "la factura " + nombreCFactura + "con un valor bruto total de " + precioTotal + ", con un impuesto de "+ impuesto + " dando un total de " +precioImpuesto;

        System.out.println(factura);
    }
    static  void codi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del primer familiar");
        String nombrea = scanner.nextLine();
        String nombreA2 = nombrea.toUpperCase().charAt(1) + "." + nombrea.substring(nombrea.length()-2);

        System.out.println("Ingrese el nombre del segundo familiar");
        String nombreb = scanner.nextLine();
        String nombreB2 = nombreb.toUpperCase().charAt(1) + "." + nombreb.substring(nombreb.length()-2);

        System.out.println("Ingrese el nombre del tercer familiar ");
        String nombrec = scanner.nextLine();
        String nombreC2 = nombrec.toUpperCase().charAt(1) + "." + nombrec.substring(nombrec.length()-2);

        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        System.out.println(resultado);
    }
    static  void pyn(){
        System.out.println("Escribe un número:");
        double numero = scanner.nextDouble();
        if (numero == 0) {
            System.out.println("El número es neutro");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }
    }
    static void area(){
        double base, altura, resultado;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese base:\t");
        base = scanner.nextDouble();

        System.out.print("Ingrese altura:\t");
        altura = scanner.nextDouble();

        resultado = ((base*altura)/2);

        System.out.print("El area del Triangulo es:\t"+resultado);
    }
    public static void adivinador(){
        AdivinarEdad obj = new AdivinarEdad();
        obj.adivinar();
    }
    }





