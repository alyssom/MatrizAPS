import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

	public class matrizVetor{
		
		public void lerArq(){
		//int m [][] = new int[0][0];
		try {
	    FileReader arq = new FileReader("C:\\dados.txt"); // abre o arquivo.
		BufferedReader lerCont = new BufferedReader(arq); // le o conteudo de arquivo.
		
		 
		String linha = lerCont.readLine();
		
		//le primeira linha
		String a = linha.substring(0,1);//substring da primeira linha(Tamanho linha);
		String b = linha.substring(2,3);//substring da primeira linha(Tamanho coluna);
		
		int l = Integer.parseInt(a);//Convertendo para Int;
		int c = Integer.parseInt(b);//Convertendo para Int;
		
		char m [][] = new char[l][c];//Criando a matriz de acordo com o tamanho ;
		linha = lerCont.readLine();//oular para segunda linha;
		
		int contLinha = 0;
		
		while (linha != null){
			
			char[] valorLinha = new char[c];//array de char da linha 1;
			valorLinha = linha.toCharArray();//separando por character os valores da linha;
			
			//Preenche cada linha da matriz
			for(int i = 0; i < valorLinha.length; i++){
				m[contLinha][i] = valorLinha[i];
			}
			
			contLinha++;
			
			linha = lerCont.readLine();

			//Enquanto a linha não for vazia vai lendo...
			
		}
		
		//Printando a matriz
		for(int i = 0; i < m.length; i++){
			
			for(int j = 0; j < c; j++){
				System.out.print(m[i][j] + "|");
			}
			
			System.out.println("\n");
		}
		
		arq.close();
		
		String conteudo = linha;
		
		
		} catch (IOException e){
			System.err.printf("Erro na abertura do arquivo: \n");
		}
	}
	}

	