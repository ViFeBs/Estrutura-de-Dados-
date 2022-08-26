public class Zoo {
    private Animal zoo[];

    //public Zoo(){}
    public Zoo(int qtdBicho){
        zoo = new Animal[qtdBicho];
    }

    public void setBicho(Animal bicho, int pos){
        this.zoo[pos] = bicho;
    }

    public void mostraAnimal(){
        for(int i = 0; i < zoo.length; i++){
            System.out.println("Animal: " + zoo[i].getNome() + "\n");
        }
    }

    public void contarTipo(int tipo){
        int mam=0,ave=0,rep=0,outro=0;
        for(int i = 0; i < zoo.length; i++){
            switch(tipo){

                case 1:
                    mam++;
                break;
                case 2:
                    ave++;
                break;
                case 3:
                    rep++;
                break;
                default: 
                    outro++;
            }
        }
        if(mam > ave){
            if(mam > rep){
                if(mam > outro){
                    System.out.println("Temos mais tipos Mamiferos: " + mam + " no Total.");
                }
            }
        }else if(ave > rep){
            if(ave > outro){
                System.out.println("Temos mais tipos Aves: " + ave + "no Total.");
            }
        }else if(rep > outro){
            
        }
    }
} 
