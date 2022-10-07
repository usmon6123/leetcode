package uz.leetcode.demo;

public class AntennalardanAmaliy2 {
    public static void main(String[] args) {
        double rMin = 0, rMax = 0, gammaMin = 0, gammaMax = 0,rR=0,fMin=0,fMax=0,E0=0;
        double h1 = 235, h2 = 6,e=4, p1 = 20, gI = 7.8, f = 77.25, dNdH = -0.02;
        double alfa = 300/f, eK = 0;

        E0 = 173*Math.sqrt(p1*gI);
        eK = Math.sqrt(e*e + Math.pow((60*alfa*0.001),2));
        System.out.println("eK = " + eK);

        for (int N = 1; N <= 3; N++) {
            System.out.println("------------- N = " + N + " ----------------");

            rMin = 2 * h1 * h2 / (alfa * (N + 1));
            System.out.println("rMin = " + rMin);

            gammaMin = Math.atan((h1 + h2) / rMin);
            System.out.println("gammaMin = " + gammaMin);

            rMax = 4 * h1 * h2 / (alfa * (2 * N + 1));
            System.out.println("rMax = " + rMax);

            gammaMax = Math.atan((h1 + h2) / rMax);
            System.out.println("gammaMax = " + gammaMax);



            rR = (Math.sin(gammaMax) - Math.sqrt(eK-Math.cos(gammaMax)*Math.cos(gammaMax)))/
                    (Math.sin(gammaMax) + Math.sqrt(eK-Math.cos(gammaMax)));

            System.out.println("rR Max = " + rR);

            fMax = 1 + rR;
            System.out.println("fMax = "+ fMax);

            rR = (Math.sin(gammaMin) - Math.sqrt(eK-Math.cos(gammaMin)*Math.cos(gammaMin)))/
                    (Math.sin(gammaMin) + Math.sqrt(eK-Math.cos(gammaMin)));

            System.out.println("rR Min = " + rR);

            rMin = 1 - rR;
            System.out.println("rMin = "+ rMin);


        }


    }
}
