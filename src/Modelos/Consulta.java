/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Consulta {

    private int id;
    private String nome;
    private String telefone;
    private String cpf;
    private String idade;
    private String dataConsulta;
    private String jaEpaciente;
    private String consultaRealizada;
    
    protected static List<Consulta> consultas = new ArrayList<>();
 

    public Consulta() {
    }
    
    

    public Consulta(String nome, String telefone, String cpf, String dataConsulta, String jaEpaciente) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.dataConsulta = dataConsulta;
        this.jaEpaciente = jaEpaciente;
    }

    public Consulta(String nome, String telefone, String cpf, String dataConsulta, String jaEpaciente, String consultaRealizada) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.dataConsulta = dataConsulta;
        this.jaEpaciente = jaEpaciente;
        this.consultaRealizada = consultaRealizada;
    }
    
    
    

    public String getConsultaRealizada() {
        return consultaRealizada;
    }

    public void setConsultaRealizada(String consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }

   

  

    public static List<Consulta> getConsultas() {
        return consultas;
    }

    

    public String getJaEpaciente() {
        return jaEpaciente;
    }

    public void setJaEpaciente(String jaEpaciente) {
        this.jaEpaciente = jaEpaciente;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
    
    

    @Override
    public String toString() {
        return "Consulta {"
                
                + ", nome='" + nome + '\''
                + ", telefone='" + telefone + '\''
                + ", cpf='" + cpf + '\''
                + ", dataConsulta='" + dataConsulta + '\''
                + ", jaEpaciente='" + jaEpaciente + '\''
                + '}';
    }
    
 public void addConsulta(Consulta consulta){
     consultas.add(consulta);
 }  
 
 

}
