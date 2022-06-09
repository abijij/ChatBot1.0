import java.util.Scanner;
public class AdivinarEdad {

    public AdivinarEdad(){
    }
    public static  void adivinar(){
        Scanner scanner = new Scanner(System.in);
        int r1,r2,r3,r4,r5 = 0,r6,r7 ,r8,pregunta;
        String edadf = null;
        System.out.println("Dame un numero del 1 al 10");
         r1 = scanner.nextInt();
         r2 = r1*2;
         r3 = r2+5;
         r4 = r3*50;
        System.out.println("Ingresa la fecha de  tu nacimiento");
        r6= scanner.nextInt();
        System.out.println("Ya paso tu cumpleaños?"+"\n1.-si"+"\n2.-no");
         pregunta = scanner.nextInt();
        if (pregunta > 1) {
            r5 = 1771;
        } else {
            r5 = 1772;
        }
        r7 = r4 + r5;
        r8= r7 - r6 ;
        String edad = Integer.toString(r8);
        System.out.println("Tu edad es : " +edad.substring(1,3));

    }

}
