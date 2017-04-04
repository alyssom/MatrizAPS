
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

	public class matrizVetor{
		
		char m [][];//Criando a matriz de acordo com o tamanho ;
		int l;
		int c;
		
		public void lerArq(){
		//int m [][] = new int[0][0];
		try {
	    FileReader arq = new FileReader("C:\\dados.txt"); // abre o arquivo.
		BufferedReader lerCont = new BufferedReader(arq); // le o conteudo de arquivo.
		
		String linha = lerCont.readLine();
		
		//le primeira linha
		String pLinha[] = new String[2];
		pLinha = linha.split(" ");
		
		
		 l = Integer.parseInt(pLinha[0]);//Convertendo para Int;
		 c = Integer.parseInt(pLinha[1]);//Convertendo para Int;
		char n[][] = new char[l][c];
		m = n;
		
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
		
		System.out.println("\n");
		
		arq.close();
		
		String conteudo = linha;
		
		
		} catch (IOException e){
			System.err.printf("Erro na abertura do arquivo: %s. \n");
		}
	}
		
		//troca valores de um para dois
		public void trocaUmDois(){
			char mUmDois [][] = m.clone();
			

			for(int i = 0; i < mUmDois.length; i++){
				
				for(int j = 0; j < c; j++){
					mUmDois[i][j] = m[i][j];
				}
            }
			
			for(int i = 0; i < mUmDois.length; i++){
				
				for(int j = 0; j < c; j++){
					if(mUmDois[i][j] == '1'){
						mUmDois[i][j] = '2';
					}
					System.out.print(mUmDois[i][j] + "|");
				}
				
				System.out.println("\n");
			}
			System.out.println("\n");
			
		}

		//troca valores de Zero para Dois
		public void trocaZeroDois() {
			char[][] mZeroDois = new char[l][c];
           
			
			for(int i = 0; i < mZeroDois.length; i++){
				
				for(int j = 0; j < c; j++){
					mZeroDois[i][j] = m[i][j];
				}
            }
            
            
			
			for(int i = 0; i < mZeroDois.length; i++){
				
				for(int j = 0; j < c; j++){
					if(mZeroDois[i][j] == '0'){
						mZeroDois[i][j] = '2';
					}
					System.out.print(mZeroDois[i][j] + "|");
				}
				
				System.out.println("\n");
			}
			System.out.println("\n");
			
			
		}
		
		
		
	}