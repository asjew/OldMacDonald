
public void setup()
{
  Chick hun = new Chick("Chick", "Jikjik");
  System.out.println(hun.getType() +" goes " + hun.getSound());
  Cow myeon = new Cow("Cow", "Mooo");
  System.out.println(myeon.getType() + " goes " + myeon.getSound());
  Pig byun = new Pig("Pig", "Oink oink");
  System.out.println(byun.getType() + " goes " + byun.getSound());
}

