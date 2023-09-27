package LabHw4_INES_3BSCS1_FactoryPattern;
public class Dog implements Pet
{
    private String breed;
    public String getBreed()
    {
        return breed;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    @Override
    public String makeSound()
    {
        return "Aw,aw!";
    }
    @Override
    public String play()
    {
        return "Playing fetch!";
    }
}
