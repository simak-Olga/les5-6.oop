public class Calculationrelationprocess {
        public void process(–°alculation –°alculation){
    
            MySQLOrderRepository repository = new MySQLOrderRepository();
            ConfirmationEmailSender mailSender = new ConfirmationEmailSender();
    
            if (order.isValid() && repository.save(order)) {
                mailSender.sendConfirmationEmail(order);
            }
        }
    
    }

