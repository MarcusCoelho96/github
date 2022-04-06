import java.util.Scanner;
import java.util.Locale;
 /* C�digo de: Marcus Victor dos Santos Coelho - 20301 */

package nomeEscola;

public class portalProfessor {
	static Scanner scanner = new Scanner(System.in);
	static Locale ptBr = new Locale("pt", "BR");

    static double mediaNotas(double[][]notas, int qtdAlunos, int qtdNotas){
    double soma = 0, media = 0;
        for(int m=0; m<qtdAlunos; m++) {
    	soma = 0;
        media = 0;
    	    for(int n=0; n<qtdNotas; n++){
        	    soma += notas[m][n];
    		} 
    			media = soma / notas[m].length;
        		System.out.printf("A m�dia do %d� aluno �: %.1f\n", m + 1, media);
    	} 
    return media;
    }

	public static void main(String[] args) {
		//Vari�veis
		int escolha = 0, qtdAlunos = 1, qtdNotas = 1;
		double[][] notas;
		double media = 0, soma = 0;
    		//Quantidade de alunos, Para saber a quantidade de Linhas
    		System.out.println("Primeiro diga quantos alunos voc� tem?: ");
        	qtdAlunos = scanner.nextInt();
				System.out.println("Agora a quantidade de notas que seram inseridas")
				qtdNotas = scanner.nextInt();
        	notas = new double[qtdAlunos][qtdNotas];
        	//Menu
        	while(escolha != 9) {
	        	System.out.println("---------- Nome Escola | PORTAL DO PROFESSOR ----------");
	        	System.out.println("| 1 - Inserir notas || 2 - Visualizar notas || 3 - Calcular m�dia || 9 - Sair do sistema |");
	        	System.out.printf("Escolha uma op��o: ");
	        	escolha = scanner.nextInt();
		
			switch(escolha) {
    				case 1: //Inserir notas
            			System.out.println("Insira as notas abaixo ");
                        for(int i=0; i<notas.length; i++) {
                            System.out.printf("As notas do %d� aluno |\n", i + 1);
                            for(int j=0; j<notas[i].length; j++) {
                                System.out.printf("Digite a %d� nota: ", j + 1);
                                notas[i][j] = scanner.nextDouble();
                             }
                         }
			    	break;
    					case 2: //Visualizador de notas
    					    System.out.println("Aviso ao docente! Se alguma nota for menor que '3', ela ser� anulada.");
    					    System.out.println("---------- Visualizador de notas ----------");
	    					    for(int k=0; k<notas.length; k++){
								System.out.printf("notas do %dº Aluno \n", k + 1);
	    					        for(int l=0; l<notas[k].length; l++){
	    					        	if(notas[k][l] < 3){
	    							       notas[k][l] = 0;
	    							    }
	    					            System.out.println(notas[k][l]);
	    					        }
	    					        System.out.println(" ");
	    					    }
    					break;
    					    case 3: //Calcular m�dia
    					        System.out.println("---------- Calculo da m�dia ----------");
    					        mediaNotas(notas, qtdAlunos, qtdNotas);
    					    break;
    					        case 9: //saindo do sistema
    					            System.out.println("---------- Voc� saiu do sistema ----------");
    					        break;
			default: //quando o usu�rio inserir uma op��o que n�o tem "case"
			    System.out.println("---------- Erro, Insira uma op��o v�lida! ----------");
			} //switch (escolha)
		} //while
	} //main
} //class