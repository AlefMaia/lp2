public class Aluno{
	String nome,numeroMatricula;
	int idade;
	public void imprimirDadosCadastrais(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Numero Matricula: " + this.numeroMatricula);
	}
	public static void main(String [] args){
		Aluno Alef,Pedro,Leo,Paulo;
		Alef = new Aluno();
		Alef.nome="Alef";
		Alef.idade=16;
		Alef.numeroMatricula="201318110017";
		Alef.imprimirDadosCadastrais();

		Pedro = new Aluno();
		Pedro.nome="Pedro";
		Pedro.idade=16;
		Pedro.numeroMatricula="201318110018";
		Pedro.imprimirDadosCadastrais();

		Leo = new Aluno();
		Leo.nome="Leonardo";
		Leo.idade=17;
		Leo.numeroMatricula="201318110019";
		Leo.imprimirDadosCadastrais();

		Paulo = new Aluno();
		Paulo.nome="Paulo";
		Paulo.idade=17;
		Paulo.numeroMatricula="201318110020";
		Paulo.imprimirDadosCadastrais();
	}

}
