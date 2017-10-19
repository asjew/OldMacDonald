class Farm 
{     
   private Animal[] aBunchofAnimals = new Animal[3];
   public Farm()
   {
   	aBunchofAnimals[0] = new NamedCow("Dian","Cow", "Mooo");
   	aBunchofAnimals[1] = new Chick("Chick", "Jikjik");
   	aBunchofAnimals[2] = new Pig("Pig", "Oink oink");
   }
   public void animalSounds()
   {
   	for (int i = 0; i < aBunchofAnimals.length; i++)
   	{
   		System.out.println(aBunchofAnimals[i].getType() + " goes " + (aBunchofAnimals[i].getSound()));
   	}
   		System.out.println("The cow is known as " + ((NamedCow)aBunchofAnimals[0]).getName());
   }
  
}
