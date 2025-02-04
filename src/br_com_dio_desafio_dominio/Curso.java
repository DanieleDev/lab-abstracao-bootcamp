package br_com_dio_desafio_dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;
    
    @Override
    public double calcularXP() {
        return XP_PADRAO + cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso [titulo: " + getTitulo() +
         ", descrição: " + getDescricao() +
         ", carga horaria: " + cargaHoraria + "]\n" ;
    }

    

    
}
