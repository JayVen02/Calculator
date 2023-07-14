import javax.swing.JOptionPane;

public class CalculatorJoptionPane {

	public static void main(String[] args) {
		
		String operator;
		int num1, num2, result;
		
		operator = JOptionPane.showInputDialog("Choose an Operator: ");
		
		int Number1, Number2;
		Number1 = JOptionPane.showInputDialog("Number: ");
		Number2 = JOptionPane.showInputDialog("Number: ");
		
		switch(operator) {
		
		case '+':
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	      case '-':
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	      case '*':
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;
	        
	      case '/':
	          result = num1 / num2;
	          System.out.println(num1 + " / " + num2 + " = " + result);
	          break;
	          
	          default:
	        	  System.out.println("Invalid");
	        	  break;
	        	  
	        	  JOptionPane.showMessageDialog(null, args, operator, result, null);
	        	  {
	        		  System.exit(0);
	        	  }
		

		
		

	}

}
}
