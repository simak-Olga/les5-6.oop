public class Calculationrelationprocess {
        public void process(Сalculation Сalculation){
    
            MySQLOrderRepository repository = new MySQLOrderRepository();
            ConfirmationEmailSender mailSender = new ConfirmationEmailSender();
    
            if (order.isValid() && repository.save(order)) {
                mailSender.sendConfirmationEmail(order);
            }
        }
    
    }

