public class ExtendsCalculation extends CalculationProcessor {

        @Override
        public void process(Сalculation Сalculation) {
            super.process(Сalculation);
            afterProcessingСalculate();
        }
    
        private void afterProcessingCalculate() {
            // Осуществим некоторые дополнительные действия расчета на калькуляторе
        }
}
