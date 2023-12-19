import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner mivariable=new Scanner(System.in);
        /*System.out.println("Hello world!");
        System.out.println("Ejercicios");
        String[] marcas={"Mercedes","Nissan","Ferrari","BMW","Kia","Suzuki","Peugeot","Chevrolet","Citroen","Mazda"};
        int[] pares={2,4,6,8,10,12,14,16,18,20};
        System.out.println(marcas[0]);
        for(int i=0;i<10;i++){
            System.out.println(marcas[i]);
        }
        marcas[0]="Toyota";
        System.out.println("\nValor nuevo");
        for(int i=0;i<10;i++){
            System.out.println(marcas[i]);
        }
        System.out.println(marcas.length); //Longitud del arreglo

        //Array de dos dimensiones
        int[][] numeros={{1,2,3,4},{5,6,7,8}};
        //System.out.println(numeros.length); //Imprime 2
        //System.out.println(numeros[0].length); //Longitud de la fila
        //System.out.println(numeros[0][0]);  //Imprime 1
        //System.out.println(numeros[0][0]); //Direccion de memoria
        for (int i=0;i<numeros.length;i++){ //Bucle anidado para imprimir todos los valores
            for (int j=0;j<numeros[0].length;j++){
                System.out.println(numeros[i][j]);
            }
        }
        System.out.println("Ingrese el numero de estudiantes: ");
        int estudiantes= mivariable.nextInt();
        double[] materia1=new double[estudiantes];
        double[] materia2=new double[estudiantes];
        double[] materia3=new double[estudiantes];
        double nota,nota2,nota3;
        for (int i=0;i<estudiantes;i++){
            System.out.println("Ingrese la nota de la materia 1 estudiante "+(i+1));
            nota= mivariable.nextDouble();
            materia1[i]=nota;
            System.out.println("Ingrese la nota de la materia 2 estudiante "+(i+1));
            nota2= mivariable.nextDouble();
            materia2[i]=nota2;
            System.out.println("Ingrese la nota de la materia 3 estudiante "+(i+1));
            nota3= mivariable.nextDouble();
            materia3[i]=nota3;
        }
        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Notas del estudiante " + (i+1) + ":");
            System.out.println("Materia 1: " + materia1[i]);
            System.out.println("Materia 2: " + materia2[i]);
            System.out.println("Materia 3: " + materia3[i]);
        }*/
        //Conversiones
        int mientero=0;
        double midouble=mientero;
        double otrodouble=9.0;
        System.out.println(mientero);
        System.out.println(midouble);
        System.out.println(otrodouble);

        double midoble=9.45d;
        int entero=(int)midoble;
        System.out.println(entero);
        System.out.println(midoble);

        String mystring="12345";
        int numeroConvertido=Integer.valueOf(mystring); //Integer es una clase, con metodo valueof tranforma
        System.out.println(numeroConvertido+1);
        float numerodos=Float.valueOf(mystring);
        System.out.println(numerodos);

    }
}