package Entidades;

public enum Disciplinas {
	FPOO ("Fundamentos de Programa��o Orientada a Objetos"),
	LM ("Linguagem de Marca��o"),
	SO ("Sistemas Operacionais"),
	HR ("Hardware e Redes");
	
	private String descricao;
	
	 	private Disciplinas (String descricao) {
	        this.descricao = descricao;
	    }

	    public String getDescricao() {
	        return descricao;
	    }
}
