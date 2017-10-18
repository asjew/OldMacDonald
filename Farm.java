class Farm 
{     
   private Animal[] aBunchofAnimals = new Animal[3];
   public Farm()
   {
   	aBunchofAnimals[0] = new Chick("Chick", "Jikjik");
   	aBunchofAnimals[1] = new Cow("Cow", "Mooo");
   	aBunchofAnimals[2] = new Pig("Pig", "Oink oink");
   }
   public void animalSounds()
   {
   	for (int i = 0; i < aBunchofAnimals.length; i++)
   	{
   		System.out.println(aBunchofAnimals[i].getType());
   	}
   		System.out.println( "The cow is known as" + ((NamedCow)aBunchofAnimals[1].getName()));
   }
  
}
