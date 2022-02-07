package com.ej09guia7;

    public class Matematica {
        private double num1;
        private double num2;

        public Matematica() {
        }

        public Matematica(double num1, double num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        public double getNum1() {
            return num1;
        }

        public void setNum1(double num1) {
            this.num1 = num1;
        }

        public double getNum2() {
            return num2;
        }

        public void setNum2(double num2) {
            this.num2 = num2;
        }


        public double devolverMayor() {
            return Math.round(Math.max(num1, num2));
        }



        public void calcularPotencia() {

            System.out.println("El número aleatorio mayor es " + devolverMayor());
            double numMenor = Math.round(Math.min(num1, num2));
            System.out.println("El número aleatorio menor es " + numMenor);
            System.out.printf("La potencia del número mayor elevado al número menor es %.2f%n", Math.pow(devolverMayor(), numMenor));
        }

        public void calcularRaiz() {
            double numMenor = Math.round(Math.min(num1, num2));
            System.out.printf("La raiz cuadrada del menor de los dos valores es %.2f%n", Math.sqrt(Math.abs(numMenor)));


        }
    }

