
package sistemas;

import java.util.Scanner;

public class App {
    
    // DiseÃ±e un algoritmo para saludar al usuario: Hola usuario. El nombre del usuario es ingresado por teclado
    public static String saludarUsuario(String nombre) {
        try {
            Scanner en = new Scanner(System.in);
            System.out.println("INGRESA TU NOMBRE DE USUARIO");
            nombre = en.nextLine();
            
            System.out.println("Hola " + nombre );
        return nombre;
        } catch (Exception e) {
            return nombre;
        }
       
    }

    // DiseÃ±e un algoritmo que lea por teclado una velocidad en Km/seg y la convierta a metros/seg y a metros/hora
    // retorne el valor en formato string (metrosPorSeg + "|" + metrosPorHora)
    public static String convertirVelocidad(double kmPorSeg) {
        try {
            Scanner en = new Scanner(System.in);
            System.out.println("INGRESA LA VELOCIDAD EN KM/S A CONVERTIR");
            kmPorSeg = en.nextDouble();
            
            double m_h = 3600000 * kmPorSeg , m_s = 1000 * kmPorSeg;
            
            System.out.println(m_h +  "|" + m_s);
            
            
            
            
          return "" ;   
        } catch (Exception e) {
             return "ñ";
        }
      
    }

    // Solicitar al usuario ingresar una cantidad expresada en cc (centÃ­metros cÃºbicos) y devolver su cantidad en litros
    public static int convertirCcALitros(double cc) {
        try {
            Scanner en = new Scanner(System.in);
            cc = en.nextDouble();
            
            double litros = 0.001 * cc;
            
            System.out.println("LOS CC EN LT SON " + litros);
        } catch (Exception e) {
            return -1;
        }
        return 0;
    }

    // Solicitar al usuario ingresar una cantidad en dÃ³lares y convertirla a pesos segÃºn la TRM del dÃ­a
    public static int convertirDolaresAPesos(double dolares, double trm) {
        try {
            Scanner en = new Scanner(System.in);
            System.out.println("ingresa los dolares a convertir");
            dolares = en.nextDouble();
            
            trm = 4.052;
            
            double conversion = dolares * trm ;
            
            System.out.println("los dolares que ingresastes a pesos COL es de " + conversion);
            
        } catch (Exception e) {
            return -1;
        }
        return 0;
    }

    // Solicitar al usuario ingresar la temperatura en grados centÃ­grados y convertirla en grados Fahrenheit 
    //(averiguar la fÃ³rmula) F = 32 + ( 9 * C / 5)
    public static int convertirCelsiusAFahrenheit(double celsius) {
        try {
            Scanner en = new Scanner(System.in);
            System.out.println("ingresa la cantidad de grados celsius a convertir");
            
            celsius = en.nextDouble();
            
            double conversion = 32 + (9 * celsius / 5);
            
            System.out.println(conversion);
            
        } catch (Exception e) {
            return -1;
        }
        return 0;
    }

    // Solicitar al usuario ingresar Nro de DÃ­as nro de horas nro de minutos y nro segundos y convertir todo a segundos.
    public static int convertirATotalSegundos(int dias, int horas, int minutos, int segundos) {
        try {
            Scanner en = new Scanner(System.in);
            System.out.println("ingresal la cantidad de dias");
            dias = en.nextInt();
            System.out.println("ingresa la cantidad de horas");
            horas = en.nextInt();
            System.out.println("ingresa la cantidad de segundos");
            segundos = en.nextInt();
            
            short operacion = (short)((dias * 24 * 60) + (horas * 60) + (segundos));
            
            System.out.println("numero de segundos" + operacion);
            
        } catch (Exception e) {
            return -1;
        }
        return 0;
    }

    // Un usuario tiene un sistema de bÃ¡scula para pesar camiones, dado el peso de un camiÃ³n debe sacar el peso neto de la carga en kilos y toneladas
    // retorne el valor en formato string (pesoEnKg + "|" + pesoEnToneladas)
    public static String calcularPesoNeto(double peso) {
        try {
            //peso camion 5000 kg sin carga
            
           double camion = 80000;
           peso = camion - 5000;
           double tonelada = peso /1000;
            System.out.println(peso + "|" + tonelada);
            
           
        } catch (Exception e) {
            return "0|0";
        }
        return "";
    }

    // DiseÃ±e un algoritmo que calcule el tiempo necesario para alcanzar un destino dado por el usuario quien ademÃ¡s ingresarÃ¡ 
    //la velocidad promedio en kilÃ³metros/hora y la distancia en kilÃ³metros
    public static int calcularTiempoViaje(double distancia, double velocidadKilometros, double velocidadHora) {
        try {
            Scanner en = new Scanner(System.in);
            System.out.println("ingresa la velocidad promedio");
            velocidadHora = en.nextDouble();
            System.out.println("ingersa la distancia");
            distancia = en.nextDouble();
            
            velocidadKilometros = (distancia / velocidadHora);
            
            System.out.println("el tiempo de llegada es " + velocidadKilometros);
        } catch (Exception e) {
            return -1;
        }
        return 0;
    }
    
    // Un aviÃ³n necesita cargar combustible para cubrir sus rutas programadas en el dÃ­a. Cada 0.2 
    //toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. En el despegue el aviÃ³n consume 1.2 toneladas de
    //combustible y en el aterrizaje consume 0.4 toneladas. El piloto desea un algoritmo que ingresando 4 rutas y el kilometraje de cada ruta
    //obtenga la cantidad de combustible que debe tanquear en el aviÃ³n.
    public static int calcularCombustible(double ruta1, double ruta2, double ruta3, double ruta4) {
        //este ejercicio ya lo tenia hecho pero con funciones incluidas
        try {
            /*public class COMBUSTIBLE_AVION {

    public static int SumaD(long DESTINO_1, long DESTINO_2, long DESTINO_3, long DESTINO_4) {
        try {
            long SumaDistancias = DESTINO_1 + DESTINO_2 + DESTINO_3 + DESTINO_4;

            return (int) SumaDistancias;
        } catch (Exception error) {
            return -1;
        }
    }

    public static float COMBUSTIBLE_O(int SUMA_DIS, float CONS_1, float CONS_2) {
        try {
            double OPERACION_FINAL = ((SUMA_DIS * CONS_2) + CONS_1);
            return (float) OPERACION_FINAL;
        } catch (Exception error) {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner en = new Scanner(System.in);
        try {
            long DESTINO_1 = 0, DESTINO_2 = 0, DESTINO_3 = 0, DESTINO_4 = 0;

            String D1 = "", D2 = "", D3 = "", D4 = "";

            float Constante1 = 6.4f, constante2 = 3.29f;

            float SUMA_DISTANCIASS = 0, OPERACION_FINAL = 0;

            //Datos de entrada
            System.out.println("INGRESA EL NOMBRE DEL DESTINO #1");
            D1 = en.nextLine();

            System.out.println("INGRESA LA DISTANCIA DEL DESTINO #1");
            DESTINO_1 = en.nextLong();
            
            
            
            System.out.println("INGRESA EL NOMBRE DEL DESTINO #2");
            D2 = en.nextLine();
            D2 = en.nextLine();

            System.out.println("INGRESA LA DISTANCIA DEL DESTINO #2");
            DESTINO_2 = en.nextLong();

            System.out.println("INGRESA EL NOMBRE DEL DESTINO #3");
            D3 = en.nextLine();
            D3 = en.nextLine();

            System.out.println("INGRESA LA DISTANCIA DEL DESTINO #3");
            DESTINO_3 = en.nextLong();

            System.out.println("INGRESA EL NOMBRE DEL DESTINO #4");
            D4 = en.nextLine();
            D4 = en.nextLine();

            System.out.println("INGRESA LA DISTANCIA DEL DESTINO #4");
            DESTINO_4 = en.nextLong();

            //OPERACION
            SUMA_DISTANCIASS = SumaD(DESTINO_1, DESTINO_2, DESTINO_3, DESTINO_4);

            OPERACION_FINAL = COMBUSTIBLE_O((int) SUMA_DISTANCIASS, Constante1, constante2);

            //MENSAJE DE SALIDA
            System.out.println("TU PRIMER DESTINO ES " + D1 + " Y  LA DISTANCIA ES DE " + DESTINO_1);
            System.out.println("");
            System.out.println("TU PRIMER DESTINO ES " + D2 + " Y  LA DISTANCIA ES DE " + DESTINO_2);
            System.out.println("");
            System.out.println("TU PRIMER DESTINO ES " + D3 + " Y  LA DISTANCIA ES DE " + DESTINO_3);
            System.out.println("");
            System.out.println("TU PRIMER DESTINO ES " + D4 + " Y  LA DISTANCIA ES DE " + DESTINO_4);
            System.out.println("");
            System.out.println("EL COMBUSTIBLE TOTAL PARA EL VIAJE ES DE " + OPERACION_FINAL);

        } catch (Exception error) {
            System.out.println("********************");
            System.out.println("*ERROR DEL PROGRAMA*" + error);
            System.out.println("********************");
        }

    }

}
*/
            
        } catch (Exception e) {
            return -1;
        }
        return 0;
    }

    // DiseÃ±ar un algoritmo que calcule el peso neto en la luna de un peso terrestre ingresado por teclado. 
    //La gravedad de la Luna es de alrededor del 17% mÃ¡s que la de la tierra
    public static int calcularPesoLunar(double pesoTierra) {
        try {
            // LÃ³gica interna
        } catch (Exception e) {
            return -1;
        }
        return 0;
    }

    // DiseÃ±ar un algoritmo que calcule el saldo que debe haber en una taquilla de un banco. 
    //El cajero deberÃ¡ ingresar la base el total de recaudos y el total de retiros
    public static int calcularSaldoTaquilla(double base, double ingresos, double retiros) {
        try {
            // LÃ³gica interna
        } catch (Exception e) {
            return -1;
        }
        return 0;
    }

    // DiseÃ±e un algoritmo para calcular la propina en un restaurante(10%) el impuesto al consumo (8%) y el valor final que deberÃ¡ pagar ingresando el valor de la comida.
    // retorne el valor en formato string (propina + "|" + impuesto + "|" + total)
    public static String calcularCuentaRestaurante(double costoComida) {
        try {
            // LÃ³gica interna
        } catch (Exception e) {
            return -1 + "|" + -1 + "|" + -1;
        }
        return "";
    }

    // DiseÃ±ar un algoritmo que obtenga los puntos finales de un equipo de fÃºtbol (puntuaciÃ³n segÃºn lineamientos de Fifa) a partir de los datos ingresados por teclado: NÃºmero de partidos ganados nÃºmero de partidos perdidos nÃºmero de partidos empatados.
    public static int calcularPuntosFutbol(int ganados, int perdidos, int empatados) {
        try {
            // LÃ³gica interna
        } catch (Exception e) {
            return -1;
        }
        return 0;
    }

    // Elaborar un algoritmo que dadas todas las 5 notas y los 5 porcentajes para una materia calcule la nota final.
    public static int calcularNotaFinal(double nota1, double nota2, double nota3, double nota4, double nota5,
                                        double porcentaje1, double porcentaje2, double porcentaje3, double porcentaje4, double porcentaje5) {
        try {
            // LÃ³gica interna
        } catch (Exception e) {
            return -1;
        }
        return 0;
    }

    // Elaborar un algoritmo que dados los 5 porcentajes de una materia y las 4 primeras notas calcule cuÃ¡nto tiene que sacar
    //para ganar si el puntaje mÃ­nimo es 3.
    public static int calcularNotaNecesaria(double porcentaje1, double porcentaje2, double porcentaje3, double porcentaje4, double porcentaje5, double nota1, double nota2, double nota3, double nota4) {
        try {
            // LÃ³gica interna
        } catch (Exception e) {
            return -1;
        }
        return 0;
    }

    /* Se requiere un algoritmo para calcular el salario a pagar a un trabajador con los siguientes datos ingresados por teclado: 
    //cantidad de horas normales laboradas cantidad de horas extras diurnas laboradas cantidad de horas extras nocturnas laboradas valor 
    //de la hora normal. El valor de las horas extras diurnas tienen un recargo adicional del 15% sobre la hora normal. 
    El valor de las horas extras nocturnas tienen un recargo adicional del 35% sobre la hora normal.
    */
    public static int calcularSalario(int horasNormales, int horasExtrasDiurnas, int horasExtrasNocturnas, double valorHoraNormal) {
        try {
            // LÃ³gica interna
        } catch (Exception e) {
            return -1;
        }
        return 0;
    }

    // DiseÃ±e un algoritmo que calcule el Ã¡rea de un triÃ¡ngulo rectÃ¡ngulo.
    public static int calcularAreaTriangulo(double base, double altura) {
        try {
            base = 150 ;
            altura = 360 ;
            
            double Area = (base * altura) / 2;
            
            return (int)Area;
            
        } catch (Exception e) {
            return -1;
        }
        
    }

    // DiseÃ±e un algoritmo que calcule el perÃ­metro de un cuadrado.
    public static int calcularPerimetroCuadrado(double lado) {
        try {
            Scanner en = new Scanner(System.in);
            
            System.out.println("INGRESA EL NUMERO QUE MIDE UN LADO DEL CUADRADO");
            lado = en.nextDouble();
            
            double Perimetro = lado * 4;
            
            return (int)Perimetro;
        } catch (Exception e) {
            return -1;
        }
        
    }

    // DiseÃ±e un algoritmo que calcule el volumen de un cilindro.
    public static int calcularVolumenCilindro(double radio, double altura) {
        try {
            radio = 0 ;
            altura = 0 ;
            
            double Volumen = 3.14 * (radio * radio) * altura ;
            
            System.out.println("EL VOLUMEN DEL CILINDRO ES :" + Volumen);
            return 0;
        } catch (Exception e) {
           return -1;
        }
        
    }

    // DiseÃ±e un algoritmo que calcule el Ã¡rea del cÃ­rculo. El radio se pide por teclado.
    public static int calcularAreaCirculo(double radio) {
        try {
            Scanner en = new Scanner(System.in);
            radio = en.nextDouble();
            
            double AreaCirculo = 3.14 * (radio * radio);
            
            System.out.println("EL AREA DEL CIRCULO ES : " + AreaCirculo);
            
            return (int)AreaCirculo;
        } catch (Exception e) {
            return -1;
        }
        
    }

    public static void main(String[] args) {
    
     
     
     
     
     
     
        
    }
}
