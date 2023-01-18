
     public class Rational {
        private int numerator;
        private int denominator; 
     
        public Rational() {
            this.numerator = 1;
            this.denominator = 1;
        }
     
         @param numerator
         
        public Rational(int numerator) {
            this.numerator = numerator;
            this.denominator = 1;
        }
     
        /**
         * Констуктор с параметрами с явной проверкой на ноль
         *
         * @param numerator Числитель
         * @param denominator - Знаменатель
         */
        public Rational(int numerator, int denominator) {
            if (denominator == 0) {
                throw new ArithmeticException("Знаменатель не может быть равен нулю");
            }
            this.numerator = numerator;
            this.denominator = denominator;
        }
     
           public int getNumerator() {
            return numerator;
        }
        
        public void setNumerator(int numerator) {
            this.numerator = numerator;
        }
     
        public int getDenominator() {
            return denominator;
        }
     
        public void setDenominator(int denominator) {
            if (denominator == 0) {
                throw new ArithmeticException("Знаменатель не может быть равен нулю");
            }
            this.denominator = denominator;
        }
     
        
        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }
     
        