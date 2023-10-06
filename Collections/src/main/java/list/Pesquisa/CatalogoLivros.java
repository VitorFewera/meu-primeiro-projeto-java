package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributos
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    //adicionar livro
    public void AdicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    /*Pesquisa por autor => Semelhante ao metodo de delete, do exemplo anterior, porem aqui ela gera uma lista de auto
    que corresponde a informação pesquisada
     */
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        //o metodo isEmpty retorna um boolean, verdadeiro ou false
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    //pesquisa por intervalo de anos
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        //o metodo isEmpty retorna um boolean, verdadeiro ou false
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.AdicionarLivro("Livro 1","Autor 1", 2020);
        catalogoLivros.AdicionarLivro("Livro 1","Autor 1", 2021);
        catalogoLivros.AdicionarLivro("livro 2", "Autor 2", 2022);
        catalogoLivros.AdicionarLivro("livro 3", "Autor 3", 2023);
        catalogoLivros.AdicionarLivro("livro 4", "Autor 4", 2024);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020,2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));



    }
}
