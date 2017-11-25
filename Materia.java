package classes;

public class Materia {

    private int id;
    private String nome;
    private String p;
    private int id_prof;
    private int qntd_aula;
    private boolean lab;
    private boolean semestral;
    
    public Materia(){
        this.id = id;
        this.nome = nome;
        this.p = p;
        this.id_prof = id_prof;
        this.qntd_aula = qntd_aula;
        this.lab = lab;
        this.semestral = semestral;
    }

    public boolean isSemestral() {
        return semestral;
    }

    public void setSemestral(boolean semestral) {
        this.semestral = semestral;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public int getId_prof() {
        return id_prof;
    }

    public void setId_prof(int id_prof) {
        this.id_prof = id_prof;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getQntd_aula() {
        return qntd_aula;
    }

    public void setQntd_aula(int qntd_aula) {
        this.qntd_aula = qntd_aula;
    }

    public boolean isLab() {
        return lab;
    }

    public void setLab(boolean lab) {
        this.lab = lab;
    }
}
