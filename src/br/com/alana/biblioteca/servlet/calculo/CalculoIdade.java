package br.com.alana.biblioteca.servlet.calculo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import javax.servlet.http.HttpServlet;

public class CalculoIdade extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o dia do seu aniversario: ");
		String data1 = ler.next();
		// String data1 = JOptionPane.showMessageDialog(null, "Digite a data do seu
		// aniversario:");
		LocalDate date1 = LocalDate.parse(data1, formato);
		LocalDate date2 = LocalDate.now();

		long dataAniver = ChronoUnit.YEARS.between(date1, date2);

		if (dataAniver > 0) {
			System.out.println("Voce tem " + dataAniver + " anos!");
		} else {
			System.out.println("Voce tem " + dataAniver * -1 + " anos!");
		}
	}
}