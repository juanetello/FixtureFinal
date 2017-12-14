/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanet
 */
public class Fixture {
    private List<Team> teams;

    public Fixture(List<Team> teams){
        this.teams = teams;
    }
    
    public List<Team> generate(){
        int auxT = teams.size();
        boolean impar = (auxt % 2 != 0);
        if (impar) {
            ++auxT;
        }
        int totalP = (auxT * (auxT -1)) /2;
        Team[] local = new Team[totalP];
        Team[] visitor = new Team[totalP];
        int modIF = (auxT / 2);
        int indiceInverso = auxT -2;
        for (int i = 0; i < totalP; i++) {
            if (i % modIF == 0) {
                if (impar) {
                    local[i] = null;
                    visitor[i] = null;
                } else {
                }
            }
        }
    }
    
}
