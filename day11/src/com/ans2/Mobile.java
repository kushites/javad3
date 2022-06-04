package com.ans2;

public class Mobile {
    void searchOutdatedModel(String company,String... model){
        String [] outdatedModel={"note4", "note5","note6","note7"};
        for(int i=0; i<outdatedModel.length; i++){
            for(int j=0; j< model.length; j++)
            if(outdatedModel[i]==model[j]){
                System.out.println(model[j]+"_OUTDATED");
            }
        }

    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.searchOutdatedModel("mi","note7","note5","note3");
    }
}
