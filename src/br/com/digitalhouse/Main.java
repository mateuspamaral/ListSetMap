package br.com.digitalhouse;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Instanciando
        List<Pessoa> pessoas = new ArrayList<>();
        Set<Pessoa> pessoaSet = new HashSet<>();
        Map<String, Pessoa> pessoaMap = new HashMap<>();

        Pessoa mateus = new Pessoa("Mateus", "Amaral", 32);
        Pessoa carolina = new Pessoa("Carolina", "Meira", 30);
        Pessoa frederico = new Pessoa("Frederico", "Amaral", 29);

        //Adicionando ao array
        //List
        pessoas.add(mateus);
        pessoas.add(carolina);
        pessoas.add(frederico);

        //Set
        pessoaSet.add(mateus);
        pessoaSet.add(carolina);
        pessoaSet.add(frederico);
        pessoaSet.add(mateus);
        pessoaSet.add(mateus);

        //Map
        pessoaMap.put("Mateus", mateus);
        pessoaMap.put("Carolina", carolina);
        pessoaMap.put("Fred", frederico);

        //Print
        System.out.println("A GALERA!!\n");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome() + "\nIdade: " + pessoa.getIdade() + "\n");
        }

        System.out.println("A GALERA!!\n");
        for (Pessoa pessoa : pessoaSet) {
            System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome() + "\nIdade: " + pessoa.getIdade() + "\n");
        }

        System.out.println("A GALERA!!\n");
        for (String chave : pessoaMap.keySet()){
            System.out.println("Nome: " + pessoaMap.get(chave).getNome() + " " + pessoaMap.get(chave).getSobrenome() + "\nIdade: " + pessoaMap.get(chave).getIdade() + "\n");
        }
    }
}
