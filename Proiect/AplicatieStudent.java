import java.util.Scanner;

public class AplicatieStudent {
    public static void main (String args[])
    {
        int index = 0;
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        Animal[] animale;
        animale = new Animal[20];

        /*  Exemplu de instantiere obiect
        Animal a1 = new Animal("Caine", 6, true);
        a1.numeProprietar = "Marcel";

        System.out.println(a1.toString());*/

        while(isRunning == true)
        {
            System.out.println("0 - Iesire din aplicatie");
            System.out.println("1 - Introdu Animal");
            System.out.println("2 - Afisati Animale Create");
            System.out.println("3 - Media Varstelor Animalelor");
            System.out.println("Selectati o optiune");
            int meniu = sc.nextInt();

            switch(meniu)
            {
                case 0: //Iesire din aplicatie
                    isRunning = false;
                break;

                case 1:                             //Introducere Animal, creem un obiect animal gol cu constructorul implicit
                    Animal animal = new Animal();   
                    animale[index] = animal.CreateAnimal(); //Apoi creem animalul si il introducem in tabloul animale
                    System.out.println("Animalul creat este: " + animal.toString()); //Afisam animalul creat
                    index++; // Crestem indexul pentru urmatorul animal ce va fi creat
                break;

                case 2:      //Afisam toate animalele din tabloul Animale          
                    if(index != 0)               
                        for(int i = 0; i < index; i++)
                        {
                            System.out.println("Animalul numarul " + i + ":  " + animale[i].toString());
                        } 
                    else
                    System.out.println("NU EXISTA NICI UN ANIMAL IN DATABASE");
                break;

                case 3:      //Calculam media folosindu-ne de variabila index si de getter-ul de varsta       
                    int medie = 0;
                    for(int i = 0; i < index; i++)
                    {
                        medie += animale[i].getVarsta();
                    } 
                    if(index != 0)
                    medie = medie/index;
                    else
                    System.out.println("NU EXISTA NICI UN ANIMAL IN DATABASE");
                    System.out.println("Media varstelor este: " + medie);
                break;

                default: //Optiune gresita
                    System.out.println("Optiunea nu exista");  
                break;
            }
            System.out.println("----------------");  
            
        }
        
         sc.close(); 
    }
}
