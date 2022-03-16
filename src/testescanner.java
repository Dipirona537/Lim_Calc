import java.util.Scanner;

public class testescanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double xneg = x - 0.00001;
        double xpos = x + 0.00001;
        double lim1, lim2;
        // Limite de uma função simples
        // Exemplo 1
            lim1 = (Math.cbrt(xpos) - Math.cbrt(3)) / (xpos - 3);
            lim2 = (Math.cbrt(xneg) - Math.cbrt(3)) / (xneg - 3);

        //Exemplo 2
            //lim1 = (xpos + 1) / (1);
            //lim2 = (xneg + 1) / (1);

        //Limite de uma função mais complexa
            //lim1 = ((Math.pow(xpos, 2)/2 - 2)) / (xpos - 2);
            //lim2 = ((Math.pow(xneg, 2)/2 - 2)) / (xneg - 2);
            //lim1 = (Math.pow(xpos, 2)-(2*x)+1) / (xpos-1);
            //lim2 = (Math.pow(xneg, 2)-(2*x)+1) / (xneg-1);
            double lim = ((lim1+lim2)/2);
            if (x != 1) {
                System.out.println("Limite tende a " + lim + "\n" + lim1 + "\n" + lim2);
            }else {
                if (Math.round(lim1) == Math.round(lim2)) {
                    System.out.println("Limite tende a " + Math.round(lim1) + "\n" + lim1 + "\n" + lim2);
                }else
                {
                    lim = lim1/lim2;
                    System.out.println("Limite tende a " +lim + "\n" + lim1 + "\n" + lim2);
                }
            }
            if (Math.round(lim1) != Math.round(lim2)){
                System.out.println("Confira sua equacao, os limites sao diferentes. x != "+x);
            }


        }
    }
