import java.util.Scanner;

class Animal
{
    //Clasa Animal stocheaza date despre un animal in diferite proprietati
    private String specie;
    public  String numeProprietar;
    private int varsta;
    private boolean esteDomestic;

    //Constructor implicit, instantiaza obiectul cu proprietati goale
    public Animal ()
    {
        specie = "Necunoscut";
        numeProprietar = "Nu exista";
        varsta = -1;
        esteDomestic = false;
    }

    //Constructor ce ia date de intrare si seteaza starea obiectului
    public Animal (String specie, int varsta, boolean esteDomestic)
    {
        this.specie = specie;
        this.varsta = varsta;
        this.esteDomestic = esteDomestic;
    }

    //Setter pentru Specia animalului
    public void setSpecie(String specie)
    {
        this.specie = specie;
    }

    //Setter pentru Varsta animalului
    public void setVarsta(int varsta)
    {
        this.varsta = varsta;
    }

    //Setter pentru domesticitatea animalului
    public void setEsteDomestic(boolean esteDomestic)
    {
        this.esteDomestic = esteDomestic;
    }

    //Getter pentru Specia animalului
    public String getSpecie()
    {
        return specie;
    }

    //Getter pentru varsta animalului
    public int getVarsta()
    {
        return varsta;
    }

    //Getter pentru domesticitatea animalului
    public boolean getEsteDomestic()
    {
        return esteDomestic;
    }

    //Returneaza starea obiectului sub forma de string
    public String toString()
    {
        String msg;
        msg = "Specia este "+ specie + " | Varsta este: " + varsta;
        if(esteDomestic == true)
        msg = msg + " | Este domestic ";
        else 
        msg = msg + " | Nu este domestic ";

        if(numeProprietar != "Nu exista")
        msg = msg + "| Numele Proprietarului: " + numeProprietar;
        
        return msg;
    }

    //Initializeaza un obiect de tip Animal, cere user-ului informatii
    //pentru a definii starea acestuia, iar apoi returneaza obiectul creat
    public Animal CreateAnimal()
    {
        boolean isCorrect = false;
        Scanner sc = new Scanner (System.in);

        System.out.println("Specie:");
        String s = sc.nextLine();
        specie = s;

        System.out.println("Varsta:");
        int n = sc.nextInt();
        varsta = n;

        s = sc.nextLine();
        while(isCorrect == false)
        {
        System.out.println("Este domestic?(DA/NU)");
        s = sc.nextLine();  
        if((s.contains("DA")&& !s.contains("NU")) || (!s.contains("DA")&& s.contains("NU")))
            {
                isCorrect = true;
            }
        else
            {
                System.out.println("Introdu DA sau NU!");
            }
        }

        if(s.contains("DA"))
            esteDomestic = true;
        else 
            esteDomestic = false;

        isCorrect = false;    
        while(isCorrect == false)
        {
        System.out.println("Animalul are proprietar?(DA/NU)");
        s = sc.nextLine(); 
        if((s.contains("DA")&& !s.contains("NU")) || (!s.contains("DA")&& s.contains("NU")))
            {
                isCorrect = true;
            }
        else
            {
                System.out.println("Introdu DA sau NU!");
            }
        }

        if(s.contains("DA"))
        {
            System.out.println("Introdu numele proprietarului:");
            s = sc.nextLine();
            numeProprietar = s;
        }
        else 
        numeProprietar = "Nu exista";

        return this;
    }
}