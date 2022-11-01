import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,"Máquina de bebidas do Oiapoque.");
    double troco = 0;
    double valorPago = 0;
    double valorTot = 0;
    int opcao = 0; 
    double coca = 4.00;
    double guarana = 3.50;
    double brahma = 4.50;
    double skol = 4.50;
    double monster = 6.00;
    while ((opcao != 6) && (opcao != 7)) {
    opcao = Integer.parseInt(JOptionPane.showInputDialog("[1] Coca-cola 350ml:     R$" + coca + "\n[2] Guaraná 350ml:       R$" + guarana + "\n[3] Brahma 350ml:         R$" + brahma + "\n[4] Skol 350 ml:              R$" + skol + "\n[5] Monster 350ml:        R$" + monster + "\n[6] Finalizar compra.\n[7] Cancelar.\n         Valor Total:  R$" + valorTot)); 
      switch (opcao) {
        case 1:
          valorTot += coca;
        break;
        case 2:
          valorTot += guarana;
        break;
        case 3:
          valorTot += brahma;
        break;
        case 4:
          valorTot += skol;
        break;
        case 5:
          valorTot += monster;
        break;
        case 6:
          break;
        case 7:
          break;
        default:
          JOptionPane.showMessageDialog(null, "Por favor, escolha uma opção de [1] a [7].");
          
      }
    }
    
    if ((opcao == 6) && (valorTot != 0)) {
    valorPago = Double.parseDouble(JOptionPane.showInputDialog("Total a ser cobrado: R$" + valorTot + "\nInforme o valor do pagamento: "));
      
       while (valorPago != valorTot) {
        JOptionPane.showMessageDialog(null,"Processando...");
        if (valorPago < 0) {
          JOptionPane.showMessageDialog(null,"Erro!\nInforme um pagamento válido.");
          valorPago = 0;
        }
         else if (valorPago > valorTot) {
        troco = valorPago - valorTot; 
          JOptionPane.showMessageDialog(null,"Valor total:    R$" + valorTot + "\nValor pago:   R$" + valorPago + "\nTroco:             R$" + troco);
        valorPago = valorTot;
      }
      else if (valorPago < valorTot) {
        valorPago += Double.parseDouble(JOptionPane.showInputDialog(null,"Valor total:            R$" + valorTot + "\nValor pago:            R$" + valorPago + "\nValor pendente:    R$" + (valorTot - valorPago) + "\nInforme o valor do pagamento:"));
      }

        
      }   
      if (valorPago == valorTot) {
       JOptionPane.showMessageDialog(null, "Finalizando...");
       JOptionPane.showMessageDialog(null, "Compra concluída!\nObrigado pela preferência. <3");
        
      }
      
    }
    else if ((opcao == 7) || ((opcao == 6) && (valorTot == 0))) {
      JOptionPane.showMessageDialog(null,"Compra cancelada.");
    }

    }
    
  }