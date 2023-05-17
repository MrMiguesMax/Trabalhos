package Entidades;

public enum Disciplinas {
	FPOO ("Fundamentos de Programação Orientada a Objetos"),
	LM ("Linguagem de Marcação"),
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
