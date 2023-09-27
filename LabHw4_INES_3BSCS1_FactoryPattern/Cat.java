package LabHw4_INES_3BSCS1_FactoryPattern;
public class Cat implements Pet
{
    private Integer noOfLives;
    public Integer getNoOfLives()
    {
        return noOfLives;
    }
    public void setNoOfLives(Integer noOfLives)
    {
        this.noOfLives = noOfLives;
    }

    @Override
    public String makeSound()
    {
        return "Meow!";
    }
    @Override
    public String play()
    {
        return "Catching moving objects!";
    }
}
