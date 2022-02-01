
package br.edu.infnet.infra;

import br.edu.infnet.domain.Contato;
import java.util.ArrayList;
import java.util.HashMap;


public class ContatoRepository {
    
    private HashMap<Integer, Contato> contatos = new HashMap<>();
    
    public ArrayList<Contato> listarContatos(){
        
        return new ArrayList(contatos.values());
    }
    
    public void inserirContato(Contato contato) {
        
        if(contato.getId() == 0){
            
            int id = contatos.values().size() + 1;
            contato.setId(id);
            contatos.put(id, contato);
        }
    }
    
    public Contato obterContato(int id){
        
        return contatos.get(id);
    }
    
}
