package individual15;

import java.util.Scanner;

public class Individual15 {

	public static void main(String[] args) { 
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = 0, num2 = 0;
		String operador = null;
		boolean verificador = false;
		float resultado = 0f;
		
		
		while (!verificador) {
			
			try {
				System.out.println("Ingrese el primer número: ");
				num1 = scanner.nextInt();
				scanner.nextLine();
				verificador = true;
			} catch(Exception e){
				System.out.println("Por favor ingrese un número \n");	
				scanner.nextLine();
			}
		
		}
		
		verificador = false;
		
		while (!verificador) {
			
			try {
				System.out.println("Ingrese el segundo número: ");
				num2 = scanner.nextInt();
				scanner.nextLine();
				verificador = true;
			} catch(Exception e){
				System.out.println("Por favor ingrese un número \n");	
				scanner.nextLine();
			}
		
		}
		

		
		verificador = false;
		while (!verificador) {
			
			System.out.println("Ingrese el operador: \n");
			System.out.println("Suma = + ");
			System.out.println("Resta = - ");
			System.out.println("Multiplicación = x ");
			System.out.println("División = : ");
			System.out.println("Módulo = / ");
			operador = scanner.nextLine();
			
			if (operador.equals("+") || operador.equals("-") || operador.equals("x") || operador.equals(":") || operador.equals("/") ) {
				switch(operador) {
				case "+":
					resultado = num1 + num2;
					System.out.println("El resultado es: " + resultado);
					break;
				case "-":
					resultado = num1 - num2;
					System.out.println("El resultado es: " + resultado);
					break;
				case "x":
					resultado = num1 * num2;
					System.out.println("El resultado es: " + resultado);
					break;
				case ":":
					
					if (num2 == 0) {
						System.out.println("Error, el segundo número no puede ser cero");
						break;
					} else {
						resultado = num1 / num2;
						System.out.println("El resultado es: " + resultado);
						break;
					}

				case "/":
					resultado = num1 % num2;
					System.out.println("El resultado es: " + resultado);
					break;				
				}
			verificador = true;	
			} else {
				System.out.println("Por favor ingrese una opción indicada: \n");

			}
			
		}

		

		
		

		
	}
	
	
}
