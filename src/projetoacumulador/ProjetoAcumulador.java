package projetoacumulador;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class ProjetoAcumulador {

    public static void main(String[] args) {
       // vamos criar um controle de mesada
          Scanner ler = new Scanner(System.in);
       double mesada, valor, acumulador=0;
       int cont=1;
       mesada = 300;
       while(cont!=0){
           System.out.println("Digite 1 para lançar o gasto ou zero pra sair:");
           cont = ler.nextInt();
           if(cont!=0){
           System.out.println("Informe o valor do gasto:");
           valor = ler.nextDouble();
           if (valor< 0 ||  valor>mesada){
               System.out.println("Impossivel gastar esse valor! ou vc está trapaceando seu usurio xiruzão");
           }else{           
           acumulador = acumulador + valor;
           mesada = mesada - valor;
           System.out.println("Valor total gasto R$"+acumulador);
           System.out.println("Valor restante da mesada R$"+mesada);
           }
           }//fim do if
       }//fim do loop
           System.out.println("Bye!!!!");
           System.out.println("Valor final gasto R$"+acumulador);
           System.out.println("Valor restante da mesada R$"+mesada);
       }
}
