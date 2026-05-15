public enum rankingDeMissoes {
    D("baixo",2),
    C("medio",3),
    B("alto",4),
    A("muito alto",5),
    S("super alto",6);
    private  String descricao;
    private int dificuldade;

    rankingDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}



